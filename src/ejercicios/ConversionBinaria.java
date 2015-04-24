package ejercicios;

public class ConversionBinaria {
	public static int convertir(String str) throws ImposibleConversionBinariaException{
		if(str.length()==0) throw new ImposibleConversionBinariaException();
		int valor = 0;
		int contador=0;
		for (int i = str.length()-1; i >= 0 ; i--) {
			//otra posibilidad str.matches("[01]+")
			if(str.charAt(i)== '0' || str.charAt(i)== '1' ){
				if(str.charAt(i)== '1')
				valor += 1*(Math.pow(2,contador));
			contador++;
			} else throw new ImposibleConversionBinariaException();
		}
		return valor;
	} 
}


class ImposibleConversionBinariaException extends Exception{
	
}

class TestConversionBinaria{
	public static void main(String[] args) {
		try {
			System.out.println(ConversionBinaria.convertir("01001100101"));
		} catch (ImposibleConversionBinariaException e) {
			// TODO Auto-generated catch block
			System.out.println("Imposible realizar la conversion");
		}
	}
}