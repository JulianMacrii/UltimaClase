package Entidades;

import java.util.Date;

public class Libro extends Producto implements ILibro{
	private Date fecha = new Date();
	private String autor, titulo, editorial;
	
	

	public Libro(int precio, Date fecha, String autor, String titulo, String editorial) {
		super(precio);
		this.fecha = fecha;
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}
	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return precio;
	}
	@Override
	public Date getFechaPublicacion() {
		// TODO Auto-generated method stub
		return fecha;
	}
	@Override
	public String autor() {
		// TODO Auto-generated method stub
		return autor;
	}
	@Override
	public String titulo() {
		// TODO Auto-generated method stub
		return titulo;
	}
	@Override
	public String editorial() {
		// TODO Auto-generated method stub
		return editorial;
	}
	@Override
	public String toString() {
		return "Libro [fecha=" + fecha + ", autor=" + autor + ", titulo=" + titulo + ", editorial=" + editorial
				+ ", precio=" + precio + "]";
	}
	
	
	
}
