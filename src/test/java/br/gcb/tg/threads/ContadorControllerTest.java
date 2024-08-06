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

	@Test
	public void contar1000() {
		Contador contador = new Contador();
		ContadorController contadorController = new ContadorController(contador);
		Assert.assertEquals(1000, contadorController.contar(100));
	}

	@Test
	public void contar10000() {
		Contador contador = new Contador();
		ContadorController contadorController = new ContadorController(contador);
		Assert.assertEquals(10000, contadorController.contar(1000));
	}

	@Test
	public void contar100000() {
		Contador contador = new Contador();
		ContadorController contadorController = new ContadorController(contador);
		Assert.assertEquals(100000, contadorController.contar(10000));
	}

}
