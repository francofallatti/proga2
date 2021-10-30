package Recursividat;

public class recursividad {

	static int fibonacciRecur(int n ) {
		if (n<=1) {
			return n;
		}else {
			return fibonacciRecur(n-1)+ fibonacciRecur(n-2);
		}
		
	}
}
