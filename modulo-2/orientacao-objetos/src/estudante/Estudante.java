package estudante;

public class Estudante {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public String resultado() {
		double resul =  100 * (this.notaFinal()/100);
		if(resul >=60.00) {
			return "Aprovado";
		}else {
			return("Reprovado \nFaltou "+(60-resul)+" pontos");
		}
	}
}

