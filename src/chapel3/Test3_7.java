package chapel3;

import java.util.ArrayList;
import java.util.List;


public class Test3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		makeList(100000);
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000f + " seconds");
	}
	public static List<Integer> makeList(int N){
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for(int i=0; i<N; i++){
			lst.add(i);
			lst.trimToSize();
		}
		return lst;
	}

}
