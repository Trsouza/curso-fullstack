package produtos;

public class Produto {

	private String nome;
	private double preco;
	private int qtd;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double totalEstoque() {
		return qtd * preco;
	}
	
	public void adicionaEstoque(int qtd ) {
		this.qtd = this.qtd+qtd;
	}
	
	public void removeProduto(int qtd) {
		this.qtd = this.qtd-qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + "]";
	}
}
