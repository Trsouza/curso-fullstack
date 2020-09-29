package br.com.digitalhouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Table
@Entity(name="telefone")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column 
	private String numero;
	
	@Column
	private String tipo; 

	@JsonIgnore
	@ManyToOne//(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "cliente_id", nullable=false) //, referencedColumnName="id_cli") 
	private Cliente cliente;
	
}
