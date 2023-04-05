package org.julianmacri.pooclaseabstractas.felinos;

import org.julianmacri.pooclasesabstracta.mamiferos.Mamifero;

public abstract class Felino extends Mamifero  {
	private Float tamanoGarras;
	private Integer velocidad;
	

	public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, Float tamanoGarras,
			Integer velocidad) {
		super(habitat, altura, largo, peso, nombreCientifico);
		this.tamanoGarras = tamanoGarras;
		this.velocidad = velocidad;
	}

	public Float getTamanoGarras() {
		return tamanoGarras;
	}

	public void setTamanoGarras(Float tamanoGarras) {
		this.tamanoGarras = tamanoGarras;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}


	
	
}
