package strategy.impostos;

import java.util.List;

public class ReceitaFederal {

	public List<Tributavel> buscarListaImpostosVigentes(){
		return List.of(new ImpostoISS(), //Invocando cada imposto pra fazer a soma
				new ImpostoICMS(),
				new ImpostoIVA()
				);
	}
}
