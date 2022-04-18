package UD07;

import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Carrito();	
	}
	
	public static void Carrito() {
		
		JOptionPane.showConfirmDialog(null, "Bienvenido a nuestro supermercado, procederemos a cobrarle su compra");
		
	
		ArrayList<String> Articulos = new ArrayList<>();
		
		String articulo1=JOptionPane.showInputDialog("Introduce el primer articulo");
		String articulo2=JOptionPane.showInputDialog("Introduce el segundo articulo");
		String articulo3=JOptionPane.showInputDialog("Introduce el tercer articulo");
		String articulo4=JOptionPane.showInputDialog("Introduce el cuarto articulo");
		
		Articulos.add(articulo1);
		Articulos.add(articulo2);
		Articulos.add(articulo3);
		Articulos.add(articulo4);
		
		JOptionPane.showConfirmDialog(null,"Número de articulos en el carrito " + Articulos.size());
		
		ArrayList<Integer> Cantidad = new ArrayList<>();
		
		String cantidad1=JOptionPane.showInputDialog("Cantidad del primer articulo");
		Integer cant1 = Integer.parseInt(cantidad1);
		
		String cantidad2=JOptionPane.showInputDialog("Cantidad del segundo articulo");
		Integer cant2 = Integer.parseInt(cantidad2);
		
		String cantidad3=JOptionPane.showInputDialog("Cantidad del tercero articulo");
		Integer cant3 = Integer.parseInt(cantidad3);
		
		String cantidad4=JOptionPane.showInputDialog("Cantidad del cuarto articulo");
		Integer cant4 = Integer.parseInt(cantidad4);
		
		Cantidad.add(cant1);
		Cantidad.add(cant2);
		Cantidad.add(cant3);
		Cantidad.add(cant4);
		
		
		ArrayList<Float> Precio = new ArrayList<>();
		
		String precio1=JOptionPane.showInputDialog("Introduce el precio del primer articulo");
		Float valor1 = Float.parseFloat(precio1)*cant1;
		
		String precio2=JOptionPane.showInputDialog("Introduce el precio del segundo articulo");
		Float valor2 = Float.parseFloat(precio2)*cant2;
		
		String precio3=JOptionPane.showInputDialog("Introduce el precio del tercer articulo");
		Float valor3 = Float.parseFloat(precio3)*cant3;
		
		String precio4=JOptionPane.showInputDialog("Introduce el precio del cuarto articulo");
		Float valor4 = Float.parseFloat(precio4)*cant4;
		
		Precio.add(valor1);
		Precio.add(valor2);
		Precio.add(valor3);
		Precio.add(valor4);
		
		
		Hashtable<String,Float> ArticuloPrecio = new Hashtable<String,Float>();
		
		ArticuloPrecio.put(articulo1, valor1);
		ArticuloPrecio.put(articulo2, valor2);
		ArticuloPrecio.put(articulo3, valor3);
		ArticuloPrecio.put(articulo4, valor4);
		
		
		for (String i : ArticuloPrecio.keySet()) {
			JOptionPane.showConfirmDialog(null, i + " tiene un precio de bruto de " + ArticuloPrecio.get(i)+"€");
		    }
		
		double total;
		total=valor1+valor2+valor3+valor4;
		JOptionPane.showConfirmDialog(null,"El precio total sin IVA "+total+"€");	
		
		final double IVA1=0.21;
		final double IVA2=0.04;
		
		double PrecioConIva;
		
		JOptionPane.showConfirmDialog(null,"Seleccione que Iva desea aplicar: ");
		String IVA = JOptionPane.showInputDialog(" 21% o 4% ");
		Integer iva = Integer.parseInt(IVA);
        if(iva == 21) {
        	PrecioConIva = total+(total*IVA1);
        	JOptionPane.showConfirmDialog(null, "Precio con el 21% Iva = "+ PrecioConIva+"€");
        }else if(iva == 4) {
        	PrecioConIva = total+(total*IVA2);
        	JOptionPane.showConfirmDialog(null, "Precio con el 4% Iva = "+ PrecioConIva+"€");
        }else {
        	JOptionPane.showConfirmDialog(null, "El iva introducido no es correcto");
        }
	}
}

