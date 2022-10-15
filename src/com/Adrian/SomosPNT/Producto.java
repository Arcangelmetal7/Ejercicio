package com.Adrian.SomosPNT;

public abstract class Producto implements Comparable<Producto> {
	private String nombre;
	private int precio;

	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Producto otro) {

		return precio - otro.getPrecio();
	}

}
