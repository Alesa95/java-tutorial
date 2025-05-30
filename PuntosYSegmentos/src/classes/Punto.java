package classes;

/**
 * @author Alesa95
 */
public class Punto {

	private int x, y;
	
	/**
	 * Constructor por defecto. Crea un punto en las coordenadas (0,0)
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor que crea un punto en las coordenadas (x,y) indicadas
	 * @param x		la coordenada en el eje x
	 * @param y		la coordenada en el eje y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
