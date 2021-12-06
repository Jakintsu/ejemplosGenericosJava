package com.genericos.ejemplos;

public interface ColeccionSimple<E> {

	boolean estaVacia();
	boolean aniadir(E o);
	E primero();
	E extraer();
}
