package tarea12;

import java.util.Scanner;

public class Tarea12 {
	public static void main(String[] args) {
		
		String contraseņa = "abcd";
		Scanner s = new Scanner(System.in);
		
		int intentos = 3;
		
		for(int i=1; i <= 3; i++) {
			System.out.println("Introduce la contraseņa. Tienes " +intentos+ " intentos:");
			String contra = s.nextLine();
			if(contra.equals(contraseņa)) {
				System.out.println("Enhorabuena");
				break;
			}else {
				System.out.println("Contraseņa incorrecta.");
				intentos--;
			}
		}
		s.close();
		
	}

}
