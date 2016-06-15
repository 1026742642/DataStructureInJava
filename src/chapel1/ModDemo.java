package chapel1;

import java.awt.Shape;

public class ModDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		for(int i=1; i<Integer.MAX_VALUE; i++){
			int j = i%8;
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000f + " seconds");
		
		start = System.currentTimeMillis();
		for(int i=1; i<Integer.MAX_VALUE; i++){
			int j = i-(i/8)*8;
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) / 1000f + " seconds");
	}

}
