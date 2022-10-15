package com.Adrian.SomosPNT;

public class Shampoo extends Producto {
	private int contenido;

	public Shampoo(String nombre, int precio, int contenido) {
		super(nombre, precio);
		this.contenido = contenido;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return super.getPrecio();
	}

	@Override
	public void setPrecio(int precio) {
		// TODO Auto-generated method stub
		super.setPrecio(precio);
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + "ml" + " /// Precio: " + getPrecio()
				+ "$";
	}

}
