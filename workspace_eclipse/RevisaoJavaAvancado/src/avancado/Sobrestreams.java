package avancado;

import java.util.*;
import java.util.stream.Collectors;

public class Sobrestreams {
	
	public static void main(String[] args) {
		
	
	List<Produto> produtos = new ArrayList<>();
	
	produtos.add(new Produto(1L, "Cadeiras", 100.0));
	produtos.add(new Produto(2L, "Cama", 400.0));
	produtos.add(new Produto(3L, "Mesa", 200.0));
	produtos.add(new Produto(4L, "Sofa", 500.0));
	produtos.add(new Produto(5L, "Cadeiras", 150.0));
	
	//1.filter()
	List<Produto> produtosFiltrados = produtos.stream().	
			filter(p -> p.getPreco() < 300.00).	
			collect(Collectors.toList());
	
	//Pra cada produto filtrado printar igual a: produtoFiltrados.forEach(p->System.out.println(p))
	produtosFiltrados.forEach(System.out::println);
	
	//2.map()
	List<String> descricoes = produtos.stream().	
			map(p-> p.getDescricao()).	
			collect(Collectors.toList());
	
	descricoes.forEach(System.out::println);
	
	//3.map() and reduce()
	Double precoTotal = produtos.stream().	
			map(p-> p.getPreco()).	
			reduce(0.0, Double::sum); //sendo 0.0 o valor inicial
	
	System.out.println("Preco Total: " + precoTotal);
	
	
	//Desafio
	Double precoTotalFiltrado = produtosFiltrados.stream().	
			map(p-> p.getPreco()).	
			reduce(0.0, Double::sum); //sendo 0.0 o valor inicial
	
	System.out.println("Preco Total Filtrado: " + precoTotalFiltrado);
	}
	
}
