package net.austrycastillo.practica.funciones.procedimientos;

public class AppFunciones {
	// aquí mis funciones
	public static String saludar() {
		return "Hola función";
	}

	public static String saludar(String name, String x) {
		return "Hola función " + name + " " + x;
	}
	public static void main(String[] args) {
		// Funciones: tiene un retorno, son acciones, son operaciones
		System.out.println(saludar());
		System.out.println(saludar("Austry", "Castillo"));

	}
	// aquí mis funciones
}
