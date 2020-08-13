package exercicios;

import java.util.Scanner;

public class Questoes {

	public static void main(String[] args) {
//		saudacao();
//		idade();
//		fimSemana();
		dirigir();
	}

	public static void saudacao() {
		System.out.println("Por favor informe seu nome.");
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		System.out.println("Olá " + nome + " seja Bem Vindo! ");
	}

	public static void idade() {
		System.out.println("Por favor informe uma idade");
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Maior de idade!");
		} else {
			System.out.println("Menor de idade!");
		}
	}
	
	public static void fimSemana() {
		System.out.println("Por favor informe o dia da semana.");
		Scanner sc = new Scanner(System.in);
		String dia = sc.next();
		
		if(dia.equalsIgnoreCase("segunda") ||
				dia.equalsIgnoreCase("terça") ||
				dia.equalsIgnoreCase("quarta") ||
				dia.equalsIgnoreCase("quinta") ||
				dia.equalsIgnoreCase("sexta") 
				) {
			System.out.println("Não é fim de semana, aguarde mais um pouco! :(");
		}else if (dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("domingo")  ) {
			System.out.println("Final de semana chegou!!!  :)");
		}else {
			System.out.println("Dia da semana inválido!!!");
		}
	}
	
	public static void dirigir() {
		System.out.println("Você possui habilitação? Sim ou Não?");
		Scanner sc = new Scanner(System.in);
		String habilitacao = sc.next();
		
		System.out.println("Sua habilitação está vencida? Sim ou Não?");
		String vencimento = sc.next();
		
		System.out.println("Você consumiu alguma bebida alcólica? Sim ou Não?");
		String bebida = sc.next();

		if (habilitacao.equalsIgnoreCase("sim") && 
				vencimento.equalsIgnoreCase("não") && 
				bebida.equalsIgnoreCase("não")) {
			System.out.println("Você está habilitado a dirigir!");
		} else {
			System.out.println("Você não está habilitado a dirigir!");
		}
	}
}