package estoque;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class testProduto {
	
	@Test
	public void testProdutoComoJavaBean() {
		
		Produto p = new Produto();
		p.setDescricao("Queijo Minas 1Kg");
		p.setValorCompra(50.00);
		p.setDataValidade(LocalDate.of(2023, Month.DECEMBER, 30));
		
		System.out.println("Informacoes do Produto:");
		System.out.println(p.getDescricao());
		System.out.println(p.getValorCompra());
		System.out.println(p.getDataValidade());
		
		
	}

}
