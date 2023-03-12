package Entidades;

public class Automovil {
	
	
	//Modificador de acceso tipo de Datos
	private String marca;
	private double cilindrada;
	private String color;
	private int capacidadTanque;
	
	public static int velocidadFinal = 180;
	
	
	
	public Automovil(String marca, double cilindrada, String color, int capacidadTanque) {
		this.marca = marca;
		this.cilindrada = cilindrada;
		this.color = color;
		this.capacidadTanque = capacidadTanque;
	}
	public int ObtenercapacidadTanque() {
		return this.capacidadTanque;
	}
	public void AsignarCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String detalle() {
		String cadenaDetalle = ("Detalle de la inforamcion del auto: " + "marca" + this.marca + " color: " + this.color + " cilindrada" + this.cilindrada);
		return cadenaDetalle;
	}
	
	public String acelerar() {
		String detalle = "El auto " + this.marca + " esta acelerando";
		return detalle;
	}
	public String frenar() {
		return "el auto esta frenando!";
	}
	
	public String acelerarYFrenar() {
		return this.acelerar() + this.frenar();
	}
	//0.75
	public float calcularConsumo(int km, float porcentajeGasolina) {
		
		return km / (capacidadTanque * porcentajeGasolina);
	}
	//75
	public float calcularConsumo (int km, int porcentajeGasolina) {
		return km / (capacidadTanque * (porcentajeGasolina/100f));
	}
}


