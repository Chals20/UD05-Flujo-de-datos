package tarea11;

import java.util.Scanner;

public class Tarea11 {

	public static void main(String[] args) {

		System.out.println("Introduce un dia de la semana: ");	//pedimos dia semana
		Scanner s = new Scanner(System.in);
		String dia = s.nextLine();
		
		switch(dia) {				//switch, cada caso es un dia de la semana (se tiene que escribir tal y como esta indicado, con la primera letra en mayuscula
		case "Lunes":
			System.out.println("Laborable");
			break;
		case "Martes":
			System.out.println("Laborable");
			break;
		case "Miercoles":
			System.out.println("Laborable");
			break;
		case "Jueves":
			System.out.println("Laborable");
			break;
		case "Viernes":
			System.out.println("Laborable");
			break;
		case "Sabado":
			System.out.println("Festivo");
			break;
		case "Domigo":
			System.out.println("Festivo");
			break;
		}
		
		s.close();

	}

}
