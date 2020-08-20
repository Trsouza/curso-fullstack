package contato;

import java.util.List;
import java.util.Scanner;

public class Contato{
	private Integer id, idade;
	private String nome, telefone;
	private Endereco endereco;
	
	public Contato() {

	}
	public Contato(Integer id, Integer idade, String telefone, String nome, Endereco endereco) {
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public static List<Contato> adicionarContato(List<Contato> lista){
		Scanner sc = new Scanner(System.in);
		int id, idade, numero;
		String nome, telefone, rua, bairro, cidade, estado;
		
		System.out.print("Digite o ID: ");
		id = sc.nextInt();

		sc.nextLine();
		System.out.print("Digite o nome: ");
		nome = sc.nextLine();
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o telefone: ");
		telefone = sc.nextLine();
		System.out.print("Digite o nome da rua: ");
		rua = sc.nextLine();
		System.out.print("Digite o numero: ");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome da cidade: ");
		cidade = sc.nextLine();
		System.out.print("Digite o nome do bairro: ");
		bairro = sc.nextLine();
		System.out.print("Digite o nome do estado: ");
		estado = sc.nextLine();

		lista.add(new Contato(id, idade, telefone, nome, new Endereco(numero, rua, bairro, cidade, estado)));
		sc.close();
		return lista;

	}
	
	public static void removerContato(List<Contato> listaContatos) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o id a ser excluído: ");
		int id = sc.nextInt();	
		for (int i = 0; i < listaContatos.size(); i++) {
			if(listaContatos.get(i).getId().equals(id)) {
				listaContatos.remove(i);
				System.out.print("Contato removido: ");
			}else {
				System.out.print("Id inválido");						
			}
		}
		sc.close();
	}
	
	public static void listarContato(List<Contato> listaContatos) {
		for (Contato c : listaContatos) {
			System.out.println(c);
		}
	}
	
	public static void buscarContato(List<Contato> listaContatos) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o id a ser pesquisado: ");
		int id = sc.nextInt();
		for (Contato c : listaContatos) {
			if(c.getId().equals(id)) {
				System.out.println(c);
			}else {
				System.out.print("Id inválido");
			}
		}
		sc.close();
	}
	
	@Override
	public String toString() {
		return "--------------------------------------------------------\n"
				+ "id: " + id + ", idade: " + idade + ", nome: " + nome + ", telefone: " + telefone+", ENDEREÇO: "
				+endereco;
	}
	
}
