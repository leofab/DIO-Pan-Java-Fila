package dio.java.main;

public class No<T> {
	private T object;
	private No<T> refNo;
	
	public No(T object) {
		super();
		this.object = object;
		this.refNo = null;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public No<T> getRefNo() {
		return refNo;
	}

	public void setRefNo(No<T> refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	
	
	
}
