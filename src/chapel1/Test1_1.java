package chapel1;

import java.util.Arrays;
import java.util.Random;

public class Test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10_000; i<Integer.MAX_VALUE; i+=50_000){
			sortK(i);
		}
	}
	
	public static void sortK(int n){
		int  k=n/2;
		int[] arr = new int[n]; 
		Random rank = new Random(10);
		long start, end;
		for(int i=0; i<n; i++){
			arr[i] = rank.nextInt();
		}
		/**
		 * ¿ìËÙÅÅÐò
		 */
		start = System.currentTimeMillis();
		Arrays.sort(arr);
		end = System.currentTimeMillis();
		System.out.print( " SortAll" + (end - start)/1000f);
		
		/**
		 * kÔªËØ
		 */
		start = System.currentTimeMillis();
		int[] temp = new int[k];
		int tempnum;
		for(int i=0; i<k; i++){
			temp[i] = arr[i];
		}
		Arrays.sort(temp);
		for(int i=k; i<n; i++){
			if(arr[i] < temp[k-1]){
				temp[k-1] = arr[i];
				Arrays.sort(temp);
			}
		}
		end = System.currentTimeMillis();
		System.out.println("\tSortK " + (end - start)/1000f);
		
	}

}
