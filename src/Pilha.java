public class Pilha {

	int elementos[];
	int topo; // controla quem t� no topo da fila
	
	public Pilha() {
		elementos = new int[10]; // pilha est�tica de tamanho 10
		topo = -1; // posi��o inv�lida do vetor
	}
	
	public void push(int e) {
		if(isFull()) {
			throw new RuntimeException("Stack Overflow");
		}
		topo++;
		elementos[topo] = e;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Empty Stack");
		}
		int e;
		e = elementos[topo];
		topo--;
		return e;
	}
	
	public boolean isEmpty() {
		return (topo == -1);
	}
	
	public boolean isFull() {
		return (topo == elementos.length - 1);
	}
	
	public int top() {
		if(isEmpty()) {
			throw new RuntimeException("Empty Stack");
		}
		return elementos[topo];
	}
}
