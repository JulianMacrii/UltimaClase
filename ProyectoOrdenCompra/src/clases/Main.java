package clases;

public class Main {

	public static void main(String[] args) {
		
		cliente c1 = new cliente ("Juan", "perez");
		productos p1 = new productos ("Arcor", "Arroz", 20);
		productos p2 = new productos ("Marolio", "Fideos", 10);
		productos p3 = new productos ("Samsung", "celular", 200);
		productos p4 = new productos ("PPP","BBB", 5);
		
		OrdenCompra OC = new OrdenCompra (1, "Venta de cosas", null, c1);
		OC.addProducto(p1);
		OC.addProducto(p2);
		OC.addProducto(p3);
		OC.addProducto(p4);
		
		OC.sumar(p1);
		
		OC.toString();
		
	}

}
