package br.inatel.labs.padraomvc.model.service;

import java.util.*;

import org.springframework.stereotype.Service;

import br.inatel.labs.padraomvc.model.entity.Produto;
import jakarta.annotation.PostConstruct;

@Service
public class ProdutoService {
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	@PostConstruct //simulando um bd
	private void setup() {
		Produto p1 = new Produto(1L, "Produto 1", 300.0);
		Produto p2 = new Produto(2L, "Produto 2", 400.0);
		Produto p3 = new Produto(3L, "Produto 3", 200.0);
		listaProdutos.add(p1);
		listaProdutos.add(p2);
		listaProdutos.add(p3);
	}
	
	public List<Produto> findAll(){
		return this.listaProdutos;
	}
}
