package exercicioDelivery.delivery;

public abstract class Lanche {

	private Double preco;
	
	public Lanche() {
		
	}
	
	public Lanche(Double preco) {
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double tempo(double distancia) {
		return distancia*10;
	}

}
