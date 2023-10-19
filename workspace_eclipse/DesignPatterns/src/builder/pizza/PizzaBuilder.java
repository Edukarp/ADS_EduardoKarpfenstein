package builder.pizza;

public class PizzaBuilder {
	
	private Pizza pizza = new Pizza();
	
	public PizzaBuilder defineSize(Integer size) {
		pizza.setSize(size);
		return this;
	}
	
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
	}
	
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
	}
	
	public void validaIngrediente() {
		if(pizza.getFlagCheese() == false && pizza.getFlagPepperoni() == false) {
			throw new IllegalStateException("Condição inválida. Necessario haver pelo menos um ingrediente na Pizza.");
		}
	}
	
	public void validaTamanho() {
		if(pizza.getSize() > 3 || pizza.getSize() < 1) {
			throw new IllegalStateException("Condição inválida. Tamanho de pizza invalido.");

		}
	}
	public Pizza getPizza() {
		validaIngrediente();
		validaTamanho();
		return pizza;
	}
	

}
