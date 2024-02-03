package net.austrycastillo.practica.funciones.procedimientos;

public class AppProcedimientos {
	public static void cantar() {
		System.out.println("lararala");
	}

	public static void cantar(String cancion) {
		System.out.println("lararala " + cancion);
	}
	public static void main(String[] args) {
		// procedimientos: no retornar
		cantar();
		cantar("macarena");
	}

}
