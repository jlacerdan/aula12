package br.com.db1.exercicio08;

public class PessoaFisica extends Pessoa{
	private Integer cpf;

	public Boolean validarCpf(){
		return Boolean.TRUE;
	}
	
	public String formatarCpf(){
		return "cpf formatado xd";
	}
	
	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
}
