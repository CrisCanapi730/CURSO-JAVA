package poo;

public class SobreCargaConstructor {

	public static void main(String[] args) {
		Persona p1 = new Persona("Cristian", 24, 1.80);
		p1.mostrarInfo();
		Persona p2 = new Persona("Carlos");
		p2.mostrarInfo();
		Persona p3 = new Persona(22);
		p3.mostrarInfo();

	}

}

class Persona{
	private String nombre;
	private int edad;
	private double altura;
	// primer constructor
	public Persona(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	// segundo constructor
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	// tercer constructor
	public Persona(int edad) {
		this("Mathi", edad, 1.70);
	}
	public void mostrarInfo(){
		System.out.println("El nombre es: " + nombre);
		System.out.println("Tiene una edad de: " + edad);
		System.out.println("Tiene una altura de: " + altura);
	}
	
	
	
	
	
}
