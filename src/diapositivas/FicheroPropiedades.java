package diapositivas;

import java.util.ResourceBundle;

public class FicheroPropiedades {
	public static void main(String[] args) {
		ResourceBundle in = ResourceBundle.getBundle("configuracion");
		String usuario = in.getString("login");
		String password = in.getString("clave");
		System.out.println("Valores obtenidos: "+usuario+"\t"+password);
	}
}
