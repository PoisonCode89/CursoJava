package es.indra.aerolineas.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirPasajeros {
	
	  public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
	        String cadena;
	        FileReader f = new FileReader("C:/Users/P.era-1/repositorios/CursoJava/Practica-curso-JAVA/pasajeros.txt");
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	        }
	        b.close();
	    }
	  

	   public static void main(String[] args) throws IOException {
	        String ruta = "C:/Users/P.era-1/repositorios/CursoJava/Practica-curso-JAVA/pasajeros.txt";
	        File archivo = new File(ruta);
	        BufferedWriter bw;
	        if(archivo.exists()) {
	            bw = new BufferedWriter(new FileWriter(archivo));
	            System.out.println("El archivo ya estaba creado");
	        } else {
	            bw = new BufferedWriter(new FileWriter(archivo));
	            System.out.println("Se ha creado el archivo");
	        }
	        bw.close();
	        muestraContenido("C:/Users/P.era-1/repositorios/CursoJava/Practica-curso-JAVA/pasajeros.txt");
	        
	    }
	   
	 
	}

