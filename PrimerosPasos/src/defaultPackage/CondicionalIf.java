package defaultPackage;
import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad = scanner.nextInt();
		
		if(edad>=18 && edad<60) {
			System.out.println("Eres mayor de edad");
		}
		else if(edad>=60) {
			System.out.println("Eres de la tercera edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
		
		scanner.close();
		
	}

}
