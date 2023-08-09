package Cidadania;

import java.util.Scanner;

import org.junit.Test;


public class testeCidadao {
	
	@Test
	public void testarCidadao() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Entre com o sexo: ");
		String sexo = scanner.nextLine();
		
		System.out.println("Entre com o cpf: ");
		String cpf = scanner.nextLine();
		
		System.out.println("Entre com a idade: ");
		Integer idade = scanner.nextInt();
	
		Cidadao cidadao = new Cidadao(nome,sexo,idade,cpf);
	}

}
