package avancado;

import java.util.*;

public class SobreCollections_1 {
	
	public static void main(String[] args) {
		//Collection <String> colecao = extracted(); (1)
		Collection <String> colecao = buildCollectionImplementation();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Girafa");
		
		System.out.println(colecao);
	}
	//Extraindo pra uma funcao (1)
	/*
	private static ArrayList<String> extracted() {
		return new ArrayList<String>(); //ArrayList -> Ordem de Insercao
	}
	*/
	
	//Extraindo para uma funcao criada agora em HashSet nao mais em ArrayList
	/*
	private static Collection<String> buildCollectionImplementation() {
		return new HashSet<String>(); //HashSet -> Sem ordem definida
	}
	*/
	
	//Extraindo para uma funcao criada agora em TreeSet
	private static Collection<String> buildCollectionImplementation() {
		return new TreeSet<String>(); //TreeSet -> Arvore Balanceada, impressa na ordem natural
										//dos elementos
	}
}
