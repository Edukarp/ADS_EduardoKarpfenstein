package cidadania;

import java.util.Scanner; // crtl + shift + o organiza imports

import org.junit.Test;

/**
 * Representa o teste unitario das classses criadas
 * @author eduardo karpfenstein
 * @since 7 de agosto de 2023
 */


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
