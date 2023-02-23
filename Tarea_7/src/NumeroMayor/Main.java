package NumeroMayor;


public class Main {

	public static void main(String[] args) {
		
		double[] numeros;
		numeros = new double [10];
		double numeromayor = 0;
		
		
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = Math.floor(Math.random()*10);
			System.out.println(numeros[i]);
			if (numeros[i]>numeromayor) {
				numeromayor = numeros[i];
			}
		}
		System.out.println("El numero mayor es: " + numeromayor);
	}

}
