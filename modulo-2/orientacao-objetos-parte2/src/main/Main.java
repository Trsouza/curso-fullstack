package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import conta.Conta;
import funcionario.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcs = new ArrayList<>();
		Funcionario f = new Funcionario();
		
//		System.out.println("Informe o número de funcionários que serão registrados: ");
//		int n = sc.nextInt();
//		
//		
//		for (int i=0; i<n; i++) {
//			System.out.println("Funcionario #" + (i + 1) + ":");
//			System.out.print("Id: ");
//			Integer id = sc.nextInt();
//			while (comparaIds(funcs, id)) {
//				System.out.println("Id existente tente outro: ");
//				id = sc.nextInt();
//			}
//			
//			System.out.print("Nome: ");
//			sc.nextLine();
//			String nome = sc.nextLine();
//			System.out.print("Salario: ");
//			Double salario = sc.nextDouble();
//			
//			 f = new Funcionario(id, nome, salario);
//			
//			funcs.add(f);	
//		}
//		
//		System.out.print("\nDigite o ID do funcionário que terá aumento : ");
//		int idFunc= sc.nextInt();
//		
//		if(comparaIds(funcs, idFunc)) {
//			System.out.print("Informe a porcentagem: ");
//			double porcentagem = sc.nextDouble();
//			for(Funcionario ff : funcs) {
//				if(ff.getId()== idFunc) {
//					ff.aumentoSalario(porcentagem);
//				}
//			}
//		}else{
//			System.out.println("Id não encontrado!");
//		}
//		
//		System.out.println("\nLista de Funcionários:");
//		for (Funcionario fu : funcs) {
//			System.out.println(fu);
//		}
		
		
//-------------------------PRODUTO List-----------------------------		
//		List<Produto> lista = new ArrayList<>();
//		
//		Produto p = new Produto("Tv", 500.00, 15);
//		lista.add(p);
//		lista.add(new Produto("Frigobar", 1500.00, 15));
//		lista.add(new Produto("Fogão", 600.00, 5));
//		
//		for(int i = 0; i<lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
//		
//		lista.add(1, new Produto("Caneta", 1.00, 10));
//			
//		for(Produto pr: lista) {
//			System.out.println(pr);
//		}
		
		//EXPRESSÕES LAMBDA
//		lista.stream().forEach(x-> System.out.println(x.getNome()));		

		
		
		
//		-------------------------CONTA BANCARIA--------------------		
		Conta c;
		
		System.out.print("Informe o número da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Informe o nome do titular: ");
		sc.nextLine();
		String nomeConta = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito inicial? (s/n) ");
		char op = sc.next().toLowerCase().charAt(0);
		sc.nextLine();
		if(op == 's') {
			System.out.print("Informe o valor do depósito: ");
			double valorDepo = sc.nextDouble();
			c = new Conta(numConta, nomeConta, valorDepo);
		}
		else {
			c = new Conta();
		}
		
		System.out.println(c.consultarSaldo());
		
		System.out.print("\nInforme o valor do Saque: ");
		double valor = sc.nextDouble();
		c.saque(valor);
		
		System.out.print("\nInforme o valor do Deposito: ");
		valor = sc.nextDouble();
		c.deposito(valor);
		

	}
	
	
	public static boolean comparaIds(List<Funcionario> fun, int id) {
		for(Funcionario f: fun) {
			if(f.getId() == id) {
				return true;	
			}
		}
		return false;
	}
	
}
