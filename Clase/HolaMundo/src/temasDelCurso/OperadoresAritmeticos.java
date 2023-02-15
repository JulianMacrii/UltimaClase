package temasDelCurso;

public class OperadoresAritmeticos {

	public static void main (String[] args) {
		
		// Suma
		int i, j, suma;
		i=2;
		j=5;
		
		suma = i + j;
		System.out.println("Suma = " + suma);
		
		// resto
		int resto = 5%1;
		System.out.println("Resto = " + resto);
		
		// division 
		double div = (double)j/ (double)i;
		System.out.println("dIVISION = " + div);
		
		//incremento
		System.out.println("Incremento i en 1 = " + (++i));
		
		// i = i +1
		//System.out.println("iNCREMENTO I EN 1 = " + (i));
		
		// i +=55;
		
		// --Operador aritmetico y "-=" operador combinado
		i -= 55;
		System.out.println("I con += = " + (i));
		
		i *= 55;
		System.out.println("i multiplicado *= 55 = " +(i));
	}
}
