package FIFO;

import java.util.Arrays;

public class Circular<T> implements ColaObjetos<T> {
	protected T[] cola;
	protected int inicio,fin;
	
	public Circular(int tamaño) {
		this.cola=(T[]) new Object[tamaño];
		inicio=0;
		fin=0;
	}
	
	@Override
	public boolean add(T obj) {
		if(!isFull()) {
			cola[fin]=obj;
			fin++;
			if(fin==cola.length)fin=0;
			return true;
		}else
		return false;
	}
	@Override
	public T remove() {
		if(!isEmpty()) {
			T aux=cola[inicio];
			cola[inicio]=null;
			inicio++;
			if(inicio==cola.length)inicio=0;
			return aux;
		}
		return null;
	}
	
	@Override
	public boolean isEmpty() {
		return numElementos()==0;
	}
	
	public boolean isFull() {
	return numElementos()==cola.length;
	}

	public int numElementos() {
		if(fin<inicio) return fin+cola.length-inicio;
		if(fin>inicio) return fin-inicio;
		if(fin==inicio) {
			if(cola[fin]==null ) {
				return 0;
			}else return cola.length;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Circular [cola=" + Arrays.toString(cola) + "]";
	}
	
	
}

