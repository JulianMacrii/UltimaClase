package temasDelCurso;

import javax.swing.JOptionPane;

public class OperadoresRelacionales {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("A es mayor que b? = " + (a > b));
		
		if((a > b) && (5>4) && (b>5)) {
			//Codigo a ejecutar si se cumple la condicion del IF a <b
			System.out.println("A es menor que b");
		}else {
			System.out.println("A es mayor que b");

		}
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
	}
}
