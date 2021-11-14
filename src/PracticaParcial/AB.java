package PracticaParcial;

import AAB.AB.Nodo;

public class AB {
	protected Nodo  raiz;
	
	public static class Nodo{
		protected Integer info;
		protected Nodo izq;
		protected Nodo der;
		public Nodo(Integer info) {
			this.info = info;
		}
	}
	/**
	 * AB.agregarizq(8);
	 * AB.agregar(12);
	 * AB.agregar(39);
	 * AB.agregar(25);
	 * AB.insertarIzq(9);
	 * AB.insertarIzq(18);
	 * 
	 * 
	 * */
	public void agregarizq(Integer elem) {
		Nodo nuevo = new Nodo(elem);
		if(raiz == null) {
			raiz=null;
		}else {
			agregarizq(raiz,nuevo);
		}
	}
	public void agregarder(Integer elem) {
		Nodo nuevo = new Nodo(elem);
		if(raiz == null) {
			raiz=null;
		}else {
			agregarder(raiz,nuevo);
		}
	}
	
	private void agregarizq(Nodo nodo, Nodo nuevo) {
		if (nodo.izq == null)
			nodo.izq = nuevo;
		else if(nodo.der == null)
			nodo.der = nuevo;
		else
			agregarizq(nodo.izq, nuevo);
	}
	
	private void agregarder(Nodo nodo, Nodo nuevo) {
		if (nodo.der == null)
			nodo.der = nuevo;
		else if(nodo.izq == null)
			nodo.izq = nuevo;
		else
			agregarder(nodo.der, nuevo);
	}
	
	
	@Override
	public String toString() {
		return toString(raiz);
	}
	private String toString(Nodo n) {
		// StringBuilder sb = new StringBuilder();
		String ret = "";

		if (n != null) {
			ret = ret + n.info + ",";
			ret	= ret + toString(n.izq);
			ret = ret+ toString(n.der);
		}

		return ret;

	}
	/**
	private String toString(Nodo n) {
		// StringBuilder sb = new StringBuilder();
		String ret = "";

		if (n != null) {
			ret = ret + n + "," + toString(n.izq) + toString(n.der);
		}

		return ret;

	}**/
	
	public int cantNodos() {
		return 0;
	}

}
