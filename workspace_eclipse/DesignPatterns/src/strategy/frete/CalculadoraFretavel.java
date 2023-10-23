package strategy.frete;

public class CalculadoraFretavel {
	
	public double calculaValor(Fretavel fretavel, double pesoKg) {
		return fretavel.calcularValor(pesoKg);
	}

}
