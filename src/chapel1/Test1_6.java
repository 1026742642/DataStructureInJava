package chapel1;

import java.util.Arrays;
import java.util.Random;


public class Test1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int length = 90;
		char[] str;
		str = new char[length];
		String charList = "abcdefghijklmnopqrstuvwxyz";
		Random rank = new Random(6);
		for(int i=0; i<length; i++){
			str[i] = charList.charAt(rank.nextInt(26));
		}
		System.out.println(Arrays.toString(str));
		permute(str, 0, length);
	}
	private static void permute(char[] str, int low, int high){
		if(low == high){
			System.out.println(Arrays.toString(str));
			return ;
		}else{
			for(int i=low; i<high; i++){
				char temp = str[low];
				str[low] = str[i];
				str[i] = temp;
				permute(str, low+1, high);
				temp = str[low];
				str[low] = str[i];
				str[i] = temp;
			}
		}
	}
}
