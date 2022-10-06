package tarea4;

import java.util.Scanner;

public class Tarea4 {

	public static void main(String[] args) {

		System.out.println("Introduce el radio:");
		Scanner s = new Scanner(System.in);
		String radio = s.nextLine();
		double r = Double.parseDouble(radio); //parseo del radio (en string) a double
		double area = Math.PI * Math.pow(r, 2); //aplicamos formula del area del circulo (pi*radio al cuadrado)
		System.out.println("El area del círlculo es de: " + area);
		s.close();
		
	}

}
