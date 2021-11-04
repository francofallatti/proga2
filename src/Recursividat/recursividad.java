package Recursividat;

public class recursividad {

	static int fibonacciRecur(int n ) {
		if (n<=1) {
			return n;
		}else {
			return fibonacciRecur(n-1)+ fibonacciRecur(n-2);
		}
	}
	
	
	//Ejercicio1) Sumar los elementos de un array de enteros. Recordar que la suma es asociativa!
	static int sumarRec(int arr[]) {
		if(arr.length == 1) {
			return arr[0];
		}
		if (arr.length>1) {
			return arr[0] + sumarRec(borrarPrimero(arr));			
		}
		return 0; // En caso de que nos pasen un arreglo vacío.
	}
	
	static int sumarRec1(int arr[], int pos) {
	    // Caso base: pos es el último índice del arreglo.
	    if (pos == arr.length - 1) {
	        return arr[pos];
	    }
	    // Caso recursivo: incrementar índice en 1.
	    return arr[pos] + sumarRec1(arr, pos + 1);
	}
	
	static int[] borrarPrimero(int arr[]) {
		return arr;
	}
	
	
	
	// Ejercicio2)
	// Buscar el mínimo elemento en un arreglo de enteros.
	// Calcular la complejidad de buscar un elemento en un vector ordenado
	// Calcular la complejidad de buscar un elemento en un vector desordenado
	static int minimoRec(int arr[]) {
		if(arr.length==0) {
			return -1;
		}
		return minimoRecAux(arr, 0);
	}


	private static int minimoRecAux(int[] arr, int pos) {
		if(pos == arr.length-1) {
			return arr[pos];
		}
		
		return Math.min(arr[pos], minimoRecAux(arr, pos+1));
	}


	
	public static int[] nTorres(int[][] mtxTablero) {
		if(mtxTablero.length ==1) {
		return null;
		}
		return null;
	}
}
