package avancado;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
	
	private Long id;
	private String nome;
	
	//crtl + 3 + "gcuf"
	public Animal(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Animal that) {
		return this.nome.compareTo(that.nome);
	}
	
    @Override
    public String toString() {
        return "Animal [id=" + id + ", nome=" + nome + "]";
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
		Animal other = (Animal) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	
	

}
