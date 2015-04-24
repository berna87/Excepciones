package diapositivas;

import java.util.Scanner;

public class NoDeclarativas3 {

	public static void main(String[] args) {
		//queremos volver a dar la oportunidad de volver a introducir la oportunidad
		int [] numeros = {0,1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int posicion = in.nextInt();
		if (posicion >= numeros.length || posicion < 0) {
			System.out.println("Vuelve a introducir un numero");
			posicion = in.nextInt();
			if (posicion >= numeros.length || posicion < 0){
				System.out.println("Posicion inexistente");
				System.exit(1);
			} else {
				System.out.println("Valor del array :"+numeros[posicion]);
				in.close();
			}
		} else {
			System.out.println("Valor del array :"+numeros[posicion]);
			in.close();
		}
	}
}
