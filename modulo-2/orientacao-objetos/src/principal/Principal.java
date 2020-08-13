package principal;

import java.util.Scanner;

import estudante.Estudante;
import funcionario.Funcionario;
import geometria.Retangulo;
import geometria.Triangulo;
import produto.Produto;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		Estudante e = new Estudante();
		System.out.println("Digite o Nome e as 3 Notas: ");
		e.nome = sc.nextLine();
		e.nota1 = sc.nextDouble();
		e.nota2 = sc.nextDouble();
		e.nota3 = sc.nextDouble();
		
		System.out.println("\nNota Final = "+e.notaFinal()+"\n"+e.resultado());

//-------------------------------------RETANGULO-------------------------		
//		Retangulo r = new  Retangulo();
//		System.out.println("Digite a altura e largura do retângulo ");
//		r.altura = sc.nextDouble();
//		r.largura = sc.nextDouble();
//		
//		System.out.println("ÁREA = "+r.area());
//		System.out.println("PERÍMETRO = "+r.perimetro());
//		System.out.println("DIAGONAL = "+r.diagonal());
		
//--------------------------------------FUNCIONARIO-------------------------------------		
//		Funcionario func = new Funcionario();
//		System.out.println("Digite as informações do funcionário: ");
//		System.out.print("Nome: ");
//		func.nome = sc.nextLine();
//		System.out.print("Salário: ");
//		func.salarioBruto = sc.nextDouble();
//		System.out.print("Imposto: ");
//		func.desconto = sc.nextDouble();
//		
//		System.out.println("Empregado: "+func.nome+" , R$ "+func.salarioLiquido());
//		System.out.println("Digite a taxa de aumento: ");
//		double taxa = sc.nextDouble();
//		func.aumentoSalario(taxa);
//		System.out.println("Empregado: "+func.nome+" , R$ "+func.salarioLiquido());
		
//--------------------------------------PRODUTO-------------------------------------		
//		Produto p = new Produto();
//
//		System.out.println("Digite o nome e a quantidade de produtos: ");
//		System.out.print("Nome: ");
//		p.nome = sc.next();
//		System.out.print("Preço: ");
//		p.preco = sc.nextDouble();
//		System.out.print("Quantidade: ");
//		p.qtd = sc.nextInt();
//
//		System.out.println("Produto: " + p.nome + " R$ " + p.preco + " " + p.qtd + " unidades  " + " Total:  R$"
//				+ p.totalEstoque());
//
//		System.out.print("Digite a quantidade de produtos para adicionar no estoque: ");
//		int qtd = sc.nextInt();
//		p.adicionaEstoque(qtd);
//		System.out.println("Produto: " + p.nome + " R$ " + p.preco + " " + p.qtd + " unidades " + " Total:  R$"
//				+ p.totalEstoque());
//
//		System.out.print("Digite a quantidade de produtos para remover no estoque: ");
//		int qtd2 = sc.nextInt();
//		p.removeProduto(qtd2);
//		System.out.println("Produto: " + p.nome + " R$ " + p.preco + " " + p.qtd + " unidades " + " Total:  R$"
//				+ p.totalEstoque());
		
//------------------------------------TRIANGULO-----------------------------------		
		
//		 Triangulo x = new Triangulo();
//			Triangulo y = new Triangulo();
//			System.out.println("Digite os três lados do triângulo X: ");
//			x.ladoA = Double.parseDouble(sc.nextLine());
//			x.ladoB = Double.parseDouble(sc.nextLine());
//			x.ladoC = Double.parseDouble(sc.nextLine());
//
//			System.out.println("Digite os três lados do triângulo Y: ");
//			y.ladoA = Double.parseDouble(sc.nextLine());
//			y.ladoB = Double.parseDouble(sc.nextLine());
//			y.ladoC = Double.parseDouble(sc.nextLine());
//
//			double xArea = x.areaTriangulo();
//			System.out.println("A área do triângulo x é: " + xArea);
//			double yArea = y.areaTriangulo();
//			System.out.println("A área do triângulo y é: " + yArea);
//
//			if (xArea > yArea) {
//				System.out.println("A área do triângulo X é maior");
//			} else {
//				System.out.println("A área do triângulo Y é maior");
//			}
		sc.close();
	}
}

