package br.com.db1.exercicio04.test;

import org.junit.Test;

import br.com.db1.exercicio04.Pessoa;
import br.com.db1.exercicio04.Telefone;

public class PessoaTest {
	
	@Test
	public void pessoaTest(){
		Pessoa p = new Pessoa();
		Telefone tel = new Telefone();
		tel.setDdd(47);
		tel.setNumero(997511761);
		Telefone tel2 = new Telefone();
		tel2.setDdd(44);
		tel2.setNumero(997258440);
		p.addTelefones(tel);
		p.addTelefones(tel2);
		System.out.println(p.getTelefones());
}
}
