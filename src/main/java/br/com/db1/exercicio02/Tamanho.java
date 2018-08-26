package br.com.db1.exercicio02;

public enum Tamanho {
	P("Pequeno"), M("Médio"), G("Grande");
	
	private String tamanho;
	
	private Tamanho(String tamanhoParametro) {
		tamanho = tamanhoParametro;
	}
	
	
}
