package avancado;

import java.util.*;

public class SobreSet_3 {

	public static void main(String[] args) {
		Set<Animal> setDeAnimais = new TreeSet<>();
		
		setDeAnimais.add(new Animal(4L, "Gato"));
		setDeAnimais.add(new Animal(1L, "Tartaruga"));
		setDeAnimais.add(new Animal(3L, "Cachorro"));
		setDeAnimais.add(new Animal(5L, "Girafa"));
		setDeAnimais.add(new Animal(6L, "Gato"));
		setDeAnimais.add(new Animal(2L, "Coelho"));
		
		setDeAnimais.forEach(System.out::println);
	}
}
