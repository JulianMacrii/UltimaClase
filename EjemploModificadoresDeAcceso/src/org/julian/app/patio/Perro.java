package org.julian.app.patio;

import org.julian.app.hogar.Persona;

public class Perro {
	private String nombre;
	private String raza;
	
	//public cualquier clase
	//private unicamente los atributos y metodos, se llaman dentro de la misma clase, se debe crear metodos publicos get y set.
	//
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String jugar(Persona p) { //Instancia de la clase persona
		return ("El perro esta jugando con la persona : " + p.getNombre() + " " + p.arrojarPelota() + " " + this.nombreYRaza());
	}
	
	private String nombreYRaza() {
		return this.nombre + this.raza;
		
	}
}
