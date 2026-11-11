package defaultPackage;

import java.util.Scanner;


public class randonConWhile {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int aleatorio = (int)(Math.random()*100);
		
		int numero = 0, veces = 0;
		
		while(numero != aleatorio) {
			System.out.println("Adivina el numero: ");
			numero = scanner.nextInt();
			veces++;
			if(aleatorio < numero) {
				System.out.println("Numero incorrecto, el numero es menor");
			}
			
			else if(aleatorio > numero) {
				System.out.println("Numero incorrecto, el numero es mayor");

			}
			
		}
		
		System.out.println("Felicidades, adivinaste el numero!!!");
		System.out.println("Lo lograste en: " + veces + " veces");
		
		scanner.close();
	}

}
