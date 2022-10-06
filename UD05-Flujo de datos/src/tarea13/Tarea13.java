package tarea13;

import java.util.Scanner;

public class Tarea13 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el primer operador:");
		int op1 = s.nextInt();
		System.out.println("Introduce el segundo operador:");
		int op2 = s.nextInt();
		System.out.println("Introduce el signo aritmético (+-*/^%):");
		String signo = s.next();
		int resultado;
		
		switch (signo) {
		case "+":
			resultado = op1+op2;
			System.out.println("El resultado es: " +resultado);
			break;
		case "-":
			resultado = op1-op2;
			System.out.println("El resultado es: " +resultado);
			break;
		case "*":
			resultado = op1*op2;
			System.out.println("El resultado es: " +resultado);
			break;
		case "/":
			resultado = op1/op2;
			System.out.println("El resultado es: " +resultado);
			break;
		case "^":
			resultado = (int) Math.pow(op1, op2);
			System.out.println("El resultado es: " +resultado);
			break;
		case "%":
			resultado = op1%op2;
			System.out.println("El resultado es: " +resultado);
			break;
		}
		
		s.close();
	}

}
