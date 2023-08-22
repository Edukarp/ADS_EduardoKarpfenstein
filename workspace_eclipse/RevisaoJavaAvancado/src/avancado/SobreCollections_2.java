package avancado;
import java.util.*;

public class SobreCollections_2 {
	
	public static void main(String[] args) {
		Collection <String> engenhariasAtuais = extracted();
		engenhariasAtuais.add("Telecomunicacoes");
		engenhariasAtuais.add("Biomedica");
		engenhariasAtuais.add("Computacao");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Eletrica");
		engenhariasAtuais.add("Producao");
		engenhariasAtuais.add("Automacao");
		
		System.out.println("Engenharias Atuais: " + engenhariasAtuais);
		
		Collection <String> engenhariasFuturas = extracted();
		engenhariasFuturas.add("Mecanica");
		engenhariasFuturas.add("Mecatronica");
		
		System.out.println("Engenharias Futuras: " + engenhariasFuturas);
		
		Collection <String> todasEngenharias = extracted();
		todasEngenharias.addAll(engenhariasAtuais);
		todasEngenharias.addAll(engenhariasFuturas);
		
		System.out.println(todasEngenharias);
		System.out.println("");
		
		//Construtor Sobrecarregado que recebe outra coelecao
		Collection <String> engenharias = new ArrayList<String>(todasEngenharias);
		System.out.println("Engenharias esta vazia: " + engenharias.isEmpty());
		System.out.println("Engenharias tem " + engenharias.size() + " elementos");
		System.out.println("Limpando a colecao Engenharias");
		engenharias.clear();
		System.out.println("Engenharias esta vazia: " + engenharias.isEmpty());
		
	}
	
	private static ArrayList<String> extracted() {
		return new ArrayList<String>();
	}

}
