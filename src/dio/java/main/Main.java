package dio.java.main;

public class Main {
	public static void main(String[] args) {
		
		Fila minhaFila = new Fila();
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue(new No("primeiro"));
		System.out.println(minhaFila);
		minhaFila.enqueue(new No("segundo"));
		System.out.println(minhaFila);
		minhaFila.enqueue(new No("terceiro"));
		System.out.println(minhaFila);
		minhaFila.enqueue(new No("quarto"));
		System.out.println(minhaFila);
	}
}
