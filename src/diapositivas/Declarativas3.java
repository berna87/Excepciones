package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Declarativas3 {
	//pre jdk 7
	public static void main(String[] args) {
		String path = "/home/matinal/codigo/out.txt";
		File inFile = new File(path);
		File outFile = new File("2"+path);
		String palabra;
		BufferedWriter out = null;
		Scanner in = null;
		try {
			out = new BufferedWriter(
					new PrintWriter(outFile));
			in = new Scanner(inFile);
			while(in.hasNext()){
				palabra = in.next();
				System.out.println(palabra.toUpperCase());
				out.write(palabra.toUpperCase()+" ");
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in!=null)in.close();
			if (out!=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}	
}
