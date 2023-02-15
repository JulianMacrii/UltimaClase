package holamundo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HolaMundo {
	
	public static void main(String[] args) {
	

		String apellido = "Jacquet";
		String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
		
		//int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
		
		String binario = Integer.toBinaryString(150);
		Double d = Double.valueOf("150.75");
		
		
		
		JOptionPane.showMessageDialog(null, nombre + " " + apellido);
		
		System.out.println(binario);
		
		//System.out.println(nombre);
	}
}
