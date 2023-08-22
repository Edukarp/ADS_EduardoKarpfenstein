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
		@Test
		void testPolimorfismo() {
			//Flag que define qual sera instancia da Conta
			boolean flagContaCorrenteDefault = true;
			
			Conta conta = null;
			if(flagContaCorrenteDefault) {
				conta = new ContaCorrente();
			}
			else {
				conta = new ContaPoupanca();
			}
			conta.depositar(100.00f); //Sempre invocado de 'Conta'
			conta.rentabilizar(); //Pode ser invocado tanto de ContaCorrente quanto de
									//de ContaPoupanca <- Polimorfismo
			System.out.println(conta.getClass().getName()); //Mostrando a Instancia
			System.out.println(conta.saldo);
			
			String str = conta.toString();
			System.out.println(str);
			
			}
		}

