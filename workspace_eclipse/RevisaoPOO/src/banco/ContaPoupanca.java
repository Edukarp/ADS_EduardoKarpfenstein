package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
	}
	@Override
	void rentabilizar() {
		this.saldo = (float) (this.saldo*1.02);
		
	}
	
	@Override
	public String toString() {
		return "Conta Poupanca [saldo=" + saldo +"]";
	}

}
