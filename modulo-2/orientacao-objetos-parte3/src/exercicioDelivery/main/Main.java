package exercicioDelivery.main;

import java.util.Scanner;

import exercicioDelivery.delivery.Bolo;
import exercicioDelivery.delivery.Massa;
import exercicioDelivery.delivery.Sanduiche;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("[1] Sanduíches\n[2] Massas\n[3] Bolos\n[4] Sair");
			op = sc.nextInt();
			switch (op) {
			case 1:
				Sanduiche.menuSanduiche();
				break;
			case 2:
				Massa.menuMassa();
				break;
			case 3:
				Bolo.menuBolo();
				break;
			case 4:
				System.out.println("Obrigada! :)");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (op != 4);

	}

}
