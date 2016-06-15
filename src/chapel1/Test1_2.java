package chapel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] chars = createWordList(26);
		List<String>lists =extract(chars);
		for (String string : lists) {
			if(string.indexOf("zero") != -1){
			System.out.println(string);
			}
		}
	}
	
	public static char[][] createWordList(int n){
		char[][] chars = new char[n][n];
		String charList = "abcdefghijklmnopqrstuvwxyz";
		Random rank = new Random(3);
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				chars[i][j] = charList.charAt(rank.nextInt(26));
				System.out.print(chars[i][j] + "\t");
			}
			System.out.println();
		}
		return chars;
	}
	
	public static List<String> extract(char[][] chars){
		List<String>lists = new ArrayList<String>();
		int length = chars.length;
		String tempStr1, tempStr2;
		for(int i=0; i<chars.length; i++){
			tempStr1 = "";
			tempStr2 = "";
			for(int j=0; j<chars[i].length; j++){
					tempStr1 += String.valueOf(chars[i][j]);
					tempStr2 += String.valueOf(chars[j][i]);
			}
			lists.add(tempStr1);
			lists.add(deSort(tempStr1));
			lists.add(tempStr2);
			lists.add(deSort(tempStr2));
		}
		for(int k=0; k<2*length-1; k++){
			tempStr1 = "";
			for(int i=0; i<chars.length; i++){
				for(int j=0; j<chars[i].length; j++){
					if(k == i+j){
						tempStr1 += String.valueOf(chars[i][j]);
					}
				}
			}
			lists.add(tempStr1);
			if(tempStr1.length() != 1){
				lists.add(deSort(tempStr1));
			}
		}
		for(int k=-1*length+1; k<length; k++){
			tempStr1 = "";
			for(int i=0; i<chars.length; i++){
				for(int j=0; j<chars[i].length; j++){
					if(k == i-j){
						tempStr1 += String.valueOf(chars[j][i]);
					}
				}
			}
			lists.add(tempStr1);
			if(tempStr1.length() != 1){
				lists.add(deSort(tempStr1));
			}
		}
		return lists;
	}
	

	
	static String deSort(String str){
		String temp ="";
		for(int k=str.length()-1; k>=0; k--){
			temp += String.valueOf(str.charAt(k));
		}
		return temp;
	}

}
