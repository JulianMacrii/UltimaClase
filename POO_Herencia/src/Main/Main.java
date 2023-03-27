package Main;

import clases.Empleado;
import clases.Gerente;

public class Main {
	public static void main (String [] args) {
		Gerente gerente = new Gerente("Julian", "Macri", "4040404", "capital", 1000, 1, 1000);
		Empleado empleado = new Empleado ("juan", "martinez", "2020202", "tigre", 2000, 2);		
		
		System.out.println(gerente.toString());
		System.out.println("La remuneracion actual del gerente " + gerente.getNombre() + " " + gerente.getApellido() + " es: " + gerente.getRemuneracion());
		System.out.println("La remuneracion con el aumento porcentual es: " + gerente.aumentarRemuneracion(20));
		
		System.out.println();
		System.out.println(empleado.toString());
		System.out.println("La remuneracion actual del empleado " + empleado.getNombre() + " " + empleado.getApellido() + " es: " + empleado.getRemuneracion());
		System.out.print("La remuneracion con el aumento es: " + empleado.aumentarRemuneracion(10));
		
		
	}
}
