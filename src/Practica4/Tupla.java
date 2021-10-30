package Practica4;

public class Tupla<E1,E2> {
	private E1 e1;
	private E2 e2;
	
	public Tupla(E1 e1, E2 e2){
	this.e1= e1;
	this.e2 = e2;
	}

	public E1 getE1() { 
		return e1; 
	}

	public void setE1(E1 e1) { 
		this.e1 = e1; 
	}

	public E2 getE2() { 
		return e2;
	}

	public void setE2(E2 e2) { 
		this.e2 = e2; 
	}

	public void sumar(Tupla t){
		//Implementacion de: setE1(getE1 + t.getE1)
		if (t.getE1() instanceof String && getE1() instanceof String){
			setE1((E1)(getE1().toString()+ t.getE1().toString()));
		}	
		if (t.getE2() instanceof String && getE2() instanceof String){
			setE2((E2)(getE2().toString()+ t.getE2().toString()));
		}
	}
}
