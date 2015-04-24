package diapositivas;

import java.util.Scanner;

public class NoDeclarativas1 {

	public static void main(String[] args) {
		//definimos array de tamaño fijo
		//usamos scanner para solicitar una posicion
		int [] numeros = {0,1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int posicion = in.nextInt();		
		System.out.println("Valor de la posicion : "+numeros[posicion]);
		//lo que no se debe hacer
		//tratar excepciones no declarativas como declarativas
		
		try{
			posicion=in.nextInt();
			System.out.println("Valor de la posicion : "+numeros[posicion]);
		} catch (ArrayIndexOutOfBoundsException e){
	
			System.out.println("Esa posición no existe");
			
		}
		
	}

}
