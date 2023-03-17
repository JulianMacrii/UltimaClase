package clases;

import java.util.Arrays;
import java.util.Date;


public class OrdenCompra {

	private int identificador;
	private String descripcion;
	private Date fecha = new Date();
	private cliente Cliente;
	private productos[] productos = new productos[4];
	private int nroproducto = 0, sum;
	
	private static int ultimoId;
	
	
	public OrdenCompra(String descripcion) {
		this.descripcion = descripcion;
		this.identificador = ++ultimoId;
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

	public void imprimir() {
			for(productos p : productos) {
				System.out.println((p.getFabricante() + " " + p.getNombre() + " " + p.getPrecio()));
			}
					
		
		}
	
	
	@Override
	public String toString() {
		return "OrdenCompra [identificador=" + identificador + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", Cliente=" + Cliente.getNombre() + " " + Cliente.getApellido() + ", nroproducto=" + nroproducto
				+ "]";
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
