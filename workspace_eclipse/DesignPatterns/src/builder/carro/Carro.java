package builder.carro;

public class Carro {
	
	private Porta porta[];
	private Motor motor;
	private ComputadorBordo computadorBordo;
	private FreioABS freioABS;
	
	
	public Porta[] getPorta() {
		return porta;
	}
	public Motor getMotor() {
		return motor;
	}
	public ComputadorBordo getComputadorBordo() {
		return computadorBordo;
	}
	public FreioABS getFreioABS() {
		return freioABS;
	}
	
	public void setPorta(Porta[] porta) {
		this.porta = porta;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public void setComputadorBordo(ComputadorBordo computadorBordo) {
		this.computadorBordo = computadorBordo;
	}
	public void setFreioABS(FreioABS freioABS) {
		this.freioABS = freioABS;
	}
	
	

}
