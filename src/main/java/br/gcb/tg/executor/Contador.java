package br.gcb.tg.executor;

import java.util.concurrent.atomic.AtomicInteger;

public class Contador {

	private AtomicInteger num = new AtomicInteger();

	public void incrementar() {
		num.incrementAndGet();
	}

	public int contador() {
		return num.get();
	}

}
