package br.com.digitalhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.repository.TelefoneRepository;

@RestController @CrossOrigin(origins = "*")
@RequestMapping("/clientes")
public class TelefoneController {

	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@GetMapping("/telefones")
	public List<Telefone> buscarTelefonesCliente() {
		return telefoneRepository.findAll();
	}

}
