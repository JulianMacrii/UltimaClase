package org.julian.entidades;

public class Profesor extends Persona{
	private String asignatura;

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	
	public Profesor() {
		System.out.println("Creando la instancia profesor");
	}

	public Profesor(String asignatura) {
		super();
		this.asignatura = asignatura;
		System.out.println("Creando el profesor!");
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return super.saludar( ) + " Soy el profesor de la asignatura: " + this.asignatura;
	}
	
	
	
	
}
