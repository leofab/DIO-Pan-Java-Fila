package dio.java.main;

public class Fila<T> {
	private No<T> refNoEntradaFila;

	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	public void enqueue(T obj) {
		No<T> novoNo = new No<T>(obj);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	
	@SuppressWarnings("unchecked")
	public T first() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				} else {
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public T dequeue() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refNoEntradaFila;
			No<T> noAuxiliar = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	public boolean isEmpty() {
		return refNoEntradaFila == null? true: false;
	}
	
	@Override
	public String toString() {
		String stringRetorno= "";
		No<T> noAuxiliar = refNoEntradaFila;
		
		
		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No{objeto = " + noAuxiliar.getObject() + "}] ---->";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}else {
					stringRetorno += "null";
					break;
				}
			}
		}else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}
}
