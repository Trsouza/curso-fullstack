package br.com.digitalhouse.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.repository.CidadeRepository;
import br.com.digitalhouse.repository.ClienteRepository;
import br.com.digitalhouse.repository.EstadoRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;

	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	public List<Cliente> buscarNome2(String nome) {
		return clienteRepository.findByNome(nome);
	}

	public List<Cliente> buscarTodosMaioresIdade() {
		return clienteRepository.maiores();
	}

	public ResponseEntity<Cliente> buscar(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);

		if (cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}

		return ResponseEntity.notFound().build();
	}

	@Transactional
	public void salvar(Cliente cliente) {
//		cliente.getTelefone().stream().forEach(telefone -> telefone.setCliente(cliente));
		
//		for (Telefone t : cliente.getTelefone()) {
//			t.setCliente(cliente);
//		}
		estadoRepository.save(cliente.getEndereco().getCidade().getEstado());
	    cidadeRepository.save(cliente.getEndereco().getCidade());
		
		cliente.getTelefone().stream().
				forEach(telefone -> telefone.setCliente(cliente));
		
		
		clienteRepository.save(cliente);	
	}

	@Transactional
	public void remover(Long id) {
		clienteRepository.deleteById(id);
	}

	@Transactional
	public void atualizar(Cliente cliente, Long id) {
		Cliente cli = clienteRepository.findById(id).get();

		cli.setNome(cliente.getNome());
		cli.setSobrenome(cliente.getSobrenome());
		cli.setDataNasci(cliente.getDataNasci());
		cli.setEndereco(cliente.getEndereco());
		cli.setEmail(cliente.getEmail());

		for (Telefone t : cliente.getTelefone()) {
			t.setCliente(cli);
			cli.setTelefone(cliente.getTelefone());
		}

		cli.setRg(cliente.getRg());
		cli.setCpf(cliente.getCpf());

		clienteRepository.save(cli);
	}

	public List<Telefone> buscarTelefonePorId(Long id) {
		return clienteRepository.buscarTelefonePorId(id);
	}

}
