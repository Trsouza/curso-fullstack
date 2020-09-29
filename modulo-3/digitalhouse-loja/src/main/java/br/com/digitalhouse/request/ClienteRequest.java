package br.com.digitalhouse.request;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.digitalhouse.model.Endereco;
import br.com.digitalhouse.model.Telefone;
import lombok.Data;

@Data
public class ClienteRequest {

	private Long id_cli;
	private String nome;
	private String sobrenome;
	private List<Telefone> telefones = new ArrayList<Telefone>();
	private LocalDate dataNasc;	
	@NotNull
	private String cpf;
	@NotBlank
	private String rg;
	private String email;
	private Endereco endereco;
}
