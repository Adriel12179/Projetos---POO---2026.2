package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// cria a variavel nome
		String nome;
		double n1, n2, media; //cria a variavel tipo double n1,n2 e media
		
		Scanner sc = new Scanner(System.in);//cria a variavel de scanner
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite sua nota 01: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite sua nota 02: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2)/2;
		
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + media);
		
		

	}

}
