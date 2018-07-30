package aula2;

import aula1.Orcamento;

public class DescontoPorMaisDeQuinhetosReais {

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		} else {
			return 0;
		}
	}

}
