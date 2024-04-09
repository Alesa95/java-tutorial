package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.Media;

class TestMedia {
	
	static int[] arrayEnteros;
	static float[] arrayDecimales;
	
	@BeforeAll
	static void setup() {
		arrayEnteros = new int[] {1,2,3,4,5};
	}

	@Test
	void mediaEnteros() {
		int mediaEsperada = 3;
		int mediaReal = Media.mediaEnteros(arrayEnteros);
		assertEquals(mediaEsperada, mediaReal);
	}

}
