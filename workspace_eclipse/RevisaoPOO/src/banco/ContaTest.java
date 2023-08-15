package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test; //Usar esse teste por conta de versionamento

public class ContaTest {
	
	@Test
	void testaContaCorrente() {
		Conta cc = new ContaCorrente();
		cc.depositar(110.00f);
		cc.sacar(10.00f);
		
		float saldoAtual = cc.saldo;
		System.out.println("Saldo atual: " + saldoAtual);
		float saldoEsperado = 101.00f;
		cc.rentabilizar();
		assertEquals(cc.saldo, saldoEsperado);
		if(cc.saldo == saldoEsperado) {
			System.out.println("Saldo Rentabilizado Corretamente");
		}
	}
		
		@Test
		void testaContaPoupanca() {
			Conta cc = new ContaPoupanca();
			cc.depositar(110.00f);
			cc.sacar(10.00f);
			
			float saldoAtual = cc.saldo;
			System.out.println("Saldo atual: " + saldoAtual);
			float saldoEsperado = 102.00f;
			cc.rentabilizar();
			if(cc.saldo == saldoEsperado) {
				System.out.println("Saldo Rentabilizado Corretamente");
			}
	}

}
