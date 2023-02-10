package MultiClase;

import FIFO.ColaObjetos;
import Lista.ListaObjetos;
import tad.PilaDeObjetos;

public class PruebaMultiLista {

	private static ListaObjetos<Character> lista=new MultiLista<Character>(10);
	private static PilaDeObjetos<Integer> pila=new MultiLista<Integer>(10);
	private static ColaObjetos<Double> cola=new MultiLista<Double>(10);
	
	public static void main(String[] args) {
		
		System.out.println("Relleno");
		for(int i=0;i<10;i++) {
			lista.add((char) ('a'+i));
			pila.push(i);
			cola.add((double)i);
		}
		escribe();
		
		System.out.println("\nEscribo el 5 de lista, lo remuevo,añado n  en la posición 5 y 7 en la 7");
		System.out.println(lista.get(5));
		lista.remove(5);
		lista.add(3,'n');
		lista.set(7, '7');
		System.out.println(lista);
		
		System.out.println("\nBorro 5");
		for(int i=0;i<5;i++) {
			lista.remove(i);
			pila.pop();
			cola.remove();
		}
		escribe();
		
		System.out.println("\nAñado5");
		for(int i=20;i<25;i++) {
			lista.add((char)('a'+i));
			pila.push(i);
			cola.add((double)i);
		}
		escribe();
		

	}
	
	
	public static void escribe() {
		System.out.println("lista");
		System.out.println(lista);
		System.out.println("cola");
		System.out.println(cola);
		System.out.println("pila");
		System.out.println(pila);
	}

}
