package ListaRec;

public class ListaRec {
	
	private Nodo head;
	private Integer size;

	public ListaRec() {

		this.size = 0;
		int hola = 1;
	}
	
	static class Nodo {
		Integer valor;
		Nodo tail;
		
		public Nodo(Integer valor) {
			this.valor = valor;
		}
		
		public Nodo(Nodo tail, Integer valor) {
			this.valor = valor;
			this.tail = tail;
		}
	}



	
//	public ListaRec reverse() {
//		
//	}
	
	//modifico el this
	public void reverse() {
		reverse(head);
	}
	
		// Firma Ok
		// Condicion final..
		// Escritura:
		// el reverse de una lista enlazada es
		// reverse(tail) + head
		
		//Asumamos que el operador + realiza la concatenacion de listas
		// { 2, 3 ,4 , 10 } -> { 10, 4, 3, 2 }
		// reverse( {3, 4, 10} ) + 2
		// reverse( {4, 10} ) + 3
		// reverse( {10} ) + 4
		
		// head -> 10 -> 4 -> 3 -> 2 -> Null
		
		// reverse(tail) + head
	
	private Nodo reverse(Nodo n) {
		if(n.tail == null) {
			this.head = n;
			return head;
		}else {
			// reverse(tail) + head
			Nodo nodo = reverse(n.tail);
			nodo.tail = new Nodo(n.valor);
			return nodo.tail;
		}
	}
	
	
	
	
		// Me llega un 5
		// {5 -> Null}
		// Agregar 3
		// { 5 -> 3 -> Null }	
	public void agregar(Integer elem) {
		head = agregar(head, elem);
	}
	
	private Nodo agregar(Nodo nodo, Integer elem) {
		if(nodo==null) {
			this.size++;
			return new Nodo(elem);
		}else {
			nodo.tail = agregar(nodo.tail, elem);
			return nodo;
		}
	}
	
	
	
		// { 2, 3, 4 } l.sumar() -> 9
	
		// Firma ok
	public Integer sumar() {
		return sumar(head);
	}
	
	public Integer sumar(Nodo nodo) {
		//termina cuando llegue a algo null
		if(nodo==null) {
			return 0;
		}else {
			// Suma el head, y despues suma el resto
			// head + sumar(tail)
			return nodo.valor + sumar(nodo.tail);
		}
	}


	// To String
	//Hacer un programa que imprima en pantalla una lista enlazada. Sobrescribir el metodo toString de Java
	public String toStringLista(){
		return toStringLista(head);
	}

	private String toStringLista(Nodo nodo){
		if(nodo == null){
			return "" + 0;
		}else{
			return "" + nodo.valor + toStringLista(nodo.tail);
		}
	}



	//Palindromo
	//Hacer un programa que devuelva verdadero si una lista enlazada de enteros es palindromo (Se lee igual
	//de izquierda a derecha) Ejemplo:
	//				  {} −→ True
	//{1, 26, 73, 26, 1} −→ True
	//	   {26, 8, 8, 1} −→ False
	public boolean palidromo(){
		return palidromo (head);
	}

	private boolean palidromo(Nodo nodo){
		if(nodo == null){
			return true;
		}else{
			if(nodo.valor== reverse(nodo).valor){
				return true && palidromo(nodo.tail);
			}else{
				return false;
			}
		}
	}

	public Integer min() {
		return min(head, Integer.MAX_VALUE);
	}
	
		//firma
	private Integer min(Nodo nodo, Integer minActual) {
		if(nodo == null) {
			return 0;
			//Devolver algo tal que no me cambie el minActual
		}else {
			//min(actual || minActual, min(tail))
			if(nodo.valor < minActual) {
				return min(nodo.tail, nodo.valor);
			}
			else {
				return min(nodo.tail, minActual);
			}	
		}
	}
	
	
	
	public Integer size() {
		return size;
	}
	
	public boolean pseudoEquals(ListaRec lista) {
		if(lista.size != this.size()) return false;
		else return pseudoEquals(this.head, lista.head);
	}
	
	private boolean pseudoEquals(Nodo n1, Nodo n2) {
		if(n1 == null) {
			return true;
		}else {
			return n1.valor.equals(n2.valor) && pseudoEquals(n1.tail,n2.tail);
		}
	}
}
