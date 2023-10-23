package strategy.frete;

public class ServicoFreteFeDex implements Fretavel{

	@Override
	public double calcularValor(double pesoKg) {
		if(pesoKg  <= 20.0) {
			return 0.0;
		}
		else if(pesoKg > 20.1 || pesoKg <= 45.0 ) {
			return 45.0;
		}
		else {
			return 75.0;
		}
	}

}

