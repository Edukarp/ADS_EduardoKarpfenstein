package strategy.impostos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ServicoContabilidadeTest {
	
	@Test
	public void totalizarImpostosNovo() {
		 NotaFiscal nf = new NotaFiscal();
		 nf.setValorTotal(1000.00);
		 
		 
		 ServicoContabilidade servicoContabilidade = new ServicoContabilidade();
		 
		 double totalImpostos = servicoContabilidade.totalizarImpostos(nf);
		 double totalImpostosEsperado = 170.00;
		 
		 assertEquals(totalImpostosEsperado, totalImpostos);
	}

}
