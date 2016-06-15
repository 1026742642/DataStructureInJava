package chapel3;

import chapel3.MyLinkedList.Node;

public class MyLinkedList3_4<E> extends MyLinkedList<E> {
	public MyLinkedList3_4<E> intersection(MyLinkedList3_4<E> list1, MyLinkedList3_4<E> list2){
		MyLinkedList3_4<E> result = new MyLinkedList3_4<E>();
		for(Node<E> i=list1.beginMarker; i!=null; i=i.next){
			for(Node<E>j=list2.beginMarker; j!=null; j=j.next){
				if(i.data==null || j.data==null)
					continue;
				if(i.data.equals(j.data)){
					result.add(i.data);
				}
			}
		}
		return result;
	}
	public MyLinkedList3_4<E> union(MyLinkedList3_4<E>list1, MyLinkedList3_4<E>list2){
		MyLinkedList3_4<E> result = list1.copy();
		for(Node<E>i=list2.beginMarker; i!=null; i=i.next){
			if(list1.contains(i.data)){
				continue;
			}else{
				result.add(i.data);
			}
		}
		return result;
	}
	public MyLinkedList3_4<E> copy(){
		MyLinkedList3_4<E> temp = new MyLinkedList3_4<>();
		for(Node<E> i=this.beginMarker; i!=null; i=i.next){
			temp.add(i.data);
		}
		return temp;
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
