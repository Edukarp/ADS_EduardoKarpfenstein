package esportes;

import org.junit.Test;

public class testeAtleta {
	
	@Test
	public void testarConstutor() {
		
		Pessoa pessoa = new Pessoa("Edson", 21);
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa.idade);
		
		Atleta atleta = new Atleta("Edson", 21,80, false);
		
		System.out.println(atleta.nome);
		System.out.println(atleta.idade);
		System.out.println(atleta.peso);
		System.out.println(atleta.aposentado);
		
	}
	
	@Test
	public void testarNadador() {
		
		Nadador nadador = new Nadador("Gustavo", 23, 80, false);
		nadador.nadar();
		
		nadador.envelhecer();
		System.out.println(nadador.idade);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
	}

}
