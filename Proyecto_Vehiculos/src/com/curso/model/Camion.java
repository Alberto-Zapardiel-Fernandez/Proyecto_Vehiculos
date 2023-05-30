package com.curso.model;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo {

	private List<Integer> tacometro;
	private int ruedas;

	public Camion(String color, String matricula, int ruedas) {
		super(color, matricula);
		tacometro = new ArrayList<>();
		if (ruedas < 6) {
			System.out.println("No es un camión si no tiene mínimo 6 ruedas, poniendo 6 por defecto");
			setRuedas(6);
		} else {
			this.ruedas = ruedas;
		}
	}

	@Override
	public void conducir() {
		if (isArrancado()) {
			System.out.println("No puedo volver a arrancar");
		} else {
			this.setArrancado(true);
			System.out.println("Soy el " + getClass().getSimpleName() + " por que tengo " + getRuedas()
					+ " ruedas y me han arrancado");
			setTiempoFinal(getTiempoInicial() + 15);
		}
	}

	@Override
	public void avanzar(int metros) {
		if (isArrancado()) {
			moverse(metros);
			System.out.println("Voy a avanzar " + metros + " metros, llevo " + getTiempoFinal()
					+ " segundos de viaje y " + getEspacioRecorrido() + " metros");
			tacometro.add(getEspacioRecorrido() / getTiempoFinal());
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
			tacometro.add(getEspacioRecorrido() / getTiempoFinal());
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
			System.out.println("Lista de velocidades: " + tacometro.toString());
		}
	}

	/**
	 * @return the velocidades
	 */
	public List<Integer> getVelocidades() {
		return tacometro;
	}

	/**
	 * @return the ruedas
	 */
	public int getRuedas() {
		return ruedas;
	}

	/**
	 * @param ruedas the ruedas to set
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

}
