package Entidades;

import java.util.Date;

public class Comics extends Libro{
	private String personaje;

	
	public Comics(int precio, Date fecha, String autor, String titulo, String editorial, String personaje) {
		super(precio, fecha, autor, titulo, editorial);
		this.personaje = personaje;
	}


	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return precio;
	}


	@Override
	public String toString() {
		return "Comics [personaje=" + personaje + ", precio=" + precio + "]";
	}
	
	
}
