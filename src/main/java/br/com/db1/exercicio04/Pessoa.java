package br.com.db1.exercicio04;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pessoa {
	private String nome;
	private Date dataNascimento;
	private Sexo sexo;
	private List<Telefone> telefones;
	
	public Pessoa(){
		telefones = new ArrayList<Telefone>();
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void addTelefones(Telefone telefone) {
		telefones.add(telefone);
	}
	
	public Sexo getSexo(){
		return sexo;
	}
	
	public void setSexo(Sexo sexo){
		this.sexo = sexo;
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
	
	
}
