package exercicioBanco.banco;

public class ContaPoupanca extends Conta {
	
	private double juros;
	

	public double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}

	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(Double juros, Double saldo) {
		super(saldo);
		this.juros = juros;
	}

	@Override
	public void sacar(double valor) {
		double saldo = getSaldo() - valor;
		
		if(saldo < 0) {
			System.out.println("Limite de saque superado");
		}else {			
			super.sacar(valor);
			System.out.println("Saque CP: " + valor);
			System.out.println("Novo saldo: " + saldo + "\n");
		}
	}

	public void recolherJuros() {
		depositar( getSaldo() * juros );
		System.out.println("Juros recolhido: " +getSaldo() + "\n");
	}

}
