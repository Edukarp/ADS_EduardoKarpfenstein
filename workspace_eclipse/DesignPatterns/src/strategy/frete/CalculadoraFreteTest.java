package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraFreteTest {
	
	@Test
	void calculaFreteSedex() {
		
		CalculadoraFrete sedex1 = new CalculadoraFrete();
		System.out.println("Frete: " + sedex1.calculaValor("sedex", 9));
		
		CalculadoraFrete sedex2 = new CalculadoraFrete();
		System.out.println("Frete: " + sedex2.calculaValor("sedex", 10));
		
	}
	
	@Test
	void calculaFreteDhl() {
		
		CalculadoraFrete dhl1 = new CalculadoraFrete();
		System.out.println("Frete: " + dhl1.calculaValor("dhl", 9));
		
		CalculadoraFrete dhl2 = new CalculadoraFrete();
		System.out.println("Frete: " + dhl2.calculaValor("dhl", 30));
		
	}

	@Test
	void calculaFreteJadLog() {
		
		CalculadoraFrete jadLog1 = new CalculadoraFrete();
		System.out.println("Frete: " + jadLog1.calculaValor("jadlog", 29));
		
		CalculadoraFrete jadLog2 = new CalculadoraFrete();
		System.out.println("Frete: " + jadLog2.calculaValor("jadlog", 50));
	}

	@Test
	void calculaFreteErro() {
		
		try {
		CalculadoraFrete correio = new CalculadoraFrete();
		System.out.println("Frete: " + correio.calculaValor("correio", 29));
		
		fail("Devia ter lancado exception");
		}catch(RuntimeException e) {
			System.err.println(e); //Ok deu erro
		}
	}
	
	@Test
	void calculaFreteNovo() {
		
		Fretavel sedex = new ServicoFreteSedex();
		CalculadoraFretavel calcSedex = new CalculadoraFretavel();
		double valorAtual = calcSedex.calculaValor(sedex, 20);
		double valorEsperado = 90.0;
		
		assertEquals(valorEsperado, valorAtual);
		
		Fretavel feDex = new ServicoFreteFeDex();
		CalculadoraFretavel calcFeDex = new CalculadoraFretavel();
		valorAtual = calcFeDex.calculaValor(feDex, 30.0);
		valorEsperado = 45.0;
		
		assertEquals(valorEsperado, valorAtual);
		
	}

}

