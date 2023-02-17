package dio.java.main;

public class Main {
	public static void main(String[] args) {
		
		Fila<String> minhaFila = new Fila<String>();
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue("primeiro");
		System.out.println(minhaFila);
		minhaFila.enqueue("segundo");
		System.out.println(minhaFila);
		minhaFila.enqueue("terceiro");
		System.out.println(minhaFila);
		minhaFila.enqueue("quarto");
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue("ultimo");
		System.out.println(minhaFila);
		System.out.println(minhaFila.first());
	}
}
