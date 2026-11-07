package defaultPackage;

public class CalculosMath {

	public static void main(String[] args) {
		
		double raiz = Math.sqrt(9);
		
		System.out.println(raiz);
		
		double num = 5.56;
		
		int redondeado = (int)Math.round(num);// esto se llama refundicion
		
		System.out.println(redondeado);
		
		int base = 3;
		int exponente =2;
		
		int resultado = (int)Math.pow(base, exponente);
		
		System.out.println(resultado);

	}

}
