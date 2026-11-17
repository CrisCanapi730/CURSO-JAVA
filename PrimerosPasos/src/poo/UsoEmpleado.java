package poo;

import java.time.LocalDate;
import java.util.Scanner;


public class UsoEmpleado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Empleado e1 = new Empleado("Cristian", 24, LocalDate.of(2002, 3, 14));
		e1.mostrarInfo();
		System.out.println("Ingresa tu fecha en formato (yyyy-mm-dd)");
		e1.setFecha(LocalDate.parse(scanner.nextLine()));
		
		e1.mostrarInfo();
		
		scanner.close();
		
	}

}
// Ejemplo de tratar clases diferentes en un solo archivo en vez de varios
class Empleado{
	private String nombre;
	private int edad;
	private LocalDate fecha;
	
	public Empleado(String nombre, int edad, LocalDate fecha) {
		this.nombre = nombre;
		this.edad = edad;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public void mostrarInfo() {
		System.out.println("El empleado se llama: " + getNombre() + "\nTiene: " + getEdad()+ "\ny nacio en: " + getFecha());
	}
	
}
