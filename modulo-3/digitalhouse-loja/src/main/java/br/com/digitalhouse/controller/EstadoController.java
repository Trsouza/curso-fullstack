package br.com.digitalhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.model.Cidade;
import br.com.digitalhouse.model.Estado;
import br.com.digitalhouse.repository.EstadoRepository;
import br.com.digitalhouse.service.EstadoService;

@CrossOrigin(origins = "*")
@RestController 
@RequestMapping("/estado")
public class EstadoController {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping
	public List<Estado> buscarEstados() {
		return estadoService.listar();
	}
	
	@PostMapping
	public void salvar(@RequestBody Estado estado) {
		estadoService.salvar(estado);
	}
	
	@GetMapping("/{id}/cidades")
	public List<Cidade> listarCidadesPorEstado(@PathVariable Long id){
		return estadoService.buscarCidades(id);
	}

}
