package arboles;

import java.util.ArrayList;
import java.util.List;

import AAB.AB.Nodo;

public class ABB extends Ab{
	
	@Override
	public void agregar(Integer elem) {
		Nodo nodo = new Nodo(elem);
		if(super.raiz == null) {
			raiz = nodo;
		}
		else {
			agregar(elem, raiz);
		}
	}
	
	public Nodo agregar(Integer elem, Nodo nodo) {
		if(nodo == null) {
			return new Nodo(elem);
		}
		else {
			//No admite repetidos
			if(nodo.info.equals(elem)) {
				return nodo;
			}   
			else if(nodo.info < elem) {
				nodo.der = agregar(elem, nodo.der);
			}
			else {
				nodo.izq = agregar(elem, nodo.izq);
			}
			return nodo;
		}
	}
	
	public boolean buscar(Integer elem) {
		return buscar(raiz, elem);
	}
	private boolean buscar(Nodo nodo, Integer elem) {
		if(nodo==null) {
			return false;
		}else if(nodo.info==elem) {
			return true;
		}else {
			if(nodo.info<elem) {
				return buscar(nodo.der, elem);
			}else {
				return buscar(nodo.izq, elem);
			}
		}
	}
	public Nodo balancear() {
		List<Integer> l = new ArrayList<>();
		return inorder(raiz, l);
	}
	
	private Nodo inorder(Nodo nodo, List<Integer> l) {
		if(nodo != null) {
			inorder(nodo.izq, l);
			l.add(nodo.info);
			inorder(nodo.der, l);
		}
		return balancear2(l);
	}
	
	public Nodo balancear2(List<Integer> l) {
		return balancear(l, raiz,0);
		
	}
	public Nodo balancear(List<Integer> l, Nodo nodo, int index) {
		if(nodo == null) {
			return new Nodo(l.get(index));
		}
		else {
			//No admite repetidos
			if(nodo.info.equals(l.get(index))) {
				return nodo;
			}   
			else if(nodo.info <l.get(index)) {
				nodo.der = balancear(l, nodo.der, index+1);
			}
			else {
				nodo.izq = balancear(l, nodo.izq, index+1);
			}
			return nodo;
		}
	}
	
	

	@Override
	public String toString()
	{
		return toString(raiz);
	}
	private String toString(Nodo nodo)
	{
		if (nodo==null)
			return "";
		return toString(nodo.getHijoIzq()) + ", " + nodo.getDato() + ", " + toString(nodo.getHijoDer());
	}
	
	
	
	
	

}
