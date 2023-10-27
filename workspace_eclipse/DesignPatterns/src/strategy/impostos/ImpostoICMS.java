package strategy.impostos;

public class ImpostoICMS implements Tributavel {
	
	private static final double ALIQUOTA_ICMS = 0.10;

	@Override
	public double getImposto(double valotTotalICMS) {
		return ALIQUOTA_ICMS * valotTotalICMS;
	}

}
