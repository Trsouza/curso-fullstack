package exercicioBanco.banco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaCorrente extends Conta {

	private Double limite;

	public ContaCorrente() {
	}

	public ContaCorrente(Double limite, Double saldo) {
		super(saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {
		double saldo = getSaldo() - valor;

		if (saldo + limite < 0) {
			System.out.println("Limite supera o cheque especial");
		} else {
			super.sacar(valor);
			if (saldo < 0) {
				limite += saldo;
			}
		}

		System.out.println("Saque CC: " + valor);
		System.out.println("Novo saldo: " + saldo + "\n");
	}

	public void depositarCheque(Cheque cheque) {
		depositar(cheque.getValor());
		LocalDateTime localDateTim = cheque.getData().toLocalDateTime();
		DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Cheque Depositado: " + cheque.getValor());
		System.out.println("Novo saldo: " + this.getSaldo() + " Hora: " + br.format(localDateTim) + "\n");
	}

}
