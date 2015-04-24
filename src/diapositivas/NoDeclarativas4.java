package diapositivas;

import java.util.Scanner;

public class NoDeclarativas4 {
	public static Scanner in = new Scanner(System.in);
	public static int [] numeros = {0,1,2,3,4,5,6,7,8,9};
	public static int posicion;
	public static boolean flag= false;
	public static void main(String[] args) {
		while(!flag) //se estara repitiendo hasta que flag sea true
			posicion = leer();
		System.out.println("Valor del array :"+numeros[posicion]);
		in.close();
	
	}
	private static int leer(){
		System.out.println("Introduce un numero");
		int posicion = in.nextInt();
		if(posicion < numeros.length && posicion>=0) flag = true; //cuando el rango de valores esta comprendido entre 0 y el tamaño del array el flag sera true
		return posicion;
	}

}
