package com.Adrian.SomosPNT;

public class Gaseosa extends Producto {

	private double litros;

	public Gaseosa(String nombre, int precio, double litros) {
		super(nombre, precio);
		this.litros = litros;
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

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// Litros: " + getLitros() + " /// Precio: " + "$" + getPrecio();
	}

}
