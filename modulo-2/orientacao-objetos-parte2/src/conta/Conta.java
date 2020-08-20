package conta;

public class Conta {

	private int numConta;
	private String nome;
	private double valorDeposito;
	
	public Conta() {	
	}
	
	public Conta(int numConta, String nome, double valorDeposito) {
		this.numConta = numConta;
		this.nome = nome;
		this.valorDeposito = valorDeposito;
	}
	
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
		this.valorDeposito = 0;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorDeposito() {
		return valorDeposito;
	}
	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	
	public void saque(double valor) {
		this.valorDeposito = valorDeposito-valor-5.0; 
		System.out.println(consultarSaldo());
	}
	
	public void deposito(double valor) {
		 this.valorDeposito = this.valorDeposito+valor; 
		  System.out.println(consultarSaldo());
	}
	
	public String consultarSaldo() {
		return "Seu saldo é: "+this.valorDeposito;
	}	
}
