package br.com.db1.exercicio08;


public class Conta {
	private Integer numero;
	private Integer digitoVerificador;
	
	Agencia ag = new Agencia();
	
	public void calcularDigitoVerificador(){
		
	}
	
	public Boolean validarDigitoVerificador(){
		return Boolean.TRUE;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	
	
}
