package com.Adrian.SomosPNT;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Adrian Calderon
 *
 */
public class MainUsoProductos {

	public static void main(String[] args) {

		ArrayList<Producto> miLista = new ArrayList<Producto>();
		miLista.add(new Gaseosa("Coca-Cola Zero", 20, 1.5));
		miLista.add(new Gaseosa("Coca-Cola", 18, 1.5));
		miLista.add(new Shampoo("Shampoo Sedal", 19, 500));
		miLista.add(new Fruta("Frutillas", 64, "kilo"));

		listarProductos(miLista);

	}
	/*
	 * This method does all the job.
	 */

	public static void listarProductos(ArrayList<Producto> lista) {

		String respuesta = "";

		for (int i = 0; i < lista.size(); i++) {
			if (respuesta.isEmpty()) {
				respuesta = lista.get(i).toString();
			} else {
				respuesta = respuesta + "\n" + lista.get(i).toString();
			}
		}

		System.out.println(respuesta);
		System.out.println("=============================");

		Collections.sort(lista);

		System.out.println("Producto más caro: " + lista.get(lista.size() - 1).getNombre());

		System.out.println("Producto más barato: " + lista.get(0).getNombre());
	}

}
