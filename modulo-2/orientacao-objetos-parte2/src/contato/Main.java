package contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Contato> contatos = new ArrayList<>();

		int opcao = 00;
		do {
			System.out.println("\n\n### MENU PRINCIPAL ###");
			System.out.println("\n                 ============================");
			System.out.println("                  |     1 - Incluir Contato    |");
			System.out.println("                  |     2 - Excluir Contato    |");
			System.out.println("                  |     3 - Listar Contato     |");
			System.out.println("                  |     4 - Pesquisar Contato  |");
			System.out.println("                  |     0 - Encerrar           |");
			System.out.println("                   =============================\n");

			opcao = sc.nextInt();
			System.out.print("Opção desejada: " + opcao);

			System.out.print("\n");

			switch (opcao) {
			case 1:
				Contato.adicionarContato(contatos);
				break;
			case 2:
				Contato.removerContato(contatos);
				break;
			case 3:
				Contato.listarContato(contatos);
				break;
			case 4:
				Contato.buscarContato(contatos);
				break;
			case 0:
				System.out.print("Programa Finalizado!");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
		
//		int id, idade, numero;
//		String nome, telefone, rua, bairro, cidade, estado;
		
//		do {
//		
//			System.out.print("Digite o ID: ");
//			id = sc.nextInt();
//			if (id < 0) {
//				System.out.print("Encerrando o programa... \n");
//				break;
//			}
//
//			sc.nextLine();
//			System.out.print("Digite o nome: ");
//			nome = sc.nextLine();
//			System.out.print("Digite a idade: ");
//			idade = sc.nextInt();
//			sc.nextLine();
//			System.out.print("Digite o telefone: ");
//			telefone = sc.nextLine();
//			System.out.print("Digite o nome da rua: ");
//			rua = sc.nextLine();
//			System.out.print("Digite o numero: ");
//			numero = sc.nextInt();
//			sc.nextLine();
//			System.out.print("Digite o nome da cidade: ");
//			cidade = sc.nextLine();
//			System.out.print("Digite o nome do bairro: ");
//			bairro = sc.nextLine();
//			System.out.print("Digite o nome do estado: ");
//			estado = sc.nextLine();
//			
//			contatos.add(new Contato(id, idade, telefone, nome, new Endereco(numero, rua, bairro, cidade, estado)));
//
//		} while (true);

//		for (Contato c : contatos) {
//			System.out.println(c);
//		}
		
		sc.close();
	}

}
