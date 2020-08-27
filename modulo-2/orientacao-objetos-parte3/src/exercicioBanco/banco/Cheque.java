package exercicioBanco.banco;

import java.time.OffsetDateTime;

public class Cheque {

	private Double valor;
	private String banco;
	private OffsetDateTime data;
	
	public Cheque() {
	
	}
	public Cheque(Double valor) {
		this.valor = valor;
	}

	public Cheque(Double valor, String banco, OffsetDateTime data) {
		this.valor = valor;
		this.banco = banco;
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public OffsetDateTime getData() {
		return data;
	}

	public void setData(OffsetDateTime data) {
		this.data = data;
	}

	
}
