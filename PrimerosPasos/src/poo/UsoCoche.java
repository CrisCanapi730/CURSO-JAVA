package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Coche c1 = new Coche();
		System.out.println("El auto tiene: " + c1.getRuedas() + " ruedas");
		
		// cambiamos de marca
		c1.setMarca("Suzuki");
		System.out.println("El auto es de marca: " + c1.getMarca());
		
		Coche c2 = new Coche(4, 150, "Nissan", true);
		System.out.println("Quieres arreglar tu auto");
		c2.arreglar(scanner.nextLine());
		
		c2.arreglar(JOptionPane.showInputDialog("Quieres arreglar el coche"));
		
		scanner.close();
	}
}
