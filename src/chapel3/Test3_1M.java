package chapel3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3_1M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List L = new ArrayList();
		List<Integer> P = new ArrayList();
		L.add("one");
		L.add(2);
		L.add('3');
		L.add(3.3);
		L.add(8.99D);
		L.add(true);
		P.add(0);
		P.add(3);
		P.add(5);
//		printLost(L, P);
		
		System.out.println(P.iterator().next());
		System.out.println(P.iterator().next());
	}

	public static <AnyType> void printLost(List<AnyType> L, List<Integer> P){
		Iterator<AnyType> iterL = L.iterator();
		Iterator<Integer> iterP = P.iterator();
		
		AnyType itemL = null;
		Integer itemP = 0;
		int start = 0;
		while(iterL.hasNext() && iterP.hasNext()){
			itemP = iterP.next();
			System.out.println(itemP);
/*			System.out.println("Looking for position " + itemP);
			while(start < itemP && iterL.hasNext()){
				start++;
				itemL = iterL.next();
			}*/
			System.out.println(itemL);
		}
	}
}
