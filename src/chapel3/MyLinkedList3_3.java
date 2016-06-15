package chapel3;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList3_3<E> extends MyLinkedList<E> {
	public static void main(String[] args) {
		LinkedList< String> l = new LinkedList<String>();

	}
	public boolean contains(E e){
		if(e == null){
			for(Node<E> x=this.beginMarker; x!=null; x=x.next){
				if(x.data == null)
					return true;
			}
		}else{
			for(Node<E> x=this.beginMarker; x!=null; x=x.next){
				if(e.equals(x.data))
					return true;
			}
		}
		return false;
	}
}
