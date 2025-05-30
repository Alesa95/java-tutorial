package classes;

/**
 * @author Alesa95
 */
public class Segmento {

	private Punto a, b;
	
	/**
	 * Constructor por defecto. Crea un segmento entre los puntos (0,0) y (1,1)
	 */
	public Segmento() {
		this.a = new Punto(0,0);
		this.b = new Punto(1,1);
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 */
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Calcula la distancia entre los dos puntos del segmento
	 * 
	 * @return		la distancia entre los dos puntos del segmento
	 */
	public double distancia() {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}
	
	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}
	
	public String toString() {
		return "[(" + a.getX() + "," + a.getY() + "),(" + b.getX() + "," + b.getY() + ")]";
	}
	
}
