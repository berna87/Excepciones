package ejercicios;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	/**
	 * 
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @throws IlegalTrianguloException
	 */
	public Triangulo(int lado1, int lado2, int lado3) throws IlegalTrianguloException {
		if(lado1>=(lado2+lado3)) throw new IlegalTrianguloException();
		if(lado2>=(lado1+lado3)) throw new IlegalTrianguloException();
		if(lado3>=(lado1+lado2)) throw new IlegalTrianguloException();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
}
class IlegalTrianguloException extends Exception{
	
}