package chapel3;

public class Test3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList3_2b<Integer> myl = new MyLinkedList3_2b<>();
		myl.add(1);
		myl.add(3);
		myl.add(5);
		myl.add(7);
		myl.add(8);
		myl.add(9);
		for(int i=0; i<myl.size(); i++)
			System.out.println(myl.get(i));
		System.out.println();
		myl.swop(1, 2);
		for(int i=0; i<myl.size(); i++)
			System.out.println(myl.get(i));
	}

}
