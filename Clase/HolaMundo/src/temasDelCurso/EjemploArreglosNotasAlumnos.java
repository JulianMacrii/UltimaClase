package temasDelCurso;

import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {

	public static void main(String[] args) {

		double[] claseMatematicas,  claseHistoria, claseLengua;
		double sumNotasMatematicas = 0, sumNotasHistoria= 0, sumNotasLengua=0;
		claseMatematicas = new double[7];
		claseHistoria = new double[7];
		claseLengua = new double[7];
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese 7 notas de estudiantes para matematicas: ");
		for(int i=0; i < claseMatematicas.length; i++) {
			claseMatematicas[i] = scanner.nextDouble();
			
		}
		System.out.println("Ingrese 7 notas de estudiantes para historia: ");
		for(int i=0; i < claseHistoria.length; i++) {
			claseHistoria[i] = scanner.nextDouble();
			
		}
		System.out.println("Ingrese 7 notas de estudiantes para lengua: ");
		for(int i=0; i < claseLengua.length; i++) {
			claseLengua[i] = scanner.nextDouble();
			
		}
		for (int i = 0; i < 7; i++) {
			sumNotasMatematicas +=  claseMatematicas[i];
			sumNotasHistoria += claseHistoria[i];
			sumNotasLengua += claseLengua[i];

		}
		double promedioMatematicas = (sumNotasMatematicas/claseMatematicas.length);
		double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
		double promedioLengua = (sumNotasLengua/claseLengua.length);
		
		System.out.println("Promedio de matematicas: " + promedioMatematicas);
		System.out.println("Promedio de historia: " + promedioHistoria);
		System.out.println("Promedio de Lengua: " + promedioLengua);

		System.out.println("El promedio total es: " + (promedioHistoria + promedioLengua + promedioMatematicas)/3);

		System.out.println("Ingrese el numero de alumno (0-6)");
		int id = scanner.nextInt();
		double promedioAlumno = ((claseMatematicas[id] + claseHistoria[id] + claseLengua[id]) / 3);
        System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);
    		
	}

}
