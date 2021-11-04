package Recursividat;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int[][] mtxTablero= {
				{1,0,0,0,0,0,0,0},
				{0,1,0,0,0,0,0,0},
				{0,0,1,0,0,0,0,0},
				{0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0},
				{0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,1,0},
				{0,0,0,0,0,0,0,1},
				};
		//System.out.println(recursividad.sumarEnteros(arr, arr.length));
		System.out.println(recursividad.sumarRec1(arr, 0));
		System.out.println(recursividad.nTorres(mtxTablero));
	}

}
