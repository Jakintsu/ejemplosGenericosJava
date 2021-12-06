package com.genericos.ejemplos;

import java.util.ArrayList;
import java.util.List;

//restringimos el tipo genérico a las que implementan la interfaz Comparable
public class ListaOrdenada<E extends Comparable<E>> {
	private List<E> lista;

	public ListaOrdenada() {
		lista = new ArrayList<E>();
	}

	public boolean add(E objeto) {
		for (int i = 0; i < lista.size(); i++) {
			if (objeto.compareTo(lista.get(i)) < 0) {
				lista.add(i, objeto);
				return true;
			}
		}
		lista.add(objeto);
		return true;
	}

	public E get(int index) {
		return lista.get(index);
	}

	public int size() {
		return lista.size();
	}

	public boolean isEmpty() {
		return lista.isEmpty();
	}

	public boolean remove(E objeto) {
		return lista.remove(objeto);
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < lista.size(); i++) {
			s += lista.get(i) + "\n";
		}
		return s;
	}
	
	//El método equals de la clase Object sólo compara referencias a objetos.
}
