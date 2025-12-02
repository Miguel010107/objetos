package bicicleta;

public class Bicicletas {

	private String Marca; //declarar una variable / propiedad 
	private String Modelo;
	
	
	// una clase tiene por defecto un constructor vacio 
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		this.Marca = marca; 
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}
	public Bicicletas(String marca, String modelo) {
		super();
		Marca = marca;
		Modelo = modelo;
	}
		
	
}
