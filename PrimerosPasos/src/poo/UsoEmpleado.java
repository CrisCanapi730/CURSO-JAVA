package poo;

import java.time.LocalDate;

public class UsoEmpleado {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Cristian", 24, LocalDate.of(2002, 3, 14));
		e1.mostrarInfo();
		
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
	
	public void mostrarInfo() {
		System.out.println("El empleado se llama: " + getNombre() + "\nTiene: " + getEdad()+ "\ny nacio en: " + getFecha());
	}
	
}
