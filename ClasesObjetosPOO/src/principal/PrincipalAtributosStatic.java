package principal;

import Entidades.Automovil;

public class PrincipalAtributosStatic {

	public static void main(String[] args) {

		
		Automovil gol = new Automovil("volswa", 2, "azul", 400);
		
		gol.velocidadFinal = 175;	
		
		System.out.println("tanke subaru " +gol.ObtenercapacidadTanque());
		System.out.println("marca subaru " +gol.getMarca());
		System.out.println("tanke focus "+ gol.velocidadFinal);
		

	}

}
