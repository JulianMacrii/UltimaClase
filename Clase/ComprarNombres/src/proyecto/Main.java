package proyecto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("_________________");
		System.out.println("PRIMER EJERCICIO");
		System.out.println("_________________");
		System.out.println("");
		
		String nombre_uno = "", nombre_dos = "";
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Ingrese el primer nombre: ");
		nombre_uno = entrada.nextLine();
		System.out.println("Ingrese el segundo nombre: ");
		nombre_dos = entrada.nextLine();
		
		String resultado = (nombre_uno.equals(nombre_dos))?"Los nombres coinciden":"los nombres no coinciden";
		System.out.println(resultado);
		
		
		System.out.println("_________________");
		System.out.println("SEGUNDO EJERCICIO");
		System.out.println("_________________");
		System.out.println("");
		
		String usuario = "", contraseña = "";
		System.out.print("Ingresa tu nombre de usuario: ");
		usuario = entrada.nextLine();

		System.out.print("Ingresa tu contraseña: ");
		contraseña = entrada.nextLine();

		if(usuario.equals("julian") && contraseña.equals("123456")){
		  System.out.println("Inicio de sesion correcto");
		 } else{
		     System.out.println("nombre de usuario o contraseña incorrecto");
		 }
	}
}
