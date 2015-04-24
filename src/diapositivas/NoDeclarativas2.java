package diapositivas;

import java.util.Scanner;

public class NoDeclarativas2 {

	public static void main(String[] args) {
		//hacemos programacion segura para evitar lo anterior
		
		int [] numeros = {0,1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int posicion = in.nextInt();		
		//si intentamos acceder a una posicion que no existe finalizamos el programa
		//deberiamos hacer una expresion regular para controlar que es un digito
		if (posicion >= numeros.length || posicion < 0) {
			System.out.println("Se ha intentado a una posicion inexistente");
			in.close();
			//salimos con codigo de error
			System.exit(1);
		}
		//desarrollo normal del programa
		System.out.println("Valor del array :"+numeros[posicion]);
		in.close();
	}

}
