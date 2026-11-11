package defaultPackage.ejercicios;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int factorial;
		System.out.println("Ingresa un numero para calcular su factorial");
		factorial = scanner.nextInt();
		int resultado = 1;
		
		for(int i = 1; i<=factorial; i++) {
			resultado*=i;
		}
		
		System.out.println("El factorial de: " + factorial + " es: " + resultado);
		
		scanner.close();
	}

}
