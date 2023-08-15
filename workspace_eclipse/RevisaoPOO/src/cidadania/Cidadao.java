package cidadania;

import org.junit.*;

/**
 * Representa a classe Cidadao a qual eh 'filha' de Pessoa
 * @author eduardo karpfenstein
 * @since 7 de agosto de 2023
 */

public class Cidadao extends Pessoa {
	
	public String cpf;
	
	public Cidadao(String nome, String sexo, Integer idade, String cpf) {
		super(nome, sexo, idade);
		this.cpf = cpf;
		// TODO Auto-generated constructor stub
	}


}
