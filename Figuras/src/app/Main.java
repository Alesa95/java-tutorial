package app;

import models.Rectangulo;

/**
 * Programa principal de la aplicacion.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r = new Rectangulo(4,3);
		double area = r.area();
		System.out.println(area);
	}

}
