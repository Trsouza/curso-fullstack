package br.com.digitalhouse.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@Column
	private String endereco;
	
//	@JsonIgnore
	@OneToMany(mappedBy="cliente", cascade = CascadeType.ALL)
	private List<Telefone> telefone = new ArrayList<Telefone>();
	
	@DateTimeFormat(pattern = "yyyy-MM-ddT03:00:00.000Z") //
	@Column(name = "data_nasc")
	private Date dataNasci;
	@Column 
	private String cpf;
	@Column 
	private String rg;
	@Column 
	private String email;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Long id, String nome, String sobrenome, String endereco, List<Telefone> telefone, Date dataNasci, String cpf, String rg,
			String email) {
		this.id_cli = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNasci = dataNasci;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
	}

	public Long getId() {
		return id_cli;
	}

	public void setId(Long id) {
		this.id_cli = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public Date getDataNasci() {
		return dataNasci;
	}

	public void setDataNasci(Date dataNasci) {
		this.dataNasci = dataNasci;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id_cli + ", nome=" + nome + ", sobrenome=" + sobrenome + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", dataNasci=" + dataNasci + ", cpf=" + cpf + ", rg=" + rg + ", email="
				+ email + "]";
	}



}
