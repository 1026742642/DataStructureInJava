package chapel3;

import chapel3.MyLinkedList.Node;

public class Test3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList3_4<Integer> myl1 = new MyLinkedList3_4<Integer>();
		myl1.add(1);
		myl1.add(2);
		myl1.add(3);
		myl1.add(4);
		myl1.add(5);
		
		MyLinkedList3_4<Integer> myl2 = new MyLinkedList3_4<Integer>();
		myl2.add(0);
		myl2.add(4);
		myl2.add(5);
		myl2.add(6);
		
		MyLinkedList3_4<Integer> intersection = new MyLinkedList3_4<Integer>();
//		intersection = intersection.intersection(myl1, myl2);
		intersection = intersection.union(myl1, myl2);
		for(Node<Integer>i=intersection.beginMarker; i!=null; i=i.next){
			if(i.data != null)
			System.out.println(i.data);
		}
		
	}

}
