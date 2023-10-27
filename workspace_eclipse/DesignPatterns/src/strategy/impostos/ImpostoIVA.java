package strategy.impostos;

public class ImpostoIVA implements Tributavel{
	
	private static final double ALIQUOTA_IVA = 0.05;

	@Override
	public double getImposto(double valotTotalIVA) {
		return ALIQUOTA_IVA * valotTotalIVA;
	}

}
