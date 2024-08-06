package br.gcb.tg.stream;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class ContdorStreamTest {

	@Test
	public void pares() {
		Collection<Integer> valores = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			valores.add(i);
		}
		ContdorStream c = new ContdorStream();
		Collection<Integer> pares = c.pares(valores);
		System.out.println(pares);
		Assert.assertEquals(500, pares.size());
	}
	
}
