package Entidades;

public class Iphone extends Electronico{
	private String modelo;
	private String color;
	
	
	
	public Iphone(int precio, String fabricante, String modelo, String color) {
		super(precio, fabricante);
		this.modelo = modelo;
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return precio;
	}
	
	@Override
	public String toString() {
		return "Iphone [modelo=" + modelo + ", color=" + color + ", fabricante=" + fabricante + ", precio=" + precio
				+ "]";
	}
	
	
	
	
}
