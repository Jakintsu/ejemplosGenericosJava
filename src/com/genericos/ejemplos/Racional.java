package com.genericos.ejemplos;

public class Racional implements Operable<Racional> {

	private int numerador;
	private int denominador;

	public Racional(int numerador, int denominador) {
		if (denominador == 0) {
			throw new IllegalArgumentException("El denominador no puede ser 0");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	// Implementamos los métodos de la interface Operable
	@Override
	public Racional suma(Racional racional) {
		int numeradorRespuesta = numerador * racional.getDenominador() + racional.getNumerador() * denominador;
		int denominadorRespuesta = denominador * racional.getDenominador();
		return new Racional(numeradorRespuesta, denominadorRespuesta);
	}

	@Override
	public Racional resta(Racional racional) {
		int numeradorRespuesta = numerador * racional.getDenominador() - racional.getNumerador() * denominador;
		int denominadorRespuesta = denominador * racional.getDenominador();
		return new Racional(numeradorRespuesta, denominadorRespuesta);
	}

	@Override
	public Racional producto(Racional racional) {
		int numeradorRespuesta = numerador * racional.getNumerador();
		int denominadorRespuesta = denominador * racional.getDenominador();
		return new Racional(numeradorRespuesta, denominadorRespuesta);
	}

	@Override
	public Racional division(Racional racional) {
		int numeradorRespuesta = numerador * racional.getDenominador();
		int denominadorRespuesta = denominador * racional.getNumerador();
		if (denominadorRespuesta == 0) {
			throw new ArithmeticException("Denominador no válido, por ser 0");
		}
		return new Racional(numeradorRespuesta, denominadorRespuesta);
	}

	public String toString() {

		return numerador + "/" + denominador;

	}

	// NOTA: El resultado está sin simplificar. Se podría escribir un método
	// simplificar y llamarlo después
	// de cada operación.

}
