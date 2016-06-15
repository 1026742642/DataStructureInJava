package chapel3;

public class Test3_3M<E> extends MyLinkedList<E> {
	public boolean contains(E e){
		Node<E> p = beginMarker.next;
		while(p != endMarker){
			if(p.data.equals(e))
				return true;
			p = p.next;
		}
		return false;
	}
}
