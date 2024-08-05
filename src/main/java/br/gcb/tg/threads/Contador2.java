package br.gcb.tg.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Contador2 {

	private AtomicInteger num = new AtomicInteger();

	Runnable run = new Runnable() {

		public void run() {
			for (int i = 0; i < 10; i++) {
				num.addAndGet(1);
			}
		}
	};

	public static void main(String[] args) {
		new Contador2().execute();
	}

	private void execute() {
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(run);
			threads.add(thread);
			thread.start();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(num);
	}

}
