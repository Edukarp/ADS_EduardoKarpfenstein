package strategy.frete;

public class ServicoFreteJadLog implements Fretavel{

	@Override
	public double calcularValor(double pesoKg) {
		if(pesoKg < 30.0) {
			return 0.0;
		}
		else
			return 150.0;
	}
}
