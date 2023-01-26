package FIFO;

public interface ColaObjetos<T> {
	public boolean add(T obj);
	public T remove();
	public boolean isEmpty();
}
