package Lista;

public interface ListaObjetos<T> {
	public boolean add(T obj);
	public boolean add(int index, T obj);
	public T get(int index);
	public boolean remove(int index);
	public boolean isEmpty();
}
