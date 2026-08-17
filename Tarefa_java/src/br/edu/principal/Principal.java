package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua rua: ");
		String rua = sc.nextLine();
		
		System.out.println("Digite seu número: ");
		String numero = sc.nextLine();
		
		System.out.println("Digite seu bairro: ");
		String bairro = sc.nextLine();
		
		System.out.println("Digite seu complemento: ");
		String complemento = sc.nextLine();
		
		System.out.println("Digite seu CEP: ");
		String cep = sc.nextLine();
		
		System.out.println("Digite sua cidade: ");
		String cidade = sc.nextLine();
		
		System.out.println("Digite sua UF: ");
		String uf = sc.nextLine();

		System.out.println("Digite seu CPF: ");
		String cpf = sc.nextLine();
		
		System.out.println("Digite sua data de nascimento: ");
		String nascimento = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		// Saída

        System.out.println("\n----------------------------------------");

        System.out.println("Nome: " + nome);

        System.out.println("Endereço: " + rua + ", " + numero + ", " + bairro + ", " + complemento);

        System.out.println(cep + ", " + cidade + " - " + uf);

        System.out.println("CPF: " + cpf);

        System.out.println("Data de Nascimento: " + nascimento);

        System.out.println("Idade: " + idade);

        System.out.println("----------------------------------------");

        sc.close();

	}

}
