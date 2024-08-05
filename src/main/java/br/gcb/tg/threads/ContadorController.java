package br.gcb.tg.threads;

import java.util.ArrayList;
import java.util.List;

public class ContadorController {

	private Contador contador;

	private int iteracoes;
	
	Runnable run = new Runnable() {
		public void run() {
			for (int i = 0; i < iteracoes; i++) {
				contador.incrementar();
			}
		}
	};
	
	public ContadorController(Contador contador) {
		this.contador = contador;
	}

	public Object contar(int iteracoes) {
		this.iteracoes = iteracoes;
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(run);
			threads.add(thread);
			thread.start();
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return contador.contador();
	}

}
