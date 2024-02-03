package net.austrycastillo.practica.funciones.procedimientos;

import java.util.Scanner;

public class AppsPractica {

	public static void main(String[] args) {
		/*
		 * Desarrollar un algoritmo que permita solicitar al usuario 2 números, e
		 * indicar cual es el mayor, el menor y si son iguales
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		int x = sc.nextInt();
		System.out.println("Escribe otro número");
		int y = sc.nextInt();
		System.out.println(consultar(x, y));

	}

	public static String consultar(int a, int b) {
		String msn = "";
		if (a > b) {
			msn = a + " es mayor, " + b + " es menor, son diferentes";
		} else if (b > a) {
			msn = b + " es mayor, " + a + " es menor, son diferentes";
		} else {
			msn = a + " y " + b + " son iguales";
		}
		return msn;
	}
}
