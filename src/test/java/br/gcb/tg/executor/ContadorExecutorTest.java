package br.gcb.tg.executor;

import org.junit.Assert;
import org.junit.Test;

public class ContadorExecutorTest {
	
	@Test
	public void contar100() {
		ContadorExecutor ContadorExecutor = new ContadorExecutor();
		Assert.assertEquals(100, ContadorExecutor.contar(10));
	}

	@Test
	public void contar1000() {
		ContadorExecutor ContadorExecutor = new ContadorExecutor();
		Assert.assertEquals(1000, ContadorExecutor.contar(100));
	}

	@Test
	public void contar10000() {
		ContadorExecutor ContadorExecutor = new ContadorExecutor();
		Assert.assertEquals(10000, ContadorExecutor.contar(1000));
	}

	@Test
	public void contar100000() {
		ContadorExecutor ContadorExecutor = new ContadorExecutor();
		Assert.assertEquals(100000, ContadorExecutor.contar(10000));
	}

}
