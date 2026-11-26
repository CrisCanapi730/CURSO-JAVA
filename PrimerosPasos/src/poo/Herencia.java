package poo;

public class Herencia {

	public static void main(String[] args) {
		Animal a1 = new Animal("Ruffus", 5);
		a1.mostrarInfo();
		
		Perro p1 = new Perro("Tom", 4,"Pastor aleman");
		p1.mostrarInfo();
		p1.mostrarInfo2();
	}

}

class Animal{
	private String nombre;
	private int edad;
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarInfo() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("Tiene una edad de : " + edad);
	}
}

class Perro extends Animal{
	
	private String raza;
	
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}
	
	public void mostrarInfo() {
		System.out.println("La raza es: " + raza);
	}
	
	public void mostrarInfo2() {
		System.out.println("============================");
		super.mostrarInfo(); // llamamos para que identifique solo al metodo de la clase padre
	}
	
}
