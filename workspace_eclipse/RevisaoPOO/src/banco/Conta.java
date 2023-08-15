package banco;

public abstract class Conta {
	
	public float saldo = 0;
	
	public Conta() {
		super();
		
	}
	
	abstract void rentabilizar();
	
	public void depositar(float saldo) {
		this.saldo += saldo;
	}
	
	public void sacar(float saldo) {
		this.saldo -= saldo;
	}
	
	

}
