package chapel3;

public class Test3_2M {
	public static class Node<AnyType>{
		public AnyType data;
		public Node<AnyType> next;
		public Node<AnyType> prev;
		public Node(AnyType d, Node<AnyType> n){
			data = d;
			next = n;
		}
		public Node(AnyType d, Node<AnyType> p, Node<AnyType> n){
			data = d;
			next = n;
			prev = p;
		}
	}
	public static void swapWithNextL(Node beforep){
		Node p = beforep.next;
		Node afterp = p.next;
		beforep.next = afterp;
		p.next = afterp.next;
		afterp.next = p;
	}
	public static void swapWithNextD(Node p){
		Node beforp = p.prev;
		Node afterp = p.next;
		afterp.next.prev = p;
		p.next = afterp.next;
		p.prev = afterp;
		afterp.prev = beforp;
		beforp.next = afterp;
		afterp.next = p;
	}

	
}
