package com.curso.model;

import src.curso.interfaz.Conducible;

public class Barco extends Vehiculo implements Conducible {

	public Barco(String color, String matricula) {
		super(color, matricula);
	}

	@Override
	public void conducir() {
		if (isArrancado()) {
			System.out.println("No puedo volver a arrancar");
		} else {
			this.setArrancado(true);
			System.out.println("Soy el " + getClass().getSimpleName() + " y me han arrancado");
			setTiempoFinal(getTiempoInicial() + 15);
		}
	}

	@Override
	public void avanzar(int millas) {
		if (isArrancado()) {
			moverse(millas);
			System.out.println("Voy a avanzar " + millas + " millas, llevo " + getTiempoFinal()
					+ " segundos de viaje y " + getEspacioRecorrido() + " millas");

		} else {
			System.out.println("Necesitas arrancarme para avanzar");
		}
	}

	@Override
	public void retroceder(int millas) {
		if (!isArrancado()) {
			System.out.println("Necesitas arrancarme para retroceder");
		} else {
			moverse(millas);
			System.out.println("Voy a retroceder " + millas + " millas");
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
					.println("He realizado el viaje a " + getEspacioRecorrido() / getTiempoFinal() + " millas/segundo");
			System.out.println("Millas recorridos " + getEspacioRecorrido() + ". Tiempo de viaje " + getTiempoFinal());
		}
	}

}
