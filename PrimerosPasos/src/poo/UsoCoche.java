package poo;

public class UsoCoche {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		System.out.println("El auto tiene: " + c1.getRuedas() + " ruedas");
		
		// cambiamos de marca
		c1.setMarca("Suzuki");
		System.out.println("El auto es de marca: " + c1.getMarca());
		
		
	}
}
