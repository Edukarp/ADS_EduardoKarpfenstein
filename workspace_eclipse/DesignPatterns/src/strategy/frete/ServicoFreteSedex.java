package strategy.frete;

public class ServicoFreteSedex implements Fretavel{

	@Override
	public double calcularValor(double pesoKg) {
		if(pesoKg  < 10.0) {
			return 50.0;
		}
		else if(pesoKg < 20.0) {
			return 70.0;
		}
		else {
			return 90.0;
		}
	}

}
