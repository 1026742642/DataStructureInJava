package chapel3;

public class Test3_11Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Test3_11 lists = new Test3_11<>();
		for(int i=1000; i>0; i--){
			lists.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000f + " seconds");
		System.out.println("the size: " + lists.size());
		lists.show();
		System.out.println(lists.isExist(8));
		System.out.println(lists.getPosition(8));
		lists.merge(9);
		lists.remove(0);
//		lists.show();
		lists.swop(3, 4);
		
		lists.sort();
		lists.show();
		
/*		for(int i=1; i<=1000; i++){
			System.out.println(lists.get(i) + "\t");
		}*/
 	}

}
