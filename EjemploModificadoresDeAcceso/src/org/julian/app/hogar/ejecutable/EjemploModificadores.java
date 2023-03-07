package org.julian.app.hogar.ejecutable;

import org.julian.app.hogar.Persona;
import org.julian.app.hogar.Persona.*;
import org.julian.app.patio.Perro;

public class EjemploModificadores {

	public static void main(String[] args) {

		Perro perro = new Perro();
		
		perro.setNombre("Juan");
		perro.setRaza("Caniche");
		
		System.out.println("Nombre: " + perro.getNombre() + " " + perro.getRaza());

		Persona p = new Persona("Julian", "Macri");
		
		System.out.println(perro.jugar(p));

		
		
	}

}
