package org.julianmacri.pooclasesabstractas.canino;

import org.julianmacri.pooclasesabstracta.mamiferos.Mamifero;

public abstract class Canino extends Mamifero{
	private String color;
	private Float tamanoColmillos;
	
	public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
			Float tamanoColmillos) {
		super(habitat, altura, largo, peso, nombreCientifico);
		this.color = color;
		this.tamanoColmillos = tamanoColmillos;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getTamanoColmillos() {
		return tamanoColmillos;
	}
	public void setTamanoColmillos(Float tamanoColmillos) {
		this.tamanoColmillos = tamanoColmillos;
	}

	


	
	
}
