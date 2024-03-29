package br.inatel.labs.padraomvc.model.entity;

import java.util.Objects;

public class Produto {
	
	private Long id;
	private String descricao;
	private double preco;
	
	public Produto(Long id, String descricao, double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descicao) {
		this.descricao = descicao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
