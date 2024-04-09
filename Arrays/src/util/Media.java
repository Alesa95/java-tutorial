package util;

public abstract class Media {

	/**
	 * Devuelve la media de un array de numeros enteros
	 * 
	 * @param array		un array de numeros enteros
	 * @return			la media del array
	 */
	public static int mediaEnteros (int [] array) {
		int suma = 0;
		
		for(int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		
		int media = suma / array.length;
		
		return media;
	}
	
	/**
	 * Devuelve la media de un array de numeros decimales
	 * 
	 * @param array
	 * @return
	 */
	public static float mediaDecimales (float [] array) {
		
		return 0;
	}
}
