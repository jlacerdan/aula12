package br.com.db1.exercicio08;

import br.com.db1.exercicio06.TipoLogradouro;

public class Endereco {
	private String logradouro;
	private Integer cep;
	private TipoLogradouro tipoLogradouro;
	
	
	
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String exibirCepFormatado() {
		String temp = Integer.toString(cep);
		return temp.substring(0, 5) + "-" + temp.substring(5);
	}
}
