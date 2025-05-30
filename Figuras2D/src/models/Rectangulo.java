package models;

public class Rectangulo extends Figura {
	
	private int base;
	private int altura;
	
	/**
	 * Constructor por defecto. Crea un rectangulo con una altura y una base de 1, en metros
	 */
	public Rectangulo() {
		this.base = 1;
		this.altura = 1;
	}
	
	/**
	 * Constructor que recibe como parametros la base y la altura del rectangulo, en metros
	 * 
	 * @param base		la base del rectangulo
	 * @param altura	la altura del rectangulo
	 */
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @see models.Figura#area()
	 */
	@Override
	public double area() {
		return base * altura;
	}

	/**
	 * @see models.Figura#perimetro()
	 */
	@Override
	public double perimetro() {
		return 2*base + 2*altura;
	}
	
}
