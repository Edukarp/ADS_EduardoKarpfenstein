package avancado;

import java.util.*;

public class SobreList_1 {
	
	public static void main(String[] args) {
		
		List<String> listaAlimentos = new ArrayList<String>();
		listaAlimentos.add("Damasco");
		listaAlimentos.add("Batata");
		listaAlimentos.add("Arroz");
		listaAlimentos.add("Cenoura");
		
		System.out.println(listaAlimentos); //Ordem de insercao
		
		List<Animal> listaAnimais = new ArrayList<Animal>();
		listaAnimais.add(new Animal(1L,"Rato"));
		listaAnimais.add(new Animal(2L,"Peixe"));
		listaAnimais.add(new Animal(3L, "Guaxinim"));
		
		System.out.println(listaAnimais); //Ta mostrando local
		
	}

}
