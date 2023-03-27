package org.julian.entidades;

public class Alumnointernacional extends Alumno{
	private String pais;
	private Double notaIdiomas;
	
	
	public Alumnointernacional() {
		System.out.println("Creando alumno internacional");
	}

	public Alumnointernacional(String nombre, String apellido, String email, int edad, String institucion,
			double notaMatematica, double notaHistoria, double notaCastellano, String pais, Double notaIdiomas) {
		super(nombre, apellido, email, edad, institucion, notaMatematica, notaHistoria, notaCastellano);
		this.pais = pais;
		this.notaIdiomas = notaIdiomas;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Double getNotaIdiomas() {
		return notaIdiomas;
	}
	public void setNotaIdiomas(Double notaIdiomas) {
		this.notaIdiomas = notaIdiomas;
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return super.saludar();
	}

	@Override
	public Double calcularPromedio() {
		// TODO Auto-generated method stub
		return (this.getNotaCastellano() + this.getNotaHistoria() + this.getNotaMatematica() + this.notaIdiomas)/4;
	}
	
	
}
