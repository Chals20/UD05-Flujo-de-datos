package tarea6;

import java.util.Scanner;

public class Tarea6 {

	public static void main(String[] args) {

		System.out.println("Introduce un número:");
		Scanner s = new Scanner(System.in);
		double numero = s.nextDouble();
		final double iva = 0.21;
		double preu = numero * iva + numero;
		System.out.println("El preu amb IVA (21%) del producte és de "+preu);
		s.close();
	}

}
