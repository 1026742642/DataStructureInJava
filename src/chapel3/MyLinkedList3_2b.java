package chapel3;

public class MyLinkedList3_2b<E> extends MyLinkedList<E> {

	public boolean swop(int a, int b){
		if(Math.abs(a-b) != 1)
			return false;
		else{
			swop(this.getNode(a), this.getNode(b));
			return true;
		}
	}
	public void swop(Node a, Node b){
		a.next = b.next;
		b.next.prev = a;
		
		a.prev.next = b;
		b.next = a;
		b.prev = a.prev;
		a.prev = b;
	}

}
