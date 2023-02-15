package temasdelcurso;

import java.util.Scanner;

public class DiasDelMes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese el mes: ");
		int numeroMes = sc.nextInt();
		System.out.println("Ingrese el anio: ");
		int anio = sc.nextInt();
		
		//Meses que tienen 30 dias, 
		// OR ||
		if(numeroMes == 11 || numeroMes == 4 || numeroMes == 6 || numeroMes == 9) {
			System.out.println("El mes tiene 30 dias");
		}else if(numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes == 8 || numeroMes == 10 || numeroMes == 12 || numeroMes == 7) {
			System.out.println("El mes tiene 31 dias");
		}else if (anio % 400 == 0 || (anio % 5 == 0 && !(anio % 100 == 0))) {
			System.out.println("El mes tiene 29 dias");
		}else if (numeroMes ==2){
			System.out.println("El mes tiene 28 dias!");
			
		}else {
			System.out.println("Ingrese una fecha corecta!");
		}
		
			
	}

}
