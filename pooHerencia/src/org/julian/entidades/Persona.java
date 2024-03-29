package org.julian.entidades;

public class Persona {

	private String nombre, apellido, email;
	private int edad;
	
	
	
	public Persona() {
		super();
		System.out.println("Ejecutando el constructor de la clase");
	}



	public Persona(String nombre, String apellido, String email, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad = edad;
		System.out.println("Ejecutando el constructor de la clase");
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", edad=" + edad + "]";
	}



	public String saludar() {
		return "Hola que tal!";
	}
	
}
