package br.com.db1.exercicio04.test;

import org.junit.Test;
import static org.junit.Assert.*;
import br.com.db1.exercicio02.Roupa;
import br.com.db1.exercicio02.Tamanho;

public class RoupaTest {
	@Test
	public void roupaTest(){
		Roupa r = new Roupa();
		r.setTamanho(Tamanho.G);
		assertTrue(r.getTamanho().equals(Tamanho.G));
		
		
	}
}
