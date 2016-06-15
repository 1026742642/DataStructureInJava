package chapel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3_6_1 {

	public static void main(String[] args) {
		Test3_6_1 yue = new Test3_6_1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("总人数: ");
		int totalNum = scanner.nextInt();
		System.out.println("报数的大小: ");
		int cycleNum = scanner.nextInt();
		long start = System.currentTimeMillis();
		yue.yuesefu(totalNum, cycleNum);
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000f + " seconds");
	}
	public void yuesefu(int totalNum, int cycleNum){
		// TODO initial 
		List<Integer> arr = new ArrayList<>();
		for(int i=1; i<=totalNum; i++)
			arr.add(i);
		int k = 0;
		while(arr.size() != 1){
			k = (cycleNum+k)%arr.size();
				System.out.print("remove: " + arr.get(k) );
				arr.remove(k);
		}
		System.out.println("\nfinally:" + arr.get(0));
	}

}
