package strategy.frete;

public class ServicoFreteDhl implements Fretavel {

	@Override
	public double calcularValor(double pesoKg) {
		if(pesoKg < 20.0) {
			return 100.00;
		}
		else
			return 190.0;
	}

}
