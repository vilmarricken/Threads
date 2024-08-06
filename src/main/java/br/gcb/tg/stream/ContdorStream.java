package br.gcb.tg.stream;

import java.util.ArrayList;
import java.util.Collection;

public class ContdorStream {

	public Collection<Integer> pares(Collection<Integer> valores) {
		Collection<Integer> pares = new ArrayList<>();
		valores.parallelStream().forEach(valor -> {
			if (valor.intValue() % 2 == 0) {
				pares.add(valor);
			}
		});
		return pares;
	}

}
