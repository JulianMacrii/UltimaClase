package Clase;

public class Main {

	public static void main(String[] args) {
		Lacteo lacteo1 = new Lacteo("Leche", 200.50, 1,150);
		Lacteo lacteo2 = new Lacteo("Queso", 1900.50, 1,550);
		Fruta fruta1 = new Fruta("Manza", 840.50, 4.0, "Rojo");
		Fruta fruta2 = new Fruta("Banana", 470.50, 4.0, "amarilla");
		Limpieza limpieza1 = new Limpieza("Producto de piso", 1200.20, "Aromatizador", 10.0);
		Limpieza limpieza2 = new Limpieza("Producto de ropa", 940.20, "suavizante", 5.0);
		NoPerecible noPerecible1 = new NoPerecible("Arroz", 450.50, 1,500);
		NoPerecible noPerecible2 = new NoPerecible("Fideos", 300.50, 1,400);
		
		
		Producto producto[] = {lacteo1, lacteo2, fruta1, fruta2, limpieza1, limpieza2, noPerecible1, noPerecible2};

		for (Producto i : producto) {
			System.out.println("=======================================");
			System.out.println("El nombre de producto es: " + i.getNombre());
			System.out.println("El precio es: " + i.getPrecio());
			System.out.println(i.toString());
		
		}
	}

}
