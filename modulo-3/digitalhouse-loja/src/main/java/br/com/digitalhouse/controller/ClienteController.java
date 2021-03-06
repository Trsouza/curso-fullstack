package br.com.digitalhouse.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.dto.ClienteDTO;
import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.open.api.ClienteControllerOpenAPI;
import br.com.digitalhouse.repository.ClienteRepository;
import br.com.digitalhouse.request.ClienteRequest;
import br.com.digitalhouse.service.ClienteService;
import io.swagger.annotations.Api;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cliente")
@Api(tags = "Controller de Cliente")
public class ClienteController implements ClienteControllerOpenAPI {
	
	@Autowired
	private ClienteService clienteService;


	@Override
	@GetMapping
	public List<Cliente> listar() {
		return clienteService.listar();
	}
	
//	@GetMapping("/tel")
//	public List<Cliente> listarTelefones() {
//		return clienteRepository.listarClientesTelefones();
//	}
	
//	@GetMapping("/nome/{nome}")
//	public List<Cliente> buscarNome(@PathVariable String nome) {
//		return clienteRepository.buscarNomeRepo(nome);
//	}
	
	@GetMapping("/nome/{nome}")
	public List<Cliente> buscarNome2(@PathVariable String nome) {
		return clienteService.buscarNome2(nome);
	}
	
	@GetMapping("/lista-maiores")
	public List<Cliente> buscarTodosMaioresIdade() {
		return clienteService.buscarTodosMaioresIdade();
	}
	
	@Override
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long id) {
		Optional<Cliente> cliente = clienteService.buscar(id);
	
		if (cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}

		return ResponseEntity.notFound().build();
	}
	
	@Override
	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody ClienteRequest clienteRequest) {
		try {
			ClienteDTO cliente = clienteService.salvar(clienteRequest);
			return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
		}catch(Exception ex){
			return  ResponseEntity.badRequest().body(ex.getMessage());
		}
	}
	
	@Override
	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> remover(@PathVariable Long id) {
		try {
			clienteService.remover(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
//		} catch (Exception e) {
//			return ResponseEntity.status(HttpStatus.CONFLICT).build();
//		}
	}
	
	@Override
	@PutMapping("/{id}")
	public ResponseEntity<?> atualizar(@RequestBody ClienteRequest cliente, @PathVariable Long id) {	
		Cliente clienteAtual = clienteService.buscar(id).orElse(null);
		
		if (clienteAtual != null) {
			BeanUtils.copyProperties(cliente, clienteAtual, "id");
			
			clienteService.atualizar(clienteAtual);
			return ResponseEntity.ok(clienteAtual);
		}		
		return ResponseEntity.notFound().build();
	}
	
	@Override
	@GetMapping("/{id}/telefones")
	public List<Telefone> buscarTelefonePorId(@PathVariable Long id) {
		return clienteService.buscarTelefonePorId(id);
	}

}
