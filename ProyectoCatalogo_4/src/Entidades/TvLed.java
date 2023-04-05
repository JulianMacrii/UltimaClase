package Entidades;

public class TvLed extends Electronico{

	private int pulgada;

	

	public TvLed(int precio, String fabricante, int pulgada) {
		super(precio, fabricante);
		this.pulgada = pulgada;
	}

	public int getPulgada() {
		return pulgada;
	}

	public void setPulgada(int pulgada) {
		this.pulgada = pulgada;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public String toString() {
		return "TvLed [pulgada=" + pulgada + ", fabricante=" + fabricante + ", precio=" + precio + "]";
	}
	
	
}
