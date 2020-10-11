package br.com.digitalhouse.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.dto.ImagemDTO;
import br.com.digitalhouse.request.ImagemRequest;
import br.com.digitalhouse.service.ImagemService;

@CrossOrigin
@RestController
@RequestMapping("/imagem")
public class ImagemController {

	@Autowired
	private ImagemService service;

//	@PostMapping("/{id}")
//	public ImagemDTO salvarFoto(@Valid ImagemRequest imagem, @PathVariable Long id) {
//
//		String nomeArquivo = UUID.randomUUID().toString() + "_" + imagem.getImagem().getOriginalFilename();
//
//		Path arquivoFoto = Path.of("C:/fotos", nomeArquivo);
//
//		try {
//			imagem.getImagem().transferTo(arquivoFoto);
//
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//
//		return service.salvar(imagem, id);
//	}
	
	@PostMapping
	public ImagemDTO salvarFoto(@Valid ImagemRequest imagem) {
		
		return service.salvar(imagem);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ImagemDTO> excluir(@PathVariable Long id) {
		try {
			service.excluir(id);	
			return ResponseEntity.noContent().build();
			
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
