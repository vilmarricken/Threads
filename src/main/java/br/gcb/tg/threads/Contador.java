package br.gcb.tg.threads;

public class Contador {

	private int num = 0;

	public synchronized void incrementar() {
		num = num + 1;
	}

	public int contador() {
		return num;
	}

}
