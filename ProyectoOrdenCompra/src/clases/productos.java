package clases;

public class productos {

	private String fabricante, nombre;
	private int precio;
	
	
	public productos(String fabricante, String nombre, int precio) {
		super();
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.precio = precio;
	}


	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
