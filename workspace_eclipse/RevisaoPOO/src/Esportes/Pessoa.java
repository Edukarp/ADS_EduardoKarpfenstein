package Esportes;

public class Pessoa extends Object{ //Object sempre inplicito
	
	public String nome;
	public Integer idade;
	
	//crtl + 3 + "gcuf"
	public Pessoa(String nome, Integer idade) {
		super(); //Tambem sempre implicito
		this.nome = nome;
		this.idade = idade;
	}
	
	public void envelhecer() {
		this.idade++;
	}
	
	
	
	

}
