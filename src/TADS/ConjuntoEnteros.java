package TADS;

import java.util.LinkedList;

public class ConjuntoEnteros {
	private LinkedList<Integer>Enteros;
	
	public void insertar(Integer elem) {
		if(elem>=0) {
			Enteros.add(elem);
		}
	}
	public boolean pertenece(Integer elem) {
		return Enteros.contains(elem);
	}
	public void eliminar(Integer elem) { // si el elemento no pertenece al conjunto no hace nada
		if(Enteros.contains(elem)) {
			for (int i=0; i< Enteros.size(); i++ ) {
				if(Enteros.get(i)==elem) {
					Enteros.get(i);
				}
			}
		}
	}
	public int tamanio() {
		return Enteros.size();
	}
}
