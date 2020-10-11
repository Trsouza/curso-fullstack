package br.com.digitalhouse.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.dto.ClienteDTO;
import br.com.digitalhouse.exception.ClienteNaoEncontradodException;
import br.com.digitalhouse.mapper.ClienteMapper;
import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.repository.CidadeRepository;
import br.com.digitalhouse.repository.ClienteRepository;
import br.com.digitalhouse.repository.EstadoRepository;
import br.com.digitalhouse.request.ClienteRequest;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private ClienteMapper clienteMapper;

	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	public List<Cliente> buscarNome2(String nome) {
		return clienteRepository.findByNome(nome);
	}

	public List<Cliente> buscarTodosMaioresIdade() {
		return clienteRepository.maiores();
	}

	public Optional<Cliente> buscar(Long id) {
		return clienteRepository.findById(id);
	}

	@Transactional
	public ClienteDTO salvar(ClienteRequest clienteRequest) {

		Cliente cliente = clienteMapper.dtoRequestToModel(clienteRequest);
//		cliente.setDataNasc(LocalDate.now());
		
		if(clienteRequest.getEndereco().getCidade().getEstado().getId() == null) {
			estadoRepository.save(clienteRequest.getEndereco().getCidade().getEstado());
		    cidadeRepository.save(clienteRequest.getEndereco().getCidade());
		}
		
		clienteRequest.getTelefones().stream().
				forEach(telefone -> telefone.setCliente(cliente));
		
		return clienteMapper.modelDTO(clienteRepository.save(cliente));
	}

	@Transactional
	public void remover(Long id) {
		try {
			clienteRepository.deleteById(id);
			clienteRepository.flush();
		
		} catch (EmptyResultDataAccessException e) {
			throw new ClienteNaoEncontradodException(id);
		};			
	}

	@Transactional
	public void atualizar(Cliente cliente) {
//		Cliente cli = clienteRepository.findById(id).get();
//
//		cli.setNome(cliente.getNome());
//		cli.setSobrenome(cliente.getSobrenome());
//		cli.setDataNasci(cliente.getDataNasci());
//		cli.setEndereco(cliente.getEndereco());
//		cli.setEmail(cliente.getEmail());
//
//		for (Telefone t : cliente.getTelefone()) {
//			t.setCliente(cli);
//			cli.setTelefone(cliente.getTelefone());
//		}
//
//		cli.setRg(cliente.getRg());
//		cli.setCpf(cliente.getCpf());
//
//		clienteRepository.save(cli);
		
	    cliente.getTelefones().stream().
		forEach(telefone -> telefone.setCliente(cliente));		
		clienteRepository.save(cliente);	
	}

	public List<Telefone> buscarTelefonePorId(Long id) {
		return clienteRepository.buscarTelefonePorId(id);
	}

}
