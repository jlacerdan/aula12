package br.com.db1.calcinterface;

public class Calculator implements CalculadoraInterface {
	Double valor1;
	Double valor2;
	
	public Double somar() {
		return valor1 + valor2;
	}

	public Double subtrair() {
		return valor1 - valor2;
	}

	public Double dividir() {
		return valor1 / valor2;
	}

	public Double multiplicar() {
		return valor1 * valor2;
	}
	
}
