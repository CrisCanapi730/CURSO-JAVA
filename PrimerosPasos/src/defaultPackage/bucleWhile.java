package defaultPackage;

import java.util.Scanner;

public class bucleWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String clave = "Cristian";
		
		String password = "";
		
		while(clave.equals(password) == false) {
			
			System.out.println("Ingresa la clave");
			password = scanner.nextLine();
			
			if(clave.equals(password)) {
				System.out.println("Contraseña correcta!! puedes acceder");
			}
			else if(clave.equals(password) == false) {
				System.out.println("Contraseña incorrecta!");
			}
			
		}
		
		scanner.close();

	}

}
