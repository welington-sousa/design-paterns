package aula1;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double calcula = impostoQualquer.calcula(orcamento);
		System.out.println(calcula);
	}
}
