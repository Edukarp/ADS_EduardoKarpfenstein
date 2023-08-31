package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparator_1 {
	public static void main(String[] args) {
		
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		
		Collections.sort(listaDeAnimais, new ComparadorPorNome());
		System.out.println("> Pela ordem do nome: " + listaDeAnimais);
		
		Collections.sort(listaDeAnimais, new ComparadorPorId());
		System.out.println("> Pela ordem do ID: " + listaDeAnimais);
		
	}

}
