package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Declarativas4 {

	public static void main(String[] args) {
		String path = "/home/matinal/codigo/out.txt";
		File inFile = new File(path);
		File outFile = new File("2"+path);
		//jdk 7 o superior
		try(Scanner in = new Scanner(inFile);
				BufferedWriter out = new BufferedWriter(new FileWriter(outFile))){
			String palabra;
			while (in.hasNext()){
				palabra = in.next();
				System.out.println(palabra.toUpperCase());
				out.write(palabra.toUpperCase());
			}
		} catch (IOException e){
			
		}

	}

}
