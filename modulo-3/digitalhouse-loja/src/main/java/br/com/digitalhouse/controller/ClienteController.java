package br.com.digitalhouse.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.repository.ClienteRepository;
import br.com.digitalhouse.service.ClienteService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

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
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long id) {
		return clienteService.buscar(id);
	}
	
	@PostMapping
	public void salvar(@RequestBody Cliente cliente) {
		clienteService.salvar(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		clienteService.remover(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@RequestBody Cliente cliente, @PathVariable Long id) {
		clienteService.atualizar(cliente, id);	
	}
	
	@GetMapping("/{id}/telefones")
	public List<Telefone> buscarTelefonePorId(@PathVariable Long id) {
		return clienteService.buscarTelefonePorId(id);
	}

}
