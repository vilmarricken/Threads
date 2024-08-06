package br.gcb.tg.threads;

import java.util.ArrayList;
import java.util.List;

public class ContadorController {

	public ContadorController() {
	}

	public Object contar(final int iteracoes) {
		final Contador contador = new Contador();
		Runnable run = new Runnable() {
			public void run() {
				for (int i = 0; i < iteracoes; i++) {
					contador.incrementar();
				}
			}
		};

		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(run);
			threads.add(thread);
			thread.start();
		}
		return contador.contador();
	}

}
