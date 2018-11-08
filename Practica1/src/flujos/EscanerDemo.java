package flujos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscanerDemo {
	
	

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca su nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.print("Introduzca su edad: ");
		
		int edad = scanner.nextInt();
		
		System.out.print("Introduzca su saldo disponible: ");
		double disponible = scanner.nextDouble();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Disponible: " + disponible);

	}
	
}
