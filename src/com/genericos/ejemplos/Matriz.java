package com.genericos.ejemplos;

public class Matriz<E> {

	private E[][] tabla;
	
	public Matriz(int filas, int columnas) {
		//Conversión de tipo a E[][]; no se pueden crear arrays de un tipo genérico
		tabla = (E[][]) new Object[filas][columnas];
	}
	
	public void set(int fila, int columna, E elemento) {
		tabla[fila][columna] = elemento;
	}
	
	public E get(int fila, int columna) {
		return tabla[fila][columna];
	}
	
	public int columnas() {
		return tabla[0].length;
	}
	public int filas() {
		return tabla.length;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[0].length; j++) {
				s +=tabla[i][j]+"\t";
			}
			s+="\n";
		}
		return s;
	}
	
	/**
	 * Las celdas de la matriz no se inicializan a ningún valor, por lo que el
	 * resultado de get() podría ser null. Al llamar al método toString() también cabe la posibilidad de que devuelva null
	 * para alguna de las celdas.
	 */
}
