package br.gcb.tg.threads;

import org.junit.Assert;
import org.junit.Test;

public class ContadorControllerTest {
	
	@Test
	public void contar100() {
		Contador contador = new Contador();
		ContadorController contadorController = new ContadorController(contador);
		Assert.assertEquals(100, contadorController.contar(10));
	}

}
