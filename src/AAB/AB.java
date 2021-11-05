package AAB;

import java.util.*;

public class AB{ //arbol binario
	protected Nodo raiz;
	
	public static class Nodo{//clase interna
		protected Integer info;
		protected Nodo izq;
		protected Nodo der;
		public Nodo(Integer info) {
			this.info = info;
		}
		
		@Override
		public String toString() {
			return info.toString();
		}
	
	}
	
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
	
	public void agregar(Integer elem) {
		Nodo nuevo = new Nodo(elem);
		if(raiz == null) {
			raiz = nuevo;
		}else {
			agregar(raiz,nuevo);
		}
	}
	public void agregar(Nodo nodo, Nodo nuevo) {
		if(nodo.izq == null) {
			nodo.izq = nodo;
		}else if(nodo.der == null) {
			nodo.der = nuevo;
		}else {
			agregar(nodo.izq, nuevo);
		}
	}
	
	
	@Override
	public String toString() {
		return toString(raiz);
	}
	private String toString(Nodo n) {
		//StringBuilder sb = new StringBuilder();
		String ret ="";
		
		if(n != null) {
			ret = ret + n + "," + toString(n.izq) + toString(n.der); 
		}
		
		return ret;
	}
	
	
	public boolean pertenece(Integer elem) {
		return pertenece(raiz,elem);
	}
	private boolean pertenece(Nodo n, Integer elem) {
		if(n==null) {
			return false;
		}
		
		return n.info.equals(elem) || pertenece(n.izq, elem) || pertenece(n.der, elem);
	}
	
	
	public Integer altura() {
		return altura(raiz);
	}
	
	private Integer altura(Nodo n) {
		if(n==null) {
			return 0;
		}else{
			return 1 + Integer.max(altura(n.izq), altura(n.der));
		}
	}
	
	
	public Integer cantHojas() {
		return cantHojas(raiz);
	}
	private Integer cantHojas(Nodo n) {
		if(n==null) {
			return 0;
		}if(esHoja(n)) {
			return 1;
		}
		return cantHojas(n.der) + cantHojas(n.izq);
	}
	private boolean esHoja(Nodo n) {
		return n.izq == null || n.der == null;
	}
	
	
	public Integer cantNodos() {
		return cantNodos(raiz);
	}
	private Integer cantNodos(Nodo n) {
		if(n==null) {
			return 0;
		}else {
			return 1+ cantNodos(n.izq) + cantNodos(n.der);
		}
	}
	
	
	public Boolean balanceada() {
		return balanceada(raiz);
	}
	private Boolean balanceada(Nodo n) {
		if(n==null) {
			return true;
		}
		return (Math.abs(altura(n.izq)-altura(n.der))<=1) && balanceada(n.izq) && balanceada(n.der);
	}
	
	public boolean tieneCiclos() {
		Set<Integer> nodosVisitado = new HashSet<>();
		return tieneCiclos(raiz, nodosVisitado);
	}
	private boolean tieneCiclos(Nodo nodo, Set<Integer> nodosVisitado) {
		if(nodo==null) {
			return false;
		}else {
			if(nodosVisitado.contains(nodo.info)) {
				return true;
			}else {
				nodosVisitado.add(nodo.info);
				return tieneCiclos(nodo.izq, nodosVisitado) || tieneCiclos(nodo.der, nodosVisitado);
			}
		}
	}
	
	
	public void crearCiclo(Integer elem1, Integer elem2) {
		if(pertenece(elem1) && pertenece(elem2)) {
			Nodo n1 = buscar(elem1, raiz);
			Nodo n2 = buscar(elem2, raiz);
			
			n1.izq = n2;
		}
	}
	private Nodo buscar(Integer elem, Nodo nodo) {
		if(nodo == null) {
			return null;
		}else if(nodo.info.equals(elem)) {
			return nodo;
		}else {
			Nodo nodoIzq = buscar(elem, nodo.izq);
			Nodo nodoDer = buscar(elem, nodo.der);
			
			return nodoIzq != null ? nodoIzq : nodoDer;
		}
	}
	
	
	public boolean esABB() {
		List<Integer> nodos = this.inorder();
		
		boolean ret = true;
		for (int i = 0; i < nodos.size(); i++) {
			ret = ret && nodos.get(i) <= nodos.get(i+1);
		}
		return ret;
	}
	
	public void preorder() {
		preorder(raiz);
	}
	private void preorder(Nodo nodo) {
		if(nodo != null) {
			System.out.println(nodo.info);
			preorder(nodo.izq);
			preorder(nodo.der);
		}
	}
	
	public List<Integer> inorder(){
		List<Integer> l = new ArrayList<>();
		return inorder(raiz,l);
	}
	private List<Integer> inorder(Nodo nodo, List<Integer>l) {
		if(nodo!=null) {
			inorder(nodo.izq, l);
			l.add(nodo.info);
			inorder(nodo.der,l);
		}
		return l;
	}
	
	
	public boolean igualEstruc(ABB abb2) {
		return igualAux(raiz, abb2.raiz);
	}
	private boolean igualAux(Nodo propio, Nodo otro) {
		if(propio==null) {
			return otro == null;
		}else {
			if(otro==null) {
				return false;
			}else {
				return propio.info.equals(otro.info) && igualAux(propio.izq, otro.izq) && igualAux(propio.der, otro.der);
			}
		}
	}
	
	
	public void recorrerPorNivel() {
		Integer cantNiveles = this.altura();
		recorrerPorNivel(0,cantNiveles);
	}
	private void recorrerPorNivel(Integer nivelActual, Integer ultimo) {
		if(nivelActual==ultimo) {
			return;
		}else {
			imprimirNivel(this.raiz,nivelActual);//O(n)
			recorrerPorNivel(nivelActual+1, ultimo);
		}
		
	}
	
	private void imprimirNivel(Nodo nodo, Integer nivel) {
		if(nodo==null) {
			return;
		}
		if(nivel==0) {
			System.out.println(nodo.info);
		}
		imprimirNivel(nodo.izq, nivel-1);
		imprimirNivel(nodo.der, nivel-1);
		
	}
	
	public void reverse() {
		reverse(this.raiz);
	}
	private void reverse(Nodo nodo) {
		if(nodo == null || esHoja(nodo)) {
			return;
		}else {
			swapHijos(nodo);
			reverse(nodo.izq);
			reverse(nodo.der);
		}
	}
	
	
	private void swapHijos(Nodo nodo) {
		Nodo aux = nodo.der;
		nodo.der = nodo.izq;
		nodo.izq = aux;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}