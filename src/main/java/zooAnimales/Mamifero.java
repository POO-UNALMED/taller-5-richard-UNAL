package zooAnimales;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Mamifero extends Animal{
	
	private static List<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero() {
		super();
		listado.add(this);
	}
	
	
	
	/**
	 * @param nombre
	 * @param edad
	 * @param habitat
	 * @param genero
	 * @param pelaje
	 * @param patas
	 */
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	public static int cantidadMamifero() {
		return listado.size(); 
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}



	public boolean isPelaje() {
		return pelaje;
	}



	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}



	public int getPatas() {
		return patas;
	}



	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	

}
