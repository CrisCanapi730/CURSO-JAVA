package defaultPackage;
import javax.swing.JOptionPane;

public class bucleDoWhile {

	public static void main(String[] args) {
//		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
//
//        JOptionPane.showMessageDialog(null, "Hola " + nombre);
        
        String genero = "";
        
        do {
        	genero = JOptionPane.showInputDialog("Introduce el genero (H/M)");
        	if(genero.equalsIgnoreCase("H")) {
        		System.out.println("Eres un hombre");
        	}
        	else if(genero.equalsIgnoreCase("M")) {
        		System.out.println("Eres mujer");
        	}
        	
        }while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en cm"));
        
        System.out.println("Tu sexo es: " + genero + " y tu altura es: " + altura + " cm");
	}

}
