package datospersonales;

import javax.swing.JOptionPane; 

public class Main {
	public static void main (String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
		
		//Mayuscula
		/*String primeraletra = nombre.substring(0, 1);
		String restoLetra = nombre.substring(1, nombre.length());
		primeraletra = primeraletra.toUpperCase();
		nombre = primeraletra + restoLetra;*/
		
		String apellido = JOptionPane.showInputDialog(null, "Ingrese su Apellido: ");
		
		/* String primeraletraA = apellido.substring(0, 1);
		String restoLetraA = apellido.substring(1, apellido.length());
		primeraletraA = primeraletraA.toUpperCase();
		apellido = primeraletraA + restoLetraA;*/
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: "));
		String lugarDeResidencia = JOptionPane.showInputDialog(null, "Ingrese su Lugar de residencia: ");

		JOptionPane.showMessageDialog(null, "Nombre: "+ nombre  + "."+ "\n" + "Apellido: " + apellido + "." +  "\n" + "Edad: " + edad + "." + "\n" + "Lugar de residencia: " + lugarDeResidencia);

	}
}
