package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* System.out.println("OII"); */
		int idade = 15;
		double nota = 10.5;
		String nome = "Rafa";
		char letra = 'a';

		if (!(!(idade >= 16) && (idade < 18))) {
			System.out.println(nome + " pode votar mas não é obrigatório!");
		} else {
			System.out.println(nome + " é menor de idade!");
		}

		for (int i = 0; i <= 10; i++) {
			// System.out.println("8 x "+i+" = "+ 8*i);
		}

		int j = 0;
		while (j <= 10) {
			// System.out.println("8 x "+j+" = "+ 8*j);
			j++;
		}
//------------------------------VETOR---------------------------------
		int[] num = { 2, 3, 4, 5, 6 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		calculadora();
	}

	public static void calculadora() {
		int op;
		double num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);

		do {
			menu();
			op = sc.nextInt();

			if (op > 0 && op < 5) {
				System.out.println("Digite um número");
				num1 = sc.nextInt();
				System.out.println("Digite um número");
				num2 = sc.nextInt();

				if (num2 == 0 && op == 4) {
					System.out.println("O segundo número deve ser maior que ZERO");
					num2 = sc.nextInt();
				}
			}

			switch (op) {
			case 1:
				somar(num1, num2);
				break;
			case 2:
				subtrair(num1, num2);
				break;
			case 3:
				multiplicar(num1, num2);
				break;
			case 4:
				dividir(num1, num2);
				break;
			case 5:
				System.out.println("Até logo!!!");
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (op != 5);
	}

	public static void menu() {
		System.out.println("\n Escolha uma opção");
		System.out.println("1 - SOMAR");
		System.out.println("2 - SUBTRAIR");
		System.out.println("3 - MULTIPLICAR");
		System.out.println("4 - DIVIDIR");
		System.out.println("5 - SAIR \n");
	}

	public static void somar(double num1, double num2) {
		System.out.println("Resultado = " + (num1 + num2));
	}

	public static void subtrair(double num1, double num2) {
		System.out.println("Resultado = " + (num1 - num2));
	}

	public static void multiplicar(double num1, double num2) {
		System.out.println("Resultado = " + (num1 * num2));
	}

	public static void dividir(double num1, double num2) {
		System.out.println("Resultado = " + (num1 / num2));

	}

	public static void matriz() {
//		----------------------------MATRIZ---------------------------	

		int[][] matriz = new int[2][2];
		int x, y;
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Imprima os valores para compor a matriz");
		for (x = 0; x < 2; x++) {
			for (y = 0; y < 2; y++) {
				matriz[x][y] = sc.nextInt();
			}
		}
		for (x = 0; x < 2; x++) {
			for (y = 0; y < 2; y++) {
				System.out.print(matriz[x][y] + " ");
			}
			System.out.println();
		}

	}

}
