package builder.carro;

public class CarroBuilderFluente {
	
	private Carro carro;

	public CarroBuilderFluente() {
		this.carro = new Carro();
	}
	
	public CarroBuilderFluente buildPortas(Porta[] portas) {
		carro.setPorta(portas);
		return this;
	}
	
	public CarroBuilderFluente buildMotor(Motor motor) {
		carro.setMotor(motor);
		return this;
	}
	
	public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cp) {
		carro.setComputadorBordo(cp);
		return this;
	}
	
	public CarroBuilderFluente buildFreioABS(FreioABS freios) {
		carro.setFreioABS(freios);
		return this;
	}
	
	
	public Carro getCarro() {
		return carro;
	}
	

}
