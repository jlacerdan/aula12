package br.com.db1.exercicio03;

import br.com.db1.calcinterface.CalculadoraInterface;

public class CalculadoraComInterface {
	private Integer resultado;

	public CalculadoraComInterface() {
		zerarCalculo();
	}
	
	public void realizarCalculo(CalculadoraInterface operacao, Integer valor1, Integer valor2){
		resultado = operacao.calcula(valor1, valor2);
	}

	public void zerarCalculo() {
		resultado = 0;
	}

	public Integer exibirResultado() {
		return resultado;
	}
}
