package defaultPackage;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// string
		System.out.println("Introduce tu nombre porfavor");
		String nombre = scanner.nextLine();
		System.out.println("Tu nombre es: " + nombre);
		
		// float
		System.out.println("Introduce un float");
		float pi = scanner.nextFloat();
		System.out.println("El numero ingresado es: " + pi);
		
		// double
		System.out.println("Introduce un double");
		double pi2 = scanner.nextDouble();
		System.out.println("El numero es: " + pi2);
		
		// boolean
		System.out.println("Introduce un booleano");
		boolean esMayor = scanner.nextBoolean(); // true or false
		System.out.println("Introduciste: " + esMayor);
		
		scanner.close();	}

}
