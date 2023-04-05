package org.julianmacri.pooclaseabstractas.felinos;

public class Guepardo extends Felino{

	public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, Float tamanoGarras,
			Integer velocidad) {
		super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String comer() {
		return "El guepardo caza junto a su grupo en las llanuras africanas, con una mordida inferior a los demas felinos grandes";
	}

	@Override
	protected String dormir() {
		// TODO Auto-generated method stub
		return "El guepardo duerme en las estepas africanas";
	}

	@Override
	protected String correr() {
		// TODO Auto-generated method stub
		return "El guepardo es el felino mas rapido del mundo, corre a " + getVelocidad() + " km/hr";
	}

	@Override
	protected String comunicarse() {
		// TODO Auto-generated method stub
		return "El guepardo ruge no tan fouerte como el Leon";
	}
	
}
