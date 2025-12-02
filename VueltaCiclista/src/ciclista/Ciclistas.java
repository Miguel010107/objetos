package ciclista;

public class Ciclistas {

private String Peso; //declarar una variable / propiedad 
private String Altura;


// una clase tiene por defecto un constructor vacio 
public String getPeso() {
	return Peso;
}
public void setPeso(String peso) {
	this.Peso = peso; 
}
public String getAltura() {
	return Altura;
}
public void setAltura(String altura) {
	this.Altura = altura;
}
public Ciclistas(String peso, String altura) {
	super();
	Peso = peso;
	Altura = altura;
}

}
