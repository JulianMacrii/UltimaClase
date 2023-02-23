package mayorOcurrencia;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {			
		double[] numeros, t;
		double  numeroRepetido = -1;
		int cantidad = 0;
		numeros = new double [10];
		double numeromayor = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = sc.nextDouble();
		}
		for (int i=0; i < 10-1; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (numeros[i] == numeros[j]) {
					numeroRepetido = numeros[i];
					if(numeroRepetido == numeros[i]){
					cantidad++;
					}
				}
			}
		}
		System.out.println("El numero con mayor ocurrencia es: " + numeroRepetido + "M " + cantidad);
	}
}

