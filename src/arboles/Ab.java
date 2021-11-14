package arboles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import arboles.Ab.Nodo;

public class Ab {
	protected Nodo raiz;
	
	public static class Nodo{
		protected Integer info;
		protected Nodo izq;
		protected Nodo der;
		public Nodo(Integer info) {
			this.info = info;
		}
		public Integer getDato() {
			return info;
		}
		public Nodo getHijoIzq() {
			return izq;
		}
		public Nodo getHijoDer() {
			return der;
		}
	}	
	
	public void agregar(Integer elem) {
		if(raiz == null) {
			raiz=new Nodo(elem);
		}else {
			agregar(raiz,elem);
		}
	}
	
	private void agregar(Nodo nodo, Integer elem) {
		if (nodo.izq == null)
			nodo.izq = new Nodo(elem);
		else if(nodo.der == null)
			nodo.der = new Nodo(elem);
		else
			agregar(nodo.izq, elem);
	}
	
	public int sumaInternos() {
		return sumaInternos(raiz);
	}

	public String sumaInternos2() {
		return sumaInternos2(raiz);
	}
	private int sumaInternos(Nodo n) {
		if(n==null) {
			return 0;
		}		
		if(!esHoja(n) && !esRaiz(n)) {
			return n.info + sumaInternos(n.izq) + sumaInternos(n.der);
		}else {
			return sumaInternos(n.izq) + sumaInternos(n.der);
		}
		
	}
	
	private String sumaInternos2(Nodo n) {
		String ret = "";
		if(n==null) {
			return "";
		}
		
		if(!esHoja(n) && !esRaiz(n)) {
			ret = ret + n.info + ",";
			ret	= ret + toString(n.izq);
			ret = ret+ toString(n.der);
		}else {
			return sumaInternos2(n.izq) + sumaInternos2(n.der);
		}
		return ret;
	}
	
	
	private boolean esRaiz(Nodo n) {
		return n==raiz;
	}

	
/**
	public void agregarder(Integer elem) {
		Nodo nuevo = new Nodo(elem);
		if(raiz == null) {
			raiz=null;
		}else {
			agregarder(raiz,nuevo);
		}
	}
	private void agregarder(Nodo nodo, Nodo nuevo) {
		if (nodo.der == null)
			nodo.der = nuevo;
		else if(nodo.izq == null)
			nodo.izq = nuevo;
		else
			agregarder(nodo.der, nuevo);
	}**/
	
	
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
	public void inorder() {
		inorder(raiz);
	}
	private void inorder(Nodo nodo) {
		if(nodo!=null) {
			inorder(nodo.izq);
			System.out.println(nodo.info);
			inorder(nodo.der);
		}
	}
	/**
	private String toString(Nodo n) {
		// StringBuilder sb = new StringBuilder();
		String ret = "";
		if(raiz==null) {
			return "raiz==null";
		}
		if (n != null) {
			ret = ret + n + "," + toString(n.izq) + toString(n.der);
		}

		return ret;

	}**/
	
	public String ramaMasCorta() {
		return ramaMasCorta(raiz);
	}
	private String ramaMasCorta(Nodo nodo) {
		if(nodo==null) {
			return "0";
		}
		else if(contarNodos(nodo.der)<contarNodos(nodo.izq)){
			return "" + nodo.info + ramaMasCorta(nodo.der) + ramaMasCorta(nodo.izq);
		}
		return "";
	}
	private int contarNodos(Nodo nodo) {
		if(nodo==null) {
			return 0;
		}
		if(nodo!=null) {
			return 1 + contarNodos(nodo.izq);
		}
		return 0;
	}
	//private boolean alturaminima(Nodo nodo) {
		//return true || Integer.min(alturaminima(nodo.izq), alturaminima(nodo.der));
	//}
	private boolean esHoja(Nodo n) {
		return n.der == null || n.izq == null;
	}
	
	public Integer cantNodosInternos() {
		return cantNodosInternos(raiz);
		
	}
	/**
	 *                2                                                    	2

              10           20                                       20           	10

   			1                                             	   14         1      	     40

			cantNodosInternos(): 2                                cantNodosInternos(): 3
	 * 
	 * 
	 */
	private boolean esHoja2(Nodo n) {
		return n.der == null && n.izq == null;
	}
	
	public Integer cantNodosInternos(Nodo n) {
		if (n == null) {
			return 0;
		}if (esHoja2(n)) {
			return cantNodosInternos(n.izq) + cantNodosInternos(n.der);
		}else {
			return 1 + cantNodosInternos(n.izq) + cantNodosInternos(n.der);
		}
		
			
	}
	
	public Integer cantHojas() {
		// Aca haya que definir cosas..
		return cantHojas(raiz);
	}
	private int cantHojas(Nodo n) {
		if (n == null)
			return 0;
		if (esHoja(n))
			return 1;
		return cantHojas(n.izq) + cantHojas(n.der);
	}
	
		
	public Integer cantNodos() {
		return cantNodos(raiz);
	}
	
	private Integer cantNodos(Nodo n) {
		if(n == null) {
			return 0;
		}
		else {
			return 1 + cantNodos(n.izq) + cantNodos(n.der);
		}
	}
}
