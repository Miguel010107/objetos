package entrenador;

public class Entrenador {
	
		//POO
		
		private String nombre; //declarar una variable / propiedad 
		private int edad;
		
		
		// una clase tiene por defecto un constructor vacio 
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre; 
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public Entrenador(String nombre, int edad) {
			super();
			this.nombre = nombre;
			this.edad = edad;
		}
		
		public Entrenador() {
			// TODO Auto-generated constructor stub
		}
		
		
}
