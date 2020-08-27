package exercicioDelivery.delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanduiche extends Lanche {

	private List<String> ingredientes;
	
	public Sanduiche() {
		super();
	}
		
	public Sanduiche(Double preco, List<String> ingredientes) {
		super(preco);
		this.ingredientes = ingredientes;
	}
	
	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public String toString() {
		return "Sanduiche, igredientes: " + ingredientes;
	}

	@Override
	public Double tempo(double distancia) {
		return 15 + super.tempo(distancia);
	}

	public static void menuSanduiche() {
		Scanner sc = new Scanner(System.in);
		List<String> ingredientes = new ArrayList<>();
		
		while(ingredientes.size() <= 10) {
			System.out.print("Digite um ingrediente: ");
			ingredientes.add( sc.nextLine() );
			System.out.println("Deseja adicionar outro ingrediente? (s/n)");
			char c = sc.next().charAt(0);
			sc.nextLine();
			if(c == 'n') {
				break;
			}				
		}
		
		Sanduiche sanduiche = new Sanduiche(12.00, ingredientes);
		
		System.out.println("Quantos km de distância da sua casa até a lanchonete?");
		double distancia = sc.nextDouble();
		
		System.out.println("Pedido: "+sanduiche);
		System.out.println("Preço: "+sanduiche.getPreco()+" Tempo para entrega: "+sanduiche.tempo(distancia)+" minutos");
	}	
}
