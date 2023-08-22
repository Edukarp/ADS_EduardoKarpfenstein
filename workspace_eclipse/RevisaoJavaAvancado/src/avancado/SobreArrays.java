package avancado;

import org.junit.jupiter.api.Test;

public class SobreArrays {
	
	public static void main(String[] args) {
		
		Animal[] arrayAnimais = new Animal[4];
	
		arrayAnimais[0] = new Animal(1L, "Tartaruga");
		arrayAnimais[1] = new Animal(2L, "Coelho");
		arrayAnimais[2] = new Animal(3L, "Cachorro");
		arrayAnimais[3] = new Animal(4L, "Gato");
		
		System.out.println("Array de Animais: ");
		for(int i = 0; i < arrayAnimais.length; i++) {
			System.out.println(arrayAnimais[i].getNome());
		}
		
		
		/* Enhanced for
		 for(Animal animal : arrayAnimais){
		 System.out.println(animal.getNome());
		 }
		*/
	}
	

}
