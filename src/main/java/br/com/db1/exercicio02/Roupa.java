package br.com.db1.exercicio02;

public class Roupa {
	private String marca;
	private Integer anoFabricao;
	private Tamanho tamanho;
	
	public Tamanho getTamanho(){
		return tamanho;
	}
	
	public void setTamanho(Tamanho tamanho){
		this.tamanho = tamanho;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAnoFabricao() {
		return anoFabricao;
	}
	public void setAnoFabricao(Integer anoFabricao) {
		this.anoFabricao = anoFabricao;
	}
	
	
}
