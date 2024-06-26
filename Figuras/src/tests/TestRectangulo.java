package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.Rectangulo;

class TestRectangulo {
	static Rectangulo r;

	@BeforeAll
	static void setup() {
		r = new Rectangulo(3,2);
	}
	
	@Test
	void area() {
		double areaEsperada = 6;
		double areaReal = r.area();
		assertEquals(areaEsperada, areaReal);
	}
	
	@Test
	void perimetro() {
		double perimetroEsperado = 10;
		double perimetroReal = r.perimetro();
		assertEquals(perimetroEsperado, perimetroReal);
	}
}
