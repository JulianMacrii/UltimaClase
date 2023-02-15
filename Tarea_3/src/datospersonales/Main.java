package datospersonales;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nombre, apellido, lugarDeResidencia;
		int edad;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("Ingrese tu nombre: ");
		System.out.println("--------------------------------");
		nombre = scanner.nextLine();

		
		System.out.println("--------------------------------");
		System.out.println("Ingrese tu apellido: ");
		System.out.println("--------------------------------");
		apellido = scanner.nextLine();
		
		System.out.println("--------------------------------");
		System.out.println("Ingrese tu lugar de residencia: ");
		System.out.println("--------------------------------");
		lugarDeResidencia = scanner.nextLine();

		
		System.out.println("--------------------------------");
		System.out.println("Ingrese tu edad: ");
		System.out.println("--------------------------------");
		edad = Integer.parseInt(scanner.nextLine());

		System.out.println("Nombre: "+ nombre  + "."+ "\n" + "Apellido: " + apellido + "." +  "\n" + "Edad: " + edad + "." + "\n" + "Lugar de residencia: " + lugarDeResidencia);
	}

}
