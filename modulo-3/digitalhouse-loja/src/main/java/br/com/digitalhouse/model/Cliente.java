package br.com.digitalhouse.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id_cli;
	@Column
	private String nome;
	@Column
	private String sobrenome;
	
//	@JsonIgnore
	@OneToMany(mappedBy="cliente", cascade = CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<Telefone>();
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_nasc")
	private LocalDate dataNasc;
	@Column 
	private String cpf;
	@Column 
	private String rg;
	@Column 
	private String email;

	@Embedded
	private Endereco endereco;
	
	@OneToOne
	private Imagem imagem;
}
