package UD07;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bienvenido a nuestra tienda");

		Catalogo();

	}

	public static void Catalogo() {

		ArrayList<String> Catalogo = new ArrayList<>(10);

		Catalogo.add("Mahou");
		Catalogo.add("Estrella Dam");
		Catalogo.add("San Miguel");
		Catalogo.add("Xibeca");
		Catalogo.add("Estrella Galicia");
		Catalogo.add("Moritz");
		Catalogo.add("Aguila");
		Catalogo.add("Alhambra");
		Catalogo.add("Heineken");
		Catalogo.add("Amstel");

		ArrayList<Double> Precio = new ArrayList<>(10);

		Precio.add(1.20);
		Precio.add(1.50);
		Precio.add(1.15);
		Precio.add(1.00);
		Precio.add(1.80);
		Precio.add(1.10);
		Precio.add(1.75);
		Precio.add(1.70);
		Precio.add(1.20);
		Precio.add(1.18);

		Hashtable<String, Double> ArticuloPrecio = new Hashtable<String, Double>();

		ArticuloPrecio.put("Mahou", 1.20);
		ArticuloPrecio.put("Estrella Dam", 1.50);
		ArticuloPrecio.put("San Miguel", 1.15);
		ArticuloPrecio.put("Xibeca", 1.00);
		ArticuloPrecio.put("Estrella Galicia", 1.80);
		ArticuloPrecio.put("Moritz", 1.10);
		ArticuloPrecio.put("Aguila", 1.75);
		ArticuloPrecio.put("Alhambra", 1.70);
		ArticuloPrecio.put("Heineken", 1.20);
		ArticuloPrecio.put("Amstel", 1.18);

		String[] options = { " Consultar un precio de un articulo del catálogo ", " Listar el catálogo ",
				" Añadir un articulo al catálogo " };
		int i = JOptionPane.showOptionDialog(null, "¿Que desea realizar?", "Selecciona", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		if (i == 0) {
			String consultaArticulo = JOptionPane.showInputDialog(" Nombre del articulo que quiere consultar ");
			JOptionPane.showMessageDialog(null, ArticuloPrecio.get(consultaArticulo) + "€");
		}
		if (i == 1) {
			JOptionPane.showMessageDialog(null, "" + ArticuloPrecio.toString());
		} else if (i == 2) {
			String articuloNuevo = JOptionPane.showInputDialog(" Nombre del nuevo articulo ");
			ArticuloPrecio.put(articuloNuevo, 0.0);
			String precioNuevo = JOptionPane.showInputDialog(" Precio del nuevo articulo ");
			double precio = Double.parseDouble(precioNuevo);
			ArticuloPrecio.put(precioNuevo, precio);

			JOptionPane.showMessageDialog(null,
					"El nuevo articulo añadido es: " + articuloNuevo + " y su precio es " + precio + " €");
		}
	}
}
