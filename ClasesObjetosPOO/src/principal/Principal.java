package principal;

import Entidades.Automovil;

public class Principal {

	public static void main(String[] args) {
		
		//Automovil subaru = new Automovil();
		
		
		//Automovil focus = new Automovil();
		
		Automovil gol = new Automovil("volswa", 2, "azul", 400);
		
		gol.velocidadFinal = 175;	
		
		System.out.println("tanke subaru " +gol.ObtenercapacidadTanque());
		System.out.println("marca subaru " +gol.getMarca());
		System.out.println("tanke focus "+ gol.velocidadFinal);
		
		//focus.setMarca("ford");
		//focus.AsignarCapacidadTanque(70);
		
		//subaru.setMarca("Subaru");
		//focus.color = "azul";
		//subaru.AsignarCapacidadTanque(300);
		
		//System.out.println("tanke subaru " +subaru.ObtenercapacidadTanque());
		//System.out.println("marca subaru " +subaru.getMarca());
		//System.out.println("tanke focus "+ focus.ObtenercapacidadTanque());
		//System.out.println("marca focus "+focus.getMarca());
		//String detallesDelauto= subaru.detalle();
		//System.out.println(subaru.acelerarYFrenar());
		//System.out.println(subaru.detalle());
		//System.out.println(focus.detalle());
		
		//System.out.println("Kilometros recorridos por litro de combustible "+subaru.calcularConsumo(500, 0.75f));
		//System.out.println("Kilometros recorridos por litro de combustible "+subaru.calcularConsumo(500, 75));
		//System.out.println("Kilometros recorridos por litro de combustible "+focus.calcularConsumo(750, 0.5f));
		
	}

}
