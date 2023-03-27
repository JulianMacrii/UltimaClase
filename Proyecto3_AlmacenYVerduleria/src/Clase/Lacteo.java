package Clase;

public class Lacteo extends Producto{
	private int cantidad, proteinas;

	public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
		super(nombre, precio);
		this.cantidad = cantidad;
		this.proteinas = proteinas;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getProteinas() {
		return proteinas;
	}

	public void setProteinas(int proteinas) {
		this.proteinas = proteinas;
	}

	@Override
	public String toString() {
		return "Lacteo [cantidad=" + cantidad + ", proteinas=" + proteinas + ", Cantidad=" + getCantidad()
				+ ", Proteinas=" + getProteinas() + "]";
	}
	
	
}
