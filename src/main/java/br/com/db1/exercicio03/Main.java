package br.com.db1.exercicio03;

import br.com.db1.calcinterface.Soma;
import br.com.db1.calcinterface.Subtracao;

public class Main {
	public static void main(String[] args) {
		CalculadoraComInterface c = new CalculadoraComInterface();
		c.realizarCalculo(new Soma(), 1, 2);
		System.out.println(c.exibirResultado());
		c.realizarCalculo(new Subtracao(), 10, 5);
		System.out.println(c.exibirResultado());
	}
}
