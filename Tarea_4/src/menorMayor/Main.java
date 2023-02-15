package menorMayor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String primerNombre, segundoNombre, tercerNombre;
		String mayor = "error";
		System.out.println("Ingrese el primer nombre: ");
		primerNombre = sc.nextLine();
		System.out.println("Ingrese el segundo nombre: ");
		segundoNombre = sc.nextLine();
		System.out.println("Ingrese el tercer nombre: ");
		tercerNombre = sc.nextLine();
		
		if(primerNombre.length() >= segundoNombre.length() & primerNombre.length() > tercerNombre.length()){
			System.out.print(primerNombre + " ");
			mayor = primerNombre;
			if (segundoNombre.length() > tercerNombre.length()) {
				System.out.print(segundoNombre + " ");
				System.out.print(tercerNombre);
			}else {
				System.out.print(tercerNombre + " ");
				System.out.print(segundoNombre);
			}
		}else if(segundoNombre.length() > primerNombre.length() & segundoNombre.length() >= tercerNombre.length()) {
			System.out.print(segundoNombre + " ");
			mayor = segundoNombre;
			if(tercerNombre.length() > primerNombre.length()) {
				System.out.print(tercerNombre + " ");
				System.out.println(segundoNombre);
			}else {
				System.out.print(primerNombre + " ");
				System.out.println(tercerNombre);
			}
		}else if(tercerNombre.length() >= primerNombre.length() & tercerNombre.length() > segundoNombre.length()) {
			System.out.print(tercerNombre + " ");
			mayor = tercerNombre;
			if (primerNombre.length() > segundoNombre.length()) {
				System.out.print(primerNombre + " ");
				System.out.print(segundoNombre);
			}else {
				System.out.print(segundoNombre + " ");
				System.out.print(primerNombre);
			}
		
		}else  {
			System.out.print(primerNombre + " ");
			System.out.print(segundoNombre + " ");
			System.out.print(tercerNombre);
			mayor = primerNombre;
		}
		System.out.println();
		System.out.println("Ordenamiento completo");
		System.out.println();
		System.out.println("El nombre mas largo es " + mayor + " y tiene " + mayor.length() + " caracteres.");

		
	}
	
}
