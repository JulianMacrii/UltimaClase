package org.julianmacri.pooclasesabstracta.mamiferos;

public abstract class Mamifero { //Clases abstractas con protected
	
	protected String habitat;
	protected float altura, largo, peso;
	protected String nombreCientifico;
	
	
	
	
	public Mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {
		super();
		this.habitat = habitat;
		this.altura = altura;
		this.largo = largo;
		this.peso = peso;
		this.nombreCientifico = nombreCientifico;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getLargo() {
		return largo;
	}
	public void setLargo(float largo) {
		this.largo = largo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	@Override
	public String toString() {
		return "Mamifero [habitat=" + habitat + ", altura=" + altura + ", largo=" + largo + ", peso=" + peso
				+ ", nombreCientifico=" + nombreCientifico + "]";
	}
	
	protected abstract String comer();
	protected abstract String dormir();
	protected abstract String correr();
	protected abstract String comunicarse();
	
}
