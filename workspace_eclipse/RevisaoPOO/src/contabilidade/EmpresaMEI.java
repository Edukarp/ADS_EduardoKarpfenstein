package contabilidade;

public class EmpresaMEI implements Tributavel {
	
	public double faturamentoMensal;
	
	

	public EmpresaMEI(double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public void getValorIR() {
		this.faturamentoMensal = this.faturamentoMensal*0.725;
		
	}

	@Override
	public void getValorISS() {
		this.faturamentoMensal = this.faturamentoMensal*1;
		
		
	}


}
