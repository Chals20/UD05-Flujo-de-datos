package tarea12;

import java.util.Scanner;

public class Tarea12 {
	public static void main(String[] args) {
		
		String contrase�a = "abcd";
		Scanner s = new Scanner(System.in);
		
		int intentos = 3;
		
		for(int i=1; i <= 3; i++) {
			System.out.println("Introduce la contrase�a. Tienes " +intentos+ " intentos:");
			String contra = s.nextLine();
			if(contra.equals(contrase�a)) {
				System.out.println("Enhorabuena");
				break;
			}else {
				System.out.println("Contrase�a incorrecta.");
				intentos--;
			}
		}
		s.close();
		
	}

}
