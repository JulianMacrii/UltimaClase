package clases;

import java.util.Arrays;
import java.util.Date;


public class OrdenCompra {

	private Integer identificador;
	private String descripcion;
	private Date fecha;
	private cliente Cliente;
	private productos[] productos;
	private int nroproducto, sum;
	
	public OrdenCompra(Integer identificador, String descripcion, Date fecha, cliente cliente) {
		super();
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.fecha = fecha;
		Cliente = cliente;
	}

	
	public void addProducto (productos producto) {
		productos[nroproducto] = producto;
		nroproducto++;	
	}
	

	public void sumar (productos p) {
		for(productos p1 : productos) {
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
