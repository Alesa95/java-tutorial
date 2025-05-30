package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import classes.Punto;

class TestPunto {
	
	@BeforeAll
	void init() {
		Punto a = new Punto();
		Punto b = new Punto(1,1);
		Punto c = new Punto(-1,-1);
		Punto d = new Punto(101,1);
		Punto e = new Punto(1,101);
		Punto f = new Punto(-101,-1);
		Punto g = new Punto(-1,-101);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
