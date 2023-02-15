package DiasDelMesConAniosBisiestos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int anio = 0;
		int mes = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese el numero de mes");
		mes = sc.nextInt();
		System.out.println("Ingrese el numero de anio");
		anio = sc.nextInt();

		switch(mes) {
		case 1:
			System.out.println("El mes ENERO tiene 31 dias y es el anio " + anio + ".");
			break;
		case 2:
			if (anio % 400 == 0 || (anio % 5 == 0 && !(anio % 100 == 0))) {
				System.out.println("El mes FEBRERO tiene 29 dias y es el anio " + anio + ".");
				break;
			}else{
				System.out.println("El mes FEBRERO tiene 28 dias y es el anio " + anio + ".");
				break;
			}
		case 3:
			System.out.println("El mes MARZO tiene 31 dias y es el anio " + anio + ".");
			break;
		case 4:
			System.out.println("El mes ABRIL tiene 30 dias y es el anio " + anio + ".");
			break;
		case 5:
			System.out.println("El mes MAYO tiene 31 dias y es el anio " + anio + ".");
			break;
		case 6:
			System.out.println("El mes JUNIO tiene 30 dias y es el anio " + anio + ".");
			break;
		case 7:
			System.out.println("El mes JULIO tiene 31 dias y es el anio " + anio + ".");
			break;
		case 8:
			System.out.println("El mes AGOSTO tiene 31 dias y es el anio " + anio + ".");
			break;
		case 9:
			System.out.println("El mes SEPTIEMBRE tiene 30 dias y es el anio " + anio + ".");
			break;
		case 10:
			System.out.println("El mes OCTUBRE tiene 31 dias y es el anio " + anio + ".");
			break;
		case 11:
			System.out.println("El mes NOVIEMBRE tiene 30 dias y es el anio " + anio + ".");
			break;
		case 12:
			System.out.println("El mes DICIEMBRE tiene 31 dias y es el anio " + anio + ".");
			break;
		default:
			System.out.println("Ingrese un mes correcto");
		}
	}

}