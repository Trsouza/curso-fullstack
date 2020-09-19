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


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clientes")
public class ClienteController {


	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
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
		return clienteRepository.findByNome(nome);
	}
	
	@GetMapping("/lista-maiores")
	public List<Cliente> buscarTodosMaioresIdade() {
		return clienteRepository.maiores();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);

		if (cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}

		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public void salvar(@RequestBody Cliente cliente) {
		for(Telefone t : cliente.getTelefone()) {
			t.setCliente(cliente);
		}
		clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente cli = clienteRepository.findById(id).get();
		
		cli.setNome(cliente.getNome());
		cli.setSobrenome(cliente.getSobrenome());
		cli.setDataNasci(cliente.getDataNasci());
		cli.setEndereco(cliente.getEndereco());
		cli.setEmail(cliente.getEmail());
		
		for(Telefone t : cliente.getTelefone()) {
			t.setCliente(cli);
			cli.setTelefone(cliente.getTelefone());
		}
		
		cli.setRg(cliente.getRg());
		cli.setCpf(cliente.getCpf());
		
		clienteRepository.save(cli);		
	}

}
