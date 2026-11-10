package defaultPackage;

public class Variables {

	public static void main(String[] args) {

		byte edad;
		edad = 35;
		
		System.out.println(edad);
		
		int a = 10;
		int b = 1;
		int c = a+b;
		c++;
		
		final char letra = 'a'; // we define a constant in this way
		
		int n1, n2, n3; // we can define many variables in one line
		
		n1 = n2 = n3 = 9;
		
		System.out.println(n1 + n2 + n3);
		
		System.out.println(c);
		System.out.println("Primera letra: " + letra);
	}

}
