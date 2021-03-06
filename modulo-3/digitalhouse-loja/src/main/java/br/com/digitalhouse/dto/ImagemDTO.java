package br.com.digitalhouse.dto;

import java.net.URL;

import lombok.Data;

@Data
public class ImagemDTO {

	private Long id;
	private String nomeArquivo;
	private String contentType;
	private Long tamanho;
	private URL url;
}
