package gestion;

import java.util.List;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas;
	
	public Zoologico() {}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	public List<Zona> getZona() {
		return zonas;
	}



	public void setZona(List<Zona> zonas) {
		this.zonas = zonas;
	}



	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public void agregarZonas(Zona nuevaZona) {
		zonas.add(nuevaZona);
	}
	
	public int cantidadTotalAnimales() {
		var sum = 0;
		for (Zona zona : zonas) {
			sum += zona.cantidadAnimales();
		}
		return sum; 
	}

}
