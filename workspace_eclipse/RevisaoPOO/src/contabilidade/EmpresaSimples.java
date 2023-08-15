package contabilidade;

/**
 * Classe Empresa Simples 'impelmentando' a interface de tributacao com suas funcoes
 * @author eduardo karpfenstein
 * @since 14 de agosto de 2023
 */

public class EmpresaSimples implements Tributavel {
	
	public double faturamentoMensal;
	
	public EmpresaSimples(double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}
	
	@Override
	public void getValorIR() {
		this.faturamentoMensal = this.faturamentoMensal*0.85;
		
	}

	@Override
	public void getValorISS() {
		this.faturamentoMensal = this.faturamentoMensal*0.92;
		
	}

}
