package produto;

public class Produto {

	public String nome;
	public double preco;
	public int qtd;
	
	public double totalEstoque() {
		return qtd * preco;
	}
	
	public void adicionaEstoque(int qtd ) {
		this.qtd = this.qtd+qtd;
	}
	
	public void removeProduto(int qtd) {
		this.qtd = this.qtd-qtd;
	}
}
