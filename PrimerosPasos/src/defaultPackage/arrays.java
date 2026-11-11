package defaultPackage;

public class arrays {

	public static void main(String[] args) {
		System.out.println("Array 1");
		int[] numeros = new int[5];
		numeros[0] = 19;
		numeros[1] = 15;
		numeros[2] = 35;
		numeros[3] = -12;
		numeros[4] = 0;
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("Array 2");
		int[] numeros_2 = {34, 45, 43, 34};
		
		for(int i=0; i < numeros_2.length; i++) {
			System.out.println(numeros_2[i]);
		}
		
		// another way to do for -> for each
		String[] frutas = {"uva", "manzana", "pera"};
		for(String elemento:frutas) {
			System.out.println("fruta: " + elemento);
		}
		
		
	}

}
