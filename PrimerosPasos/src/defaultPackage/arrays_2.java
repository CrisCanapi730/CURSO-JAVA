package defaultPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class arrays_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for(int i = 0; i<3; i++) {
			System.out.println("Ingresa un numero: ");
			int numero = scanner.nextInt();
			numeros.add(numero);
		}
		
		for(int elemento:numeros) {
			System.out.println(elemento);
		}
		
		int tamaño = numeros.size();
		System.out.println("El array es de tamaño: " + tamaño);
		scanner.close();
	}

}
