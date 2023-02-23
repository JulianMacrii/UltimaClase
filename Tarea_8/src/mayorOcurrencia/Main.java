package mayorOcurrencia;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {			
		
		int[] numeros;
		numeros = new int [10];
		
		Integer  numeroRepetido = -1;
		int cantidad = 0;
		Integer maxcant = 1;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 10; i++) {
			numeros[i] = sc.nextInt();
		}
		
		
		for (int i=0; i < 10; i++) {
				cantidad = 0;				
			for (int j = 0; j < 10; j++) {
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
	

