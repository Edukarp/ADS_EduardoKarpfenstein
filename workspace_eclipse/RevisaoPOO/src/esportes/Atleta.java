package esportes;

import org.junit.*;

public class Atleta extends Pessoa{
	
	public Integer peso;
	public Boolean aposentado;

	//crtl + 3 + "gcfs"
	public Atleta(String nome, Integer idade, Integer peso, Boolean aposentado) {
		super(nome, idade);
		this.peso = peso;
		this.aposentado = aposentado;
	}
	
	public void aquecer() {
		System.out.println("Atleta Aquecido."); //"syso" + crtl + space
		
	}
	
	public void aposentar() {
		this.aposentado = true;
	}
	

}
