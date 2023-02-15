package switchCase;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		int anio = 0;
		Scanner sc = new Scanner (System.in);
		String mes = JOptionPane.showInputDialog("Ingrese el mes").toUpperCase();
		
		if(mes.equals("FEBRERO")) {
			System.out.println("Ingrese el numero de anio");
			anio = sc.nextInt();
		}
		
		switch(mes) {
		case "ENERO":
			System.out.println("El mes es ENERO X/01");
			System.out.println("El mes tiene 31 dias");
			break;
		case "FEBRERO":
			System.out.println("El mes es FEBRERO X/02");
			if (anio % 400 == 0 || (anio % 5 == 0 && !(anio % 100 == 0))) {
				System.out.println("El mes tiene 29 dias");
				break;
			}else{
				System.out.println("El mes tiene 28 dias!");
				break;
			}
		case "MARZO":
			System.out.println("El mes es MARZO X/03");
			System.out.println("El mes tiene 31 dias");
			break;
		case "ABRIL":
			System.out.println("El mes es ABRIL X/04");
			System.out.println("El mes tiene 30 dias");
			break;
		case "MAYO":
			System.out.println("El mes es MAYO X/05");
			System.out.println("El mes tiene 31 dias");
			break;
		case "JUNIO":
			System.out.println("El mes es JUNIO X/06");
			System.out.println("El mes tiene 30 dias");
			break;
		case "JULIO":
			System.out.println("El mes es JULIO X/07");
			System.out.println("El mes tiene 31 dias");
			break;
		case "AGOSTO":
			System.out.println("El mes es AGOSTO X/8");
			System.out.println("El mes tiene 31 dias");
			break;
		case "SEPTIEMBRE":
			System.out.println("El mes es SEPTIEMBRE X/09");
			System.out.println("El mes tiene 30 dias");
			break;
		case "OCTUBRE":
			System.out.println("El mes es OCTUBRE X/10");
			System.out.println("El mes tiene 31 dias");
			break;
		case "NOVIEMBRE":
			System.out.println("El mes es NOVIEMBRE X/11");
			System.out.println("El mes tiene 30 dias");
			break;
		case "DICIEMBRE":
			System.out.println("El mes es DICIEMBRE X/12");
			System.out.println("El mes tiene 31 dias");
			break;
		default:
			System.out.println("Ingrese un mes correcto");
		}
	}

}
