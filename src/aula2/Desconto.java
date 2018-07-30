package aula2;

import aula1.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);

	public void setProximo(Desconto proximo);
}
