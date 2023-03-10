package conexion;

import ejercicios.*;

public class Main {

	public static void main(String[] args) {
		puntoUno();
		puntoDos();
		puntoTres();
	}
	
	public static void puntoUno() {
		ejercicioUno ejer1 = new ejercicioUno();
		ejer1.tresFormas();
	}
	
	public static void puntoDos() {
		ejercicioDos ejer2 = new ejercicioDos();
		ejer2.objetos();
	}
	
	public static void puntoTres() {
		ejercicioTres ejer3 = new ejercicioTres();
		ejer3.instancia();
	}
}
