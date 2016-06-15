package chapel3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrintLost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean i;
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
		printLost(L, P);
	}
	
	static void printLost(List L, List<Integer> P){
		for(int i=0; i<P.size(); i++){
			System.out.println(L.get(P.get(i)));
		}
	}

}
