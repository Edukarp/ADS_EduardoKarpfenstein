package strategy.frete;

public class CalculadoraFrete {
	
	//Jeito RUIM
	
	public double calculaValor(String servico, double pesoKg) {
		
		if(servico.equals("sedex")) {
			if(pesoKg  < 10.0) {
				return 50.0;
			}
			else if(pesoKg < 20.0) {
				return 70.0;
			}
			else
				return 90.0;
		}
		
		if(servico.equals("dhl")) {
			if(pesoKg < 20.0) {
				return 100.00;
			}
			else
				return 190.0;
		}
			
		if(servico.equals("jadlog")) {
			if(pesoKg < 30.0) {
				return 0.0;
			}
			else
				return 150.0;
		}
		
		throw new RuntimeException("Servico desconhecido: " + servico);
	}
}
