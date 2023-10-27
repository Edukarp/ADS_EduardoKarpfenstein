package strategy.impostos;

import java.util.List;

public class ServicoContabilidade {
	
	private ReceitaFederal receitaFederal = new ReceitaFederal();
	
	public double totalizarImpostos(NotaFiscal nf) {
		double valorTotalNF = nf.getValorTotal();
		
		List<Tributavel> listaImpostosVigentes = receitaFederal.buscarListaImpostosVigentes();
		
		/*
		//Usando Enchanced For
		double totalImposto = 0.0;
		
		for (Tributavel tributavel : listaImpostosVigentes) {
			double imposto = tributavel.getImposto(valorTotalNF);
			totalImposto += imposto;
		}
		 */
		
		//Usando Stream
		Double totalImpostos = listaImpostosVigentes.stream()
		.map(t -> t.getImposto(valorTotalNF))
		.reduce(0.0, Double::sum);
		
		return totalImpostos;
	}
}
