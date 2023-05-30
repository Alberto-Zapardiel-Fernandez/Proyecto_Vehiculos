package com.curso.model;

import com.curso.interfaz.Conducible;

public abstract class Vehiculo implements Conducible {

	private String color;
	private String matricula = "";
	private int tiempoInicial = 0, espacioRecorrido = 0, tiempoFinal = 0;
	private boolean arrancado = false;
	/**
	 * Tiempo base para cada movimiento
	 */
	public static final int TIEMPO_BASE_MOVIMIENTO = 20;

	/**
	 * @param color     del vehiculo
	 * @param matricula del vehículo
	 */
	public Vehiculo(String color, String matricula) {
		super();
		this.color = color;
		this.matricula = matricula;
	}

	/**
	 * @return the arrancado
	 */
	public boolean isArrancado() {
		return arrancado;
	}

	/**
	 * @param arrancado the arrancado to set
	 */
	public void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the tiempoInicial
	 */
	public int getTiempoInicial() {
		return tiempoInicial;
	}

	/**
	 * @param tiempoInicial the tiempoInicial to set
	 */
	public void setTiempoInicial(int tiempoInicial) {
		this.tiempoInicial = tiempoInicial;
	}

	/**
	 * @return the espacioRecorrido
	 */
	public int getEspacioRecorrido() {
		return espacioRecorrido;
	}

	/**
	 * @param espacioRecorrido the espacioRecorrido to set
	 */
	public void setEspacioRecorrido(int espacioRecorrido) {
		this.espacioRecorrido = espacioRecorrido;
	}

	/**
	 * @return the tiempoFinal
	 */
	public int getTiempoFinal() {
		return tiempoFinal;
	}

	/**
	 * @param tiempoFinal the tiempoFinal to set
	 */
	public void setTiempoFinal(int tiempoFinal) {
		this.tiempoFinal = tiempoFinal;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * 
	 * @param nombreVehiculo es el nombre del vehículo a pintar
	 * @param color          es el color del que se pintará
	 */
	public void pintarVehiculo(String nombreVehiculo, String color) {
		setColor(color);
		System.out.println("Soy un " + nombreVehiculo + " y me están pintando de color " + color);
	}

	/**
	 * @param metros a moverse y calcular el tiempo final
	 */
	public void moverse(int metros) {
		setEspacioRecorrido(getEspacioRecorrido() + metros);
		setTiempoFinal(getTiempoFinal() + Vehiculo.TIEMPO_BASE_MOVIMIENTO);
	}
}
