package tarea10;

import java.util.Scanner;

public class Tarea10 {

	public static void main(String[] args) {

		System.out.println("Escribe un número de ventas: ");	//pedimos numero de ventas
		Scanner s = new Scanner(System.in);
		int valor = s.nextInt();
		int acumulado = 0;
		
		for(int i=1; i<=valor; i++) {							//bucle que itera tantas veces como ventas se han indicado
			System.out.println("Indica el valor de la venta " +i+ " es: ");
			int venta = s.nextInt();							//lectura de cada valor de venta
			acumulado = acumulado + venta;						//suma acumulativa de los valores de venta
		}
		System.out.println("El valor acumulado de las ventas es de " +acumulado);
		s.close();
	}

}
