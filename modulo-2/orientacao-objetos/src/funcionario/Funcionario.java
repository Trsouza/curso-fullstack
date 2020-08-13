package funcionario;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double desconto;
	
	public double salarioLiquido() {
	return this.salarioBruto-desconto;	
	}
	
	public void aumentoSalario(double taxa) {
		this.salarioBruto=this.salarioBruto+ (this.salarioBruto * taxa)/100;
	}
}
