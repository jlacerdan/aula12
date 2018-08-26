package br.com.db1.exercicio08;

public class PessoaJuridica extends Pessoa{
	private Integer cnpj;

	public void validarCnpj(){
		
	}
	
	public String formatarCnpj(){
		return "cnpjformatado xd";
	}
	
	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	
}
