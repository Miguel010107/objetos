package main;

import ciclista.Ciclistas;

import bicicleta.Bicicletas;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciclistas  a= new Ciclistas("", "");
		
		a.setPeso("57kg");
		a.setAltura("1,67m");
		
		System.out.println("El peso es : "+ a.getPeso());
		System.out.println("");
		
		Ciclistas a1 = new Ciclistas("", "");
		System.out.println("La altura es : "+ a1.getAltura());

	Bicicletas  b= new Bicicletas(null, null);
		
		b.setMarca("covid");
		b.setModelo("virus");
		
		System.out.println("La marca es : "+ b.getMarca());
		System.out.println("");
		
		Bicicletas b1 = new Bicicletas("", "");
		System.out.println("El modelo es : "+ b1.getModelo());
	}
	
}



