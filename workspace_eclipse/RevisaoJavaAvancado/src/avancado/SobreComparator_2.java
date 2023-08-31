package avancado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SobreComparator_2 {
	
	public static void main(String[] args) {
		
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		
		//Basicamente escrevendo a funcao de maneira direta
		listaDeAnimais.sort((a1, a2)-> a1.getNome().compareTo(a2.getNome()));
		System.out.println("> Pela ordem do nome: " + listaDeAnimais);
		
		//Compara diretamente atraves da propria funcao do 'Comparator'
		listaDeAnimais.sort(Comparator.comparing(a -> a.getId()));
		System.out.println("> Pela ordem do ID: " + listaDeAnimais);
		
		//Aqui ainda mais direto que o anterior
		listaDeAnimais.sort(Comparator.comparing(Animal::getNome));
		System.out.println("> Pela ordem do nome: " + listaDeAnimais);


		
	}

}
