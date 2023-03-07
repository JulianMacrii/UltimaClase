package mayorOcurrencia;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {			
<<<<<<< HEAD
		double[] numeros;
		numeros = new double [10];

		double  numeroRepetido = -1;
		int cantidad = 0;
=======
		
		int[] numeros;
		numeros = new int [10];
		
		Integer  numeroRepetido = -1;
		int cantidad = 0;
		Integer maxcant = 1;
>>>>>>> 023b04bd50725d27c0fc66be220e95855e760f01
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 10; i++) {
			numeros[i] = sc.nextInt();
		}
		
<<<<<<< HEAD
		for (int i=0; i < 10-1; i++) {
			for (int j = i + 1; j < 10; j++) {
=======
		
		for (int i=0; i < 10; i++) {
				cantidad = 0;				
			for (int j = 0; j < 10; j++) {
>>>>>>> 023b04bd50725d27c0fc66be220e95855e760f01
				if (numeros[i] == numeros[j]) {
					cantidad++;
				}
				if (cantidad > maxcant) {
					maxcant = cantidad;
					numeroRepetido = numeros[i];
				}
			}
		}
		if (maxcant == 1) {
			maxcant = null;
			numeroRepetido = null;
		}
		System.out.println("El numero con mayor ocurrencia es: " + numeroRepetido + " y se repite " + maxcant + " veces");
	}
}
	

