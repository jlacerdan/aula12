package br.com.db1.exercicio03;

public class Calculadora {
	private Double resultado;
	private Double primeiroValor;
	private Double segundoValor;

	public void zerarCalculo() {

	}

	public void somar(Double valor1, Double valor2) {

	}

	public void subtrair(Double valor1, Double valor2) {

	}

	public void dividir(Double valor1, Double valor2) {

	}

	public void multiplicar(Double valor1, Double valor2) {

	}

	public Double exibirResultado(){
		return resultado;
	}
	
	public Calculadora(Double valor1, Double valor2){
		primeiroValor = valor1;
		segundoValor = valor2;
	}
	
	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Double getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}

}
