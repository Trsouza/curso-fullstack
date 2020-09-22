package br.com.digitalhouse.model;

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
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
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
	private List<Telefone> telefone = new ArrayList<Telefone>();
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_nasc")
	private Date dataNasci;
	@Column 
	private String cpf;
	@Column 
	private String rg;
	@Column 
	private String email;

	@Embedded
	private Endereco endereco;
	
}
