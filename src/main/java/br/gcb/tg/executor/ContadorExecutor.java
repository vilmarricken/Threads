package br.gcb.tg.executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ContadorExecutor {

	public int contar(int iteracoes) {

		Contador contador = new Contador();

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Collection<Callable<Integer>> tasks = new ArrayList<>();
		
		Callable<Integer> task = () -> {
			for (int j = 0; j < iteracoes; j++) {
				contador.incrementar();
			}
			return contador.contador();
		};

		for (int i = 0; i < 10; i++) {
			tasks.add(task);
		}

		
		try {
			executorService.invokeAll(tasks);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		executorService.shutdown();
		return contador.contador();
	}
}
