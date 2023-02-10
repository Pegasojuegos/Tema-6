package Lista;

public class PruebaLista {

	public static void main(String[] args) {
		
		int tamaño=40;
		ListaObjetos<Character> lista =new ListaObjetosE<Character>(tamaño);
		
		for(int i=0;i<=30;i++) {
			lista.add((char)('A'+i));
		}
		for(int i=0;i<tamaño;i++) {
			System.out.println(lista.get(i)+" "+lista.remove(i));
		}
	}

}
