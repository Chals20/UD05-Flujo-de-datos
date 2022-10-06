package tarea5;

import java.util.Scanner;

public class Tarea5 {

	public static void main(String[] args) {

		System.out.println("Introduce un número:");
		Scanner s = new Scanner(System.in);
		int numero = s.nextInt();
		if(numero % 2 == 0)
			System.out.println("El número " +numero+ " és divisible entre 2.");
		else 
			System.out.println("El número " +numero+ " NO és divisible entre 2.");
		s.close();

	}

}
