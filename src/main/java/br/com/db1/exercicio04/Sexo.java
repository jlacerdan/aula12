package br.com.db1.exercicio04;

public enum Sexo {
	MASCULINO("Masculino"), FEMININO("Feminino");
	
	private String sexo;
	
	Sexo(String sexo){
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
