package defaultPackage;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class bucleFor {

	public static void main(String[] args) {
		
		// Example 1
		System.out.print("Ingresa un limite: ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = 0; i<=num; i++) {
			System.out.println(i);
		}
		
		// Example 2
		
		String email = JOptionPane.showInputDialog("Ingresa un email valido");
		boolean arroba = false;
		int contador = 0;
		for(int i = 0; i < email.length(); i++) {
			if(contador>1) {
				System.out.println("email incorrecto");
				arroba = false;
				break;
			}
			if(email.charAt(i) == '@') {
				contador++;
				arroba = true;
			}
			
		}
		
		if(contador == 1 && arroba == true) {
			System.out.println("Email con formato correcto!");
		}
		
		
		scanner.close();

	}

}
