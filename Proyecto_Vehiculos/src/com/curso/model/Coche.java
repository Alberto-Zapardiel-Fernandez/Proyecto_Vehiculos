package com.curso.model;

public class Coche extends Vehiculo {

	private final static int RUEDAS = 4;

	public Coche(String color, String matricula) {
		super(color, matricula);
	}

	@Override
	public void conducir() {
		if (isArrancado()) {
			System.out.println("No puedo volver a arrancar");
		} else {
			this.setArrancado(true);
			System.out.println(
					"Soy el " + getClass().getSimpleName() + " por que tengo " + RUEDAS + " ruedas y me han arrancado");
			setTiempoFinal(getTiempoInicial() + 15);
		}
	}

	@Override
	public void avanzar(int metros) {
		if (isArrancado()) {
			moverse(metros);
			System.out.println("Voy a avanzar " + metros + " metros, llevo " + getTiempoFinal()
					+ " segundos de viaje y " + getEspacioRecorrido() + " metros");

		} else {
			System.out.println("Necesitas arrancarme para avanzar");
		}
	}

	@Override
	public void retroceder(int metros) {
		if (!isArrancado()) {
			System.out.println("Necesitas arrancarme para retroceder");
		} else {
			moverse(metros);
			System.out.println("Voy a retroceder " + metros + " metros");
		}

	}

	@Override
	public void parar() {
		if (!isArrancado()) {
			System.out.println("Ya estoy parado, necesito arrancar para parar");
		} else {
			System.out.println("He parado");
			setArrancado(false);
			System.out
					.println("He realizado el viaje a " + getEspacioRecorrido() / getTiempoFinal() + " metros/segundo");
			System.out.println("Metros recorridos " + getEspacioRecorrido() + ". Tiempo de viaje " + getTiempoFinal());
		}
	}

	/**
	 * @return the ruedas
	 */
	public static int getRuedas() {
		return RUEDAS;
	}

}
