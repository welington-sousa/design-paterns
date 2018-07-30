package aula2;

import aula1.Orcamento;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		double desconto = new DescontoPorCincoItens().desconta(orcamento);
		if (desconto == 0)
			desconto = new DescontoPorMaisDeQuinhetosReais().desconta(orcamento);

		// caso contrário, não há desconto
		return 0;
	}
}
