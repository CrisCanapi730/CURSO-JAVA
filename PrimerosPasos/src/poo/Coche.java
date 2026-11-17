package poo;

public class Coche {
	
	private int ruedas;
	private int peso;
	private String marca;
	private boolean descompuesto;
	
	public Coche(int ruedas, int peso, String marca, boolean estado){
		this.ruedas = ruedas;
		this.peso = peso;
		this.marca = marca;
		descompuesto = estado;
	}
	
	public Coche(){
		ruedas = 4;
		peso = 100;
		marca = "Toyota";
		descompuesto = false;
	}
	
	// ruedas
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public int getRuedas() {
		return this.ruedas;
	}
	
	// peso
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPeso() {
		return this.peso;
	}
	
	// marca
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	
	// descompuesto
	public void setEstado(boolean estado) {
		this.descompuesto = estado;
	}
	public boolean getEstado() {
		return this.descompuesto;
	}
	
	public void arreglar(String peticion) {
		if(peticion.equalsIgnoreCase("si")) {
			descompuesto = false;
		}
		else {
			descompuesto = true;
		}
	}

}
