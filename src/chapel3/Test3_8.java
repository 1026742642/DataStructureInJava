package chapel3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lists = new ArrayList<>();
		for(int i=0; i<1000000; i++)
			lists.add(i);
		long start = System.currentTimeMillis();
		removeFirstHalf(lists);
		long end = System.currentTimeMillis();
		System.out.println("The ArrayList: " + (end - start) / 1000f + " seconds");
		
		lists = new LinkedList<>();
		for(int i=0; i<1000000; i++)
			lists.add(i);
		start = System.currentTimeMillis();
		removeFirstHalf(lists);
		end = System.currentTimeMillis();
		System.out.println("The LinkedList: " + (end - start) / 1000f + " seconds");
	}
	public static void removeFirstHalf(List<?> lst){
		int theSize = lst.size()/2;
		for(int i=0; i<theSize; i++)
			lst.remove(0);
	}

}
