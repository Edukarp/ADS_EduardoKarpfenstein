package avancado;

import java.util.*;

public class SobreComparable_2 {
	
	public static void main(String[] args) {
		
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		
		//Dando Override em 'toString' na classe 'Animal' pra sair certo
		System.out.println("> Pela ordem de insercao: " + listaDeAnimais);
		Collections.sort(listaDeAnimais);
		System.out.println("> Pela ordem alfabetica: " + listaDeAnimais);
	}

}
