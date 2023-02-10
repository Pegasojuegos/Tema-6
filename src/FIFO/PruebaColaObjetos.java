package FIFO;

public class PruebaColaObjetos {

	public static void main(String[] args) {
		
		ColaObjetos<Integer> cola=new Circular<Integer>(10);
		System.out.println("Meto 19 (solo puede 10)");
		for(int i=0;i<=19;i++) {
			cola.add(i);
		}
		System.out.println(cola);
		System.out.println("Saco 5");
		for(int i=0;i<=5;i++) {
			cola.remove();
		}
		System.out.println(cola);
		System.out.println("Meto 9");
		for(int i=11;i<=19;i++) {
			cola.add(i);
		}
		System.out.println(cola);
		System.out.println("Saco todo");
		while(!cola.isEmpty()) {
			cola.remove();
		}
		System.out.println(cola);
		System.out.println("Meto 10");
		for(int i=10;i<=20;i++) {
			cola.add(i);
		}
		System.out.println(cola);
		System.out.println("Vacio todo");
		while(!cola.isEmpty()) {
			cola.remove();
		}
		System.out.println(cola);
	}

}
