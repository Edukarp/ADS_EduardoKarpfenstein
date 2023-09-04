package avancado;


import java.util.*;
import java.util.Map.Entry;

public class SobreMap {
	
	public static void main(String[] args) {
		
		
		Animal a1 = new Animal(4L, "Gato");
		Animal a2 = new Animal(1L, "Tartaruga");
		Animal a3 = new Animal(3L, "Cachorro");
		Animal a4 = new Animal(5L, "Girafa");
		Animal a5 = new Animal(2L, "Coelho");
		
		Map<String, Animal> mapaDeAnimais = new HashMap<>();
		
		mapaDeAnimais.put("GAT", a1);
		mapaDeAnimais.put("TAR", a2);
		mapaDeAnimais.put("CAC", a3);
		mapaDeAnimais.put("GIR", a4);
		mapaDeAnimais.put("COE", a5);
		
		System.out.println(mapaDeAnimais);
		
		Set<Entry<String, Animal>> entrySet = mapaDeAnimais.entrySet();
		for(Entry<String, Animal> entry: entrySet) {
			System.out.println("Chave: " + entry.getKey());
			System.out.println("Valor: " + entry.getValue());
		}
	}
	

}
