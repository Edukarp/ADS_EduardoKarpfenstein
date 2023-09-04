package avancado;

import java.util.TreeSet;
import java.util.Set;

public class SobreSet_2 {
	
	public static void main(String[] args) {
		
		Set<String> setFrutas = new TreeSet<>();
		
		setFrutas.add("Laranja");
		setFrutas.add("Pera");
		setFrutas.add("Manga");
		setFrutas.add("Laranja");
		setFrutas.add("Limao");
		
		System.out.println(setFrutas); //Ordem alfabetica
	}

}
