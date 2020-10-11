package br.com.digitalhouse.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.model.Endereco;
import br.com.digitalhouse.model.Telefone;
import lombok.Data;

@Data
public class ClienteDTO {

	private Long id_cli;
	private String nome;
	private String sobrenome;
	private List<Telefone> telefones = new ArrayList<Telefone>();
	private LocalDate dataNasc;	
	private String cpf;
	private String rg; 
	private String email;
	private Endereco endereco;
	private ImagemDTO imagem;
}
