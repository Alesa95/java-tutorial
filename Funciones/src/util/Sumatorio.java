package util;

public class Sumatorio {

	/**
	 * Devuelve el sumatorio de un array de numeros enteros
	 * 
	 * @param array		un array de numeros enteros
	 * @return			el sumatorio del array
	 */
	public static int sumatorioEnteros (int [] array) {
		int sumatorio = 0;
		
		for(int i = 0; i < array.length; i++) {
			sumatorio += array[i];
		}
		
		return sumatorio;
	}
}
