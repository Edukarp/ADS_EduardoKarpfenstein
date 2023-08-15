package contabilidade;

import org.junit.jupiter.api.Test;

/**
 * Classe para realizacao de testes
 * @author eduardo karpfenstein
 * @since 14 de agosto de 2023
 */

public class testeEmpresa {
	
	@Test
	public void testEmpresaMEI() {
		
		EmpresaMEI empresaMeiIR = new EmpresaMEI(1000.00);
		empresaMeiIR.getValorIR();
		double valorIR = empresaMeiIR.faturamentoMensal;
		System.out.println("Valor com tributacao IR: R$" + valorIR);
		EmpresaMEI empresaMeiISS = new EmpresaMEI(1000.00);
		empresaMeiISS.getValorISS();
		double valorISS = empresaMeiISS.faturamentoMensal;
		System.out.println("Valor com tributacao ISS: R$" + valorISS);
		
	}
	
	@Test
	public void testEmpresaSimples() {
		
		EmpresaSimples empresaSimplesIR = new EmpresaSimples(1000.00);
		empresaSimplesIR.getValorIR();
		double valorIR = empresaSimplesIR.faturamentoMensal;
		System.out.println("Valor com tributacao IR: R$" + valorIR);
		EmpresaSimples empresaSimplesISS = new EmpresaSimples(1000.00);
		empresaSimplesISS.getValorISS();
		double valorISS = empresaSimplesISS.faturamentoMensal;
		System.out.println("Valor com tributacao ISS: R$" + valorISS);
		
	}

}
