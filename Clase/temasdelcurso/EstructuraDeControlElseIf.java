package temasdelcurso;

public class EstructuraDeControlElseIf {

	public static void main(String[] args) {
		
		float promedio = 6.5f;
		if (promedio > 5) { //><
			System.out.println("Excelente promedio");
		}else if (promedio > 5.5) {
			System.out.println("promedio bueno");
		}else if (promedio> 5.0 ) {
			System.out.println("Promedio regular");
		}else {
			System.out.println("Promedio malo");
		}
	}
}
