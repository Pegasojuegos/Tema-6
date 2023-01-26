package FIFO;

public class ColaObjetosE<T> implements ColaObjetos<T> {

	protected T cola[];
	
	public ColaObjetosE() {
		cola = (T[]) new Object[0];
	}
	
	@Override
	public boolean add(T obj) {
		T temp[]=(T[]) new Object[cola.length+1];
		for(int i=0;i<cola.length;i++) {
			temp[i]=cola[i];
		}
		temp[cola.length]=obj;
		cola=temp;
		return true;
	}

	@Override
	public T remove() {
		T res=cola[0];
		T temp[]=(T[]) new Object[cola.length-1];
		for(int i=0;i<temp.length;i++) {
			temp[i]=cola[i+1];
		}
		cola=temp;
		return res;
	}

	@Override
	public boolean isEmpty() {
		return (cola.length==0);
	}
	
}
