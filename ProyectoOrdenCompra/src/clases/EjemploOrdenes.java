package clases;

public class EjemploOrdenes {

	public static void main(String[] args) {
		
		cliente c1 = new cliente ("Juan", "perez");
		
		productos p1 = new productos ("Arcor", "Arroz", 20);
		productos p2 = new productos ("Marolio", "Fideos", 10);
		productos p3 = new productos ("Samsung", "celular", 200);
		productos p4 = new productos ("PPP","BBB", 5);
		
		productos p5 = new productos ("abc", "Arroz", 31);
		productos p6 = new productos ("def", "Fideos", 45);
		productos p7 = new productos ("ghi", "celular", 199);
		productos p8 = new productos ("jkl","BBB", 24);
		
		productos p9 = new productos ("123", "Arroz", 1);
		productos p10 = new productos ("456", "Fideos", 223);
		productos p11 = new productos ("789", "celular", 56);
		productos p12 = new productos ("101","BBB", 2);
		
		OrdenCompra OC = new OrdenCompra ("Venta de cosas");
		OrdenCompra OC2= new OrdenCompra ("Venta de letras");
		OrdenCompra OC3 = new OrdenCompra ("Venta de numeros");

		OC.addProducto(p1);
		OC.addProducto(p2);
		OC.addProducto(p3);
		OC.addProducto(p4);
		OC.setCliente(c1);
		OC2.addProducto(p5);
		OC2.addProducto(p6);
		OC2.addProducto(p7);
		OC2.addProducto(p8);
		OC2.setCliente(c1);
		OC3.addProducto(p9);
		OC3.addProducto(p10);
		OC3.addProducto(p11);
		OC3.addProducto(p12);
		OC3.setCliente(c1);
		
		System.out.println();
		System.out.println(OC.toString());
		System.out.println();
		productos [] productos = OC.getProductos();
		for(productos p : productos) {
			System.out.println(p.getFabricante() + " " + p.getNombre() + " " + p.getPrecio());
		}
		
		System.out.println();
		
		OC.sumar();
		System.out.println();
		System.out.println(OC2.toString());
		System.out.println();
		productos [] productos2 = OC2.getProductos();
		for(productos p : productos2) {
			System.out.println(p.getFabricante() + " " + p.getNombre() + " " + p.getPrecio());
		}
		
		OC2.sumar();
		
		System.out.println();
		System.out.println(OC3.toString());
		System.out.println();
		productos [] productos3 = OC3.getProductos();
		for(productos p : productos3) {
			System.out.println(p.getFabricante() + " " + p.getNombre() + " " + p.getPrecio());
		}
		OC3.sumar();
		



		
	}

}
