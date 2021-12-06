package com.genericos.ejemplos;

public interface Operable<E> {
	//Todas las operaciones reciben y devuelven objetos de tipo gen�rico
	E suma(E obj);

	E resta(E obj);

	E producto(E obj);

	E division(E obj);

}
