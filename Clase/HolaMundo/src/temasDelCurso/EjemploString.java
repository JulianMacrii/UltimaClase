package temasDelCurso;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringUno = "Curso Java";
		
		String stringDos = new String("Curso java");
		
		int entero = 1;
		
		System.out.println("String stringUno = " + stringUno);
		
		System.out.println("String stringDos = " + stringDos);
		
		int largoDeCadena = stringUno.length();
		//Metodo Lenght() --> Cantidad de caracteres
		System.out.println("Largo del StringUno = " + stringUno.length());
		
		
		//Equals 
		
		boolean sonIguales = stringUno == stringDos;
		System.out.println("Son iguales? == " + sonIguales); //Dos direcciones de memoria distintas 
		
		boolean sonIgualesEquals = stringUno.equals(stringDos);
		System.out.println("Son iguales? == " + sonIgualesEquals);
		
		boolean sonIgualesEqualsIgnoreCase = stringUno.equalsIgnoreCase(stringDos);
		System.out.println("Son iguales? == " + sonIgualesEqualsIgnoreCase);

		char caracter = stringUno.charAt(3); //char guarda 1 caracter
		System.out.println("Caracter en el indice 3 = " + caracter);
		
		String nombre = "julian";
		String apellido = "Macri";
		System.out.println("Nombre completo = " + nombre.concat(apellido));
		
		//
		boolean contiene = nombre.contains("dro"); //a ver si contiene la secuencia de caracteres
		System.out.println("Contiene la secuencia \"dro?\" " + contiene);
		
		nombre.startsWith("J");
		nombre.endsWith("o");
		
		//No se puede inicializar con un objeto con valor null
		String nombreSecundario = null;
		
		if(nombreSecundario != null) {
			System.out.println("concatenacion de objeto String null = " + nombreSecundario.concat(stringDos));
		} else {
			System.out.println("Es null");
		}
	}

}
