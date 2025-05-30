package app;

import classes.Punto;
import classes.Segmento;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		Punto x = new Punto(0,0);
		Punto y = new Punto(1,1);
		
		Segmento a = new Segmento(x,y);
		System.out.println(a.distancia());
	}

}
