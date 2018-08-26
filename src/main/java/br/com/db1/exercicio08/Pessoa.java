package br.com.db1.exercicio08;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.db1.exercicio04.Telefone;

public class Pessoa {
	private String nome;
	private Date dataNascimento;
	private List<Telefone> telefones;
	private List<Endereco> enderecos;
	
	public Pessoa(){
		telefones = new ArrayList<Telefone>();
		enderecos = new ArrayList<Endereco>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void addTelefones(Telefone telefones) {
		this.telefones.add(telefones);
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void addEnderecos(Endereco enderecos) {
		this.enderecos.add(enderecos);
	}
	
	
	
}
