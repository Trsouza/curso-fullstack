package exercicioDelivery.delivery;

import java.util.Scanner;

public class Massa extends Lanche {

	private String molho;
	private TipoMassa tipo;

	public Massa() {
	}

	public Massa(Double preco, String molho, TipoMassa tipo) {
		super(preco);
		this.molho = molho;
		this.tipo = tipo;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public TipoMassa getTipo() {
		return tipo;
	}

	public void setTipo(TipoMassa tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Massa [molho=" + molho + ", tipo=" + tipo + "]";
	}

	@Override
	public Double tempo(double distancia) {
		return 30 + super.tempo(distancia);
	}

	public static void menuMassa() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha o molho: ");
		String molho = sc.nextLine();
		System.out.print("Escolha o tipo de Massa (P) Pizza, (M) Macarrão, (L) Lasanha: ");
		String t = sc.next().toUpperCase();
		TipoMassa tipo;
		if (t.charAt(0) == 'P') {
			tipo = TipoMassa.PIZZA;
		} else {
			if (t.charAt(0) == 'M') {
				tipo = TipoMassa.MACARRAO;
			} else {
				tipo = TipoMassa.LASANHA;
			}
		}

		Massa massa = new Massa(15.00, molho, tipo);
		System.out.println("Quantos km de distância da sua casa até a lanchonete?");
		double distancia = sc.nextDouble();

		System.out.println("Pedido: "+massa);
		System.out.println("Preço: " + massa.getPreco() + "  Tempo para entrega: " + massa.tempo(distancia) + " minutos");
		sc.nextLine();
	}
}
