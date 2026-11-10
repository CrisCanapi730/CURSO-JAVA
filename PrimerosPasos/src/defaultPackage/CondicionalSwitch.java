package defaultPackage;
import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce una opcion:\n1.Real Madrid\n2.Atletico Madrid\n3.Barcelona");
		
		int opcion = scanner.nextInt();
		
		switch(opcion){
			case 1:
				System.out.println("Eres del madrid");
				break;
			case 2:
				System.out.println("Eres del Atleti");
				break;
			case 3:
				System.out.println("Eres del barcelona");
				break;
			default:
				System.out.println("No eres de ningun equipo");
				break;
				
		}
		
		scanner.close();

	}

}
