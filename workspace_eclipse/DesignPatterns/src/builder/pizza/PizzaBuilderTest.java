package builder.pizza;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class PizzaBuilderTest {
	
	@Test
	void pizzaBuilderTest() {
		
		Pizza pizza = new PizzaBuilder()
				.defineSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();
		
		assertNotNull(pizza);
		assertTrue(pizza.getSize() >= 1 && pizza.getSize() <= 3);
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
		
	}
	
	@Test
	void pizzaTamanhoInvalido() {
		Pizza pizza = new PizzaBuilder()
				.defineSize(5)
				.addCheese()
				.addPepperoni()
				.getPizza();
	}
	
	@Test
	void pizzaSemIngredientes() {
		Pizza pizza = new PizzaBuilder()
				.defineSize(1)
				.getPizza();
	}

}
