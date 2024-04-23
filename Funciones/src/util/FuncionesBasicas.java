package util;

/**
 * @author Alesa
 */
public class FuncionesBasicas {

	/**
	 * Devuelve el sumatorio de un array de numeros enteros
	 * 
	 * @param numero	el numero del cual queremos hallar el sumatorio
	 * @return			el sumatorio del numero
	 */
	public static int sumatorio (int numero) {
		int sumatorio = 0;
		
		if(numero < 0) {
			throw new IllegalArgumentException("El número debe ser igual o superior a 0");
		}
		
		for(int i = 1; i <= numero; i++) {
			sumatorio += i;
		}
		
		return sumatorio;
	}
}
