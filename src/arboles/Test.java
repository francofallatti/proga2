package arboles;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ab ab1 = new Ab();
		//Ab ab2 = new Ab();
		//ab2.agregar(10);
		//ab2.agregar(7);
		//ab2.agregar(2);
		//ab2.agregar(87);
		//ab2.agregar(9);
		//ab2.agregar(72);
		
		/*
		 * 		arbol.agregar(10);
				arbol.agregar(7);
				arbol.agregar(2);
				arbol.agregar(87);
				arbol.agregar(9);
				arbol.agregar(73);
			 */
			
			/*							10
			 * 						7		 2
			 * 					87		9
			 				73     
			 */	
		
		//ab1.agregar(2);
		//ab1.agregar(10);
		//ab1.agregar(20);
		//ab1.agregar(1);
		/**
		 *                2                                                    	2

	              10           20                                       20           	10

	   			1                                             	   14         1      	     40

				cantNodosInternos(): 2                                cantNodosInternos(): 3
		 * 
		 * 
		 */
		
		//System.out.println(ab1.cantNodos());
		//System.out.println(ab1.toString());
		//System.out.println(ab1.sumaInternos());
		//System.out.println(ab1.sumaInternos2());
		//System.out.println(ab1.ramaMasCorta());
		//System.out.println(ab1.cantNodosInternos());
		//System.out.println(ab1.cantHojas());
		//System.out.println(ab2.cantNodosInternos());
		ABB abb = new ABB();
		/**
		 * El resultado de “balancear” este abb podría ser

                                                                   50

                                  30                                                                    80

                           20               40                                            70                  90

                     10                                                               60                            100
		 * 
		 * 
		 * */
		abb.agregar(50);
		abb.agregar(10);
		abb.agregar(20);
		abb.agregar(30);
		abb.agregar(40);
		abb.agregar(60);
		abb.agregar(70);
		abb.agregar(80);
		abb.agregar(90);
		abb.agregar(100);
		
		System.out.println(abb.toString());
	}

}
