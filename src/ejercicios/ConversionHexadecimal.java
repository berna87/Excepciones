package ejercicios;

public class ConversionHexadecimal {
	public static int convertir(String str) throws ImposibleConversionHexadecimalException{
		if(str.length()==0) throw new ImposibleConversionHexadecimalException();
		String s = str.toLowerCase();
		int valor = 0;
		int contador=0;
		for (int i = s.length()-1; i >= 0 ; i--) {
			if(Character.isDigit(s.charAt(i))|| s.charAt(i)=='a' || s.charAt(i)=='b'  || s.charAt(i)=='c' 
					|| s.charAt(i)=='d' || s.charAt(i)=='e' || s.charAt(i)=='f') {
			if (Character.isDigit(s.charAt(i)))valor += (Integer.parseInt(s.substring(i, i+1)))*(Math.pow(16,contador));
			if (s.charAt(i)=='a') valor += 10*(Math.pow(16,contador));
			if (s.charAt(i)=='b') valor += 11*(Math.pow(16,contador));
			if (s.charAt(i)=='c') valor += 12*(Math.pow(16,contador));
			if (s.charAt(i)=='d') valor += 13*(Math.pow(16,contador));
			if (s.charAt(i)=='e') valor += 14*(Math.pow(16,contador));
			if (s.charAt(i)=='f') valor += 15*(Math.pow(16,contador));			
			contador++;
			} else throw new ImposibleConversionHexadecimalException();
		}
		return valor;
	} 
}



class ImposibleConversionHexadecimalException extends Exception{
	
}

class TestConversionHexadecimal{
	public static void main(String[] args) {
		try {
			System.out.println(ConversionHexadecimal.convertir("422aa0"));
		} catch (ImposibleConversionHexadecimalException e) {
			// TODO Auto-generated catch block
			System.out.println("Imposible realizar la conversion");
		}
	}
}