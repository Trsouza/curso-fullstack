package br.com.digitalhouse.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import br.com.digitalhouse.model.Cidade;
import br.com.digitalhouse.model.Estado;
import br.com.digitalhouse.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> listar() {
		return estadoRepository.findAll();
	}

	@Transactional
	public void salvar(Estado estado) {
		estadoRepository.save(estado);
	}

	public List<Cidade> buscarCidades(Long id) {
		return estadoRepository.buscarCidades(id);
	}

}
