package main;

import entrenador.Entrenador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrenador  a= new Entrenador();
		
		a.setNombre("Miguel");
		a.setEdad(40);
		
		System.out.println("El nombre es : "+ a.getNombre());
		System.out.println("");
		
		Entrenador a1 = new Entrenador("Miguelon", 20);
		System.out.println("El nombre es : "+ a1.getNombre());
	}

}
