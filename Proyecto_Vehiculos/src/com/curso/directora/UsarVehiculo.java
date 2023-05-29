package com.curso.directora;

import com.curso.model.Barco;
import com.curso.model.Camion;
import com.curso.model.Coche;
import com.curso.model.Vehiculo;

public class UsarVehiculo {

	public static void main(String[] args) {
		System.out.println("===========COCHE==========");
		Vehiculo coche = new Coche("Azul", "1234");
		System.out.println("Soy de color " + coche.getColor());
		coche.pintarVehiculo(Coche.class.getSimpleName(), "Rojo");
		System.out.println("Soy de color " + coche.getColor());
		((Coche) coche).avanzar(15);
		((Coche) coche).conducir();
		((Coche) coche).avanzar(15);
		((Coche) coche).avanzar(150);
		((Coche) coche).avanzar(500);
		((Coche) coche).retroceder(10);
		((Coche) coche).conducir();
		((Coche) coche).parar();

		System.out.println("============CAMION===========");

		Vehiculo camion = new Camion("Verde", "asd1232", 4);
		System.out.println("Soy de color " + camion.getColor());
		camion.pintarVehiculo(Camion.class.getSimpleName(), "Rojo");
		System.out.println("Soy de color " + camion.getColor());
		((Camion) camion).avanzar(15);
		((Camion) camion).conducir();
		((Camion) camion).avanzar(295);
		((Camion) camion).avanzar(150);
		((Camion) camion).avanzar(300);
		((Camion) camion).retroceder(120);
		((Camion) camion).conducir();
		((Camion) camion).parar();
		System.out.println("============BARCO===========");

		Vehiculo barco = new Barco("Blanco", "1233ssa");
		System.out.println("Soy de color " + barco.getColor());
		barco.pintarVehiculo(Barco.class.getSimpleName(), "Amarillo");
		System.out.println("Soy de color " + barco.getColor());
		((Barco) barco).avanzar(15);
		((Barco) barco).conducir();
		((Barco) barco).avanzar(125);
		((Barco) barco).avanzar(150);
		((Barco) barco).avanzar(500);
		((Barco) barco).retroceder(50);
		((Barco) barco).conducir();
		((Barco) barco).parar();

	}

}
