package exercicioDelivery.delivery;

import java.util.Scanner;

public class Bolo extends Lanche{

	private String massa;
	private String recheio;
	private String cobertura;
	

	public Bolo() {
		
	}

	public Bolo(Double preco, String massa, String recheio, String cobertura) {
		super(preco);
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}
	
	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public String toString() {
		return "Bolo [massa=" + massa + ", recheio=" + recheio + ", cobertura=" + cobertura + "]";
	}

	@Override 
	public Double tempo(double distancia) {
		return 10 + super.tempo(distancia);	
	}
	
	public static void menuBolo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escolha a sua massa: ");
		String massa = sc.nextLine();
		System.out.print("Escolha o seu recheio: ");
		String recheio = sc.nextLine();
		System.out.print("Escolha a sua cobertura: ");
		String cobertura = sc.nextLine();
		
		Bolo bolo = new Bolo(15.00, massa, recheio, cobertura);
		System.out.println("Quantos km de distância da sua casa até a lanchonete?");
		double distancia = sc.nextDouble();
		
		System.out.println("Pedido: "+bolo);
		System.out.println("Preço: "+bolo.getPreco()+" Tempo para entrega: "+bolo.tempo(distancia)+" minutos");
		sc.nextLine();
	}
}
