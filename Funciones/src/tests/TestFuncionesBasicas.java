package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.FuncionesBasicas;

/**
 * @author Alesa
 */
class TestFuncionesBasicas {

	/**
	 * Comprueba que el sumatorio de un valor de entrada valido es correcto.
	 */
	@Test
	void testSumatorio1() {
		int esperado = 6;
		int obtenido = FuncionesBasicas.sumatorio(3);
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que el sumatorio de un valor de entrada no válido provoca la
	 * excepcion esperada.
	 */
	@Test
	void testSumatorioParamIncorrecto() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> {
	        FuncionesBasicas.sumatorio(-1);
	    });

	    String esperado = "El número debe ser igual o superior a 0";
	    String obtenido = excepcion.getMessage();

	    assertEquals(esperado, obtenido);
	}

}
