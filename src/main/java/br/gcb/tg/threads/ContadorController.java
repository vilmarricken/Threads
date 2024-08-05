package br.gcb.tg.threads;

import java.util.ArrayList;
import java.util.List;

public class ContadorController {

	private Contador contador;

	Runnable run = new Runnable() {
		public void run() {
			for (int i = 0; i < 10; i++) {
				contador.incrementar();
			}
		}
	};
	
	public ContadorController(Contador contador) {
		this.contador = contador;
	}

	public Object contar(int iteracoes) {
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < iteracoes; i++) {
			Thread thread = new Thread(run);
			threads.add(thread);
			thread.start();
		}
		return contador.contador();
	}

}
