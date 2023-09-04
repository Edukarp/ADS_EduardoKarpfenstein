package avancado;

import java.util.*;

public class SobreSet_1 {
	
	public static void main(String[] args) {
		
		Set<String> setFrutas = new HashSet<>();
		
		setFrutas.add("Laranja");
		setFrutas.add("Pera");
		setFrutas.add("Manga");
		setFrutas.add("Laranja");
		setFrutas.add("Limao");
		
		System.out.println(setFrutas); //Ordem indefinida e sem elementos repetidos
	}
}