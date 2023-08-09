package Cidadania;

import org.junit.*;

public class Cidadao extends Pessoa {
	
	public String cpf;
	
	public Cidadao(String nome, String sexo, Integer idade, String cpf) {
		super(nome, sexo, idade);
		this.cpf = cpf;
		// TODO Auto-generated constructor stub
	}


}
