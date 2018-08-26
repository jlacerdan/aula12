package br.com.db1.exercicio06;

public enum TipoLogradouro {
	AVENIDA("Avenida"), RUA("Rua");
	
	private String tipoLogradouro;
	
	private TipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	
	
}
