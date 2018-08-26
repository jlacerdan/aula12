package br.com.db1.exercicio02;

public enum Tamanho {
	P("Pequeno"), M("Médio"), G("Grande");
	
	private String tamanho;
	
	private Tamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
	
	
	
}
