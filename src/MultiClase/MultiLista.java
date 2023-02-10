package MultiClase;

import FIFO.ColaObjetos;
import Lista.ListaObjetos;
import tad.PilaDeObjetos;

public class MultiLista<T> implements ListaObjetos<T>,PilaDeObjetos<T>,ColaObjetos<T>{
	protected T lista[];
	protected int fin;

	public MultiLista(int tamaño) {
		lista=(T[]) new Object[tamaño];
		fin=-1;
	}
	
	@Override
	public boolean add(T obj) {
		if(fin<lista.length) {
			lista[fin+1]=obj;
			fin++;
			return true;
		}else
		return false;
	}

	@Override
	public boolean add(int index, T obj) {
		if(fin<lista.length) {
			for(int i=fin;i>=index;i--) {
				lista[i+1]=lista[i];
			}
			lista[index]=obj;
			fin++;
			return  true;
		}else
		return false;
	}

	@Override
	public T get(int index) {
		return lista[index];
	}

	@Override
	public boolean remove(int index) {
		if(!isEmpty()) {
			for(int i=index;i<fin;i++) {
				lista[i]=lista[i+1];
			}
			lista[fin]=null;
			fin--;
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		return (fin==0);
	}

	@Override
	public boolean set(int index, T obj) {
		if(index>=0&&index<fin) {
			lista[index]=obj;
		}
		return true;
	}

	@Override
	public T remove() {
		T res=lista[0];
		remove(0);
		return res;
	}

	@Override
	public boolean push(T o) {
		lista[fin+1]=o;
		fin++;
		return false;
	}

	@Override
	public T pop() {
		T res=lista[fin];
		lista[fin]=null;
		fin--;
		return res;
	}
	
	public String toString() {
		StringBuilder res=new StringBuilder();
		for(int i=0;i<fin;i++)res.append("|"+lista[i]+"|");
		return res.toString();
	}
}
