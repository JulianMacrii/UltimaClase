package numeroPar;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: "));
		
		if (numero%2 == 0) {
			JOptionPane.showMessageDialog(null, numero + " es par");

		}else {
			JOptionPane.showMessageDialog(null, numero + " es inpar");
		}

	}

}
