package org.julian.entidades;

public class Alumno extends Persona{

	private String institucion;
	private double notaMatematica;
	private double notaHistoria;
	private double notaCastellano;
	
	
	

	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellido, String email, int edad, String institucion, double notaMatematica,
			double notaHistoria, double notaCastellano) {
		super(nombre, apellido, email, edad);
		this.institucion = institucion;
		this.notaMatematica = notaMatematica;
		this.notaHistoria = notaHistoria;
		this.notaCastellano = notaCastellano;
	}
	
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public double getNotaHistoria() {
		return notaHistoria;
	}
	public void setNotaHistoria(double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}
	public double getNotaCastellano() {
		return notaCastellano;
	}
	public void setNotaCastellano(double notaCastellano) {
		this.notaCastellano = notaCastellano;
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		String saludoPadre = super.saludar();
		return super.saludar() + " soy el Alumno de la institucion " + this.institucion;
	}
	
	
	public Double calcularPromedio() {
	
		return (this.notaCastellano + this.notaHistoria + this.notaMatematica ) / 3;
	}

	@Override
	public String toString() {
		return super.toString(); 
		//+ "El promedio es: " + calcularPromedio(); se agrega al to string de persona
	}
	
	
	
	
	
}
