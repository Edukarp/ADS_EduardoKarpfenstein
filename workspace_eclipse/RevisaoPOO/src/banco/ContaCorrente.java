package banco;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
	}
	@Override
	void rentabilizar() {
		this.saldo = (float) (this.saldo*1.01);
		
	}
	
}
