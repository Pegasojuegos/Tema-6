package Lista;

public class ListaObjetosE<T> implements ListaObjetos<T> {
	protected T lista[];
	protected int fin;

	public ListaObjetosE(int tamaño) {
		lista=(T[]) new Object[tamaño];
		fin=0;
	}
	
	@Override
	public boolean add(T obj) {
		if(fin<lista.length) {
			lista[fin]=obj;
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
			for(int i=index;i<=fin;i++) {
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
}
