package chapel1;

import java.util.Scanner;

public class Test1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 18;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(binary(i));

	}

	public static int binary(int i){
		if(i%2 != 0){
			return 1+binary(i/2);
		}else{
			return 1;
		}
	}
}
