package clases;

import java.util.Arrays;
import java.util.Date;


public class OrdenCompra {

	private Integer identificador;
	private String descripcion;
	private Date fecha;
	private cliente Cliente;
	private productos[] productos = new productos[4];
	private int nroproducto = 0, sum;
	
	public OrdenCompra(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public void addProducto (productos nuevop) {
		if(nroproducto < 4) {
			productos[nroproducto] = nuevop;
			nroproducto++;
		}
		
	}
	

	public void sumar () {
		for(productos p : productos) {
			sum += p.getPrecio();
		}
		System.out.println("La suma de los productos es: " + sum);
	}

	

	
	@Override
	public String toString() {
		return "OrdenCompra [identificador=" + identificador + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", Cliente=" + Cliente + ", productos=" + Arrays.toString(productos) + ", nroproducto=" + nroproducto
				+ ", sum=" + sum + "]";
	}


	public Integer getIdentificador() {
		return identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public cliente getCliente() {
		return Cliente;
	}

	public void setCliente(cliente cliente) {
		Cliente = cliente;
	}

	public productos[] getProductos() {
		return productos;
	}

	
	
	
	
	
}
