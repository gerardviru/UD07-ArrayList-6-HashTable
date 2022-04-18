package UD07;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Hashtable <String, Double> Alumnos= new Hashtable<String, Double>();
		
		Alumnos.put("Martin", Media());
		Alumnos.put("Pedro", Media());
		Alumnos.put("Maria", Media());
		Alumnos.put("Sofia", Media());
		
		JOptionPane.showConfirmDialog(null,Alumnos.toString());
		
	}
	
	public static double Media() {
		
		int suma=0; 
		int media;
		
		final int CantNotas=4;
		
		String Nota1=JOptionPane.showInputDialog("Primera nota del alumno");
		int valor1 = Integer.parseInt(Nota1);
		
		String Nota2=JOptionPane.showInputDialog("Segunda nota del alumno");
		int valor2 = Integer.parseInt(Nota2);
		
		String Nota3=JOptionPane.showInputDialog("Tercera nota del alumno");
		int valor3 = Integer.parseInt(Nota3);
		
		String Nota4=JOptionPane.showInputDialog("Última nota del alumno");
		int valor4 = Integer.parseInt(Nota4);
			
		
		ArrayList<Integer> Notas= new ArrayList<>();
		Notas.add(valor1);
		Notas.add(valor2);
		Notas.add(valor3);
		Notas.add(valor4);
		
		for (int a = 0; a < Notas.size(); a++) {
				suma=valor1+valor2+valor3+valor4;
		}
		media=suma/CantNotas;
		return media;
	}
		
}

