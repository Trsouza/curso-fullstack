package exercicioBanco.banco;

public abstract class Conta {

	private Double saldo;
	
	
	public Double getSaldo() {
		return saldo;
	}
	
	public Conta() {

	}
	
	public Conta(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Deposito: " + valor);
		System.out.println("Novo saldo: " + saldo + "\n");
	}
	public  void sacar(double valor) {
		this.saldo -= valor;
	}
	

}
