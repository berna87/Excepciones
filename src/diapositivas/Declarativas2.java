package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Declarativas2 {

	public static void main(String[] args) {
		try {
			manejarFicheros();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	//throws relanza la excepcion, lo manda hacia el metodo que hace la llamada
	public static void manejarFicheros() throws IOException{
		//vamos a leer un fichero y mostramos el texto por pantalla
		//la clase Scanner es la mas adecuada
		String path = "/home/matinal/codigo/out.txt";
		File inFile = new File(path);
		Scanner in = new Scanner(inFile);
		//vamos a escribirlo en un fichero de salida
		BufferedWriter out = new BufferedWriter(
				new PrintWriter(
						new File("/home/matinal/codigo/out2.txt")));
		String palabra="";
		while(in.hasNext()){
			palabra = in.next();
			System.out.println(palabra.toUpperCase());
			out.write(palabra.toUpperCase()+" ");
		}
		if (in!=null)in.close();
		if (out!=null)out.close();

	}

}