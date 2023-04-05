package Main;

import Entidades.Comics;
import Entidades.IProducto;
import Entidades.Iphone;
import Entidades.Libro;
import Entidades.Producto;
import Entidades.TvLed;

public class ProyectoCatalogo {

	public static void main(String[] args) {
		IProducto[] productos = new Producto[4]; 
		productos[0] = new Iphone(1000, "Iphone", "Iphone 11", "blanco");
		productos[1] = new TvLed(500, "Samsung", 50);
		productos[2] = new Libro(400, null, "Pedro", "Las aventuras de pedro", "AAA");
		productos[3] = new Comics(1000, null, "matias", "Las aventuras de matias", "BBB", "Matias y sus amigos");
		
		for(IProducto p : productos) {
			System.out.println(p.toString());
		}
	}

}
