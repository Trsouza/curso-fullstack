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

import br.com.digitalhouse.model.Agenda;
import br.com.digitalhouse.repository.AgendaRepository;

@CrossOrigin
@RestController
@RequestMapping("/agenda")
public class AgendaController {

	@Autowired
	private AgendaRepository agendaRepository;

	@PostMapping
	public void salvar(@RequestBody Agenda agenda) {
		agendaRepository.save(agenda);
	}

	@GetMapping
	public List<Agenda> listar() {
		return agendaRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Agenda> buscar(@PathVariable Long id) {
		Optional<Agenda> agenda = agendaRepository.findById(id);

		if (agenda.isPresent()) {
			return ResponseEntity.ok(agenda.get());
		}
		return ResponseEntity.notFound().build();
	}
	
//	@GetMapping("/{id}") // Dessa  forma ele lança uma exceção quando digitado um id que não existe, no método buscar anterior ele trata isso
//	public Agenda buscar2(@PathVariable Long id) {
//		return agendaRepository.findById(id).get();
//	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		agendaRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@RequestBody Agenda agenda, @PathVariable Long id) {
		Agenda ag = agendaRepository.findById(id).get();
		
		ag.setNome(agenda.getNome());
		ag.setTelefone(agenda.getTelefone());
		
		agendaRepository.save(ag);		
	}
	 
}
