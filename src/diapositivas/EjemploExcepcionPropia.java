package diapositivas;

public class EjemploExcepcionPropia {
	public static void main(String[] args) {
		try {
			EcuacionSegundoGrado e = new EcuacionSegundoGrado(2, 2, 1);
		} catch (NoEcuacionSegundoGradoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//vamos a crear nuestra propia excepcion

class NoEcuacionSegundoGradoExcepcion extends Exception{
	
}

//creamos la clase EcuacionSegundoGrado

class EcuacionSegundoGrado{
	//ax²+bx+c=0    no sera ecuacion de segundo grado si a=0
	private int valorA;
	private int valorB;
	private int valorC;
	
	/**
	 * 
	 * @param valorA
	 * @param valorB
	 * @param valorC
	 * @throws NoEcuacionSegundoGradoExcepcion Si a=0
	 */
	
	public EcuacionSegundoGrado(int valorA, int valorB, int valorC) throws NoEcuacionSegundoGradoExcepcion {
		if(valorA == 0) throw new NoEcuacionSegundoGradoExcepcion();
		this.valorA = valorA;
		this.valorB = valorB;
		this.valorC = valorC;
	}
	//resto de metodos...
	
	
}