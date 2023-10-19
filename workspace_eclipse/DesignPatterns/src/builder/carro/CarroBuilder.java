package builder.carro;

public class CarroBuilder {
	
	private Carro carro;
	public int quantPorta = 0; 
	public boolean hasMotor = false;
	
	public CarroBuilder() {
		this.carro = new Carro();
	}
	
	public void buildPortas(Porta[] portas) {
		carro.setPorta(portas);
		quantPorta = portas.length;
	}
	
	public void buildMotor(Motor motor) {
		carro.setMotor(motor);
		hasMotor = true;
	}
	
	public void buildComputadorBordo(ComputadorBordo cb){
		carro.setComputadorBordo(cb);	
	}
	
	public void buildFreioABS(FreioABS freio) {
		carro.setFreioABS(freio);
	}
	
	public void validarPortas() {
		if(quantPorta < 2) {
			throw new IllegalStateException("Condição inválida. Necessario haver portas pelo menos 2 portas.");
		}
	}
	
	public void validarMotor() {
		if(hasMotor == false) {
			throw new IllegalStateException("Condição inválida. Necessario haver Motor.");
		}
	}
	
	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}
	
}
