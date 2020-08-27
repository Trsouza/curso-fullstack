package exercicioBanco.banco;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String numRg;
	private String cpf;
	private Conta conta;
		
	public Cliente() {
		
	}
	
	public Cliente(int idCliente, String nome, String numRg, String cpf, Conta conta) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.numRg = numRg;
		this.cpf = cpf;
		this.conta = conta;
	}

	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumRg() {
		return numRg;
	}
	public void setNumRg(String numRg) {
		this.numRg = numRg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", numRg=" + numRg + ", cpf=" + cpf + ", conta="
				+ conta + "]";
	}
	
	
	
}
