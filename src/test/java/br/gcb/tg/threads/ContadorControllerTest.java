package br.gcb.tg.threads;

import org.junit.Assert;
import org.junit.Test;

public class ContadorControllerTest {
	
	@Test
	public void contar100() {
		ContadorController contadorController = new ContadorController();
		Assert.assertEquals(100, contadorController.contar(10));
	}

	@Test
	public void contar1000() {
		ContadorController contadorController = new ContadorController();
		Assert.assertEquals(1000, contadorController.contar(100));
	}

	@Test
	public void contar10000() {
		ContadorController contadorController = new ContadorController();
		Assert.assertEquals(10000, contadorController.contar(1000));
	}

	@Test
	public void contar100000() {
		ContadorController contadorController = new ContadorController();
		Assert.assertEquals(100000, contadorController.contar(10000));
	}

}
