package clases;

public class Empleado extends Persona{
	
	private double remuneracion;
	private int empleadoId;
	public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion,
			int empleadoId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.remuneracion = remuneracion;
		this.empleadoId = empleadoId;
	}
	
	public double getRemuneracion() {
		return remuneracion;
	}
	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}
	public int getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public double aumentarRemuneracion (double porcentaje) {
		this.setRemuneracion((this.remuneracion * porcentaje / 100) + this.remuneracion);
		return this.remuneracion;
	}
	
	@Override
	public String toString() {
		return "Empleado [remuneracion=" + remuneracion + ", empleadoId=" + empleadoId + ", nombre=" + getNombre()
				+ ", apellido=" + getApellido() + ", numeroFiscal=" + getNumeroFiscal() + ", direccion=" + getDireccion() + "]";
	}
	
	
	
}
