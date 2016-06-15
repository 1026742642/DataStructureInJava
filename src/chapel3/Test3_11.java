package chapel3;

import java.util.Iterator;

public class Test3_11<E> implements Iterator<E> {

	public static class Node<E>{
		public E data;
		public Node<E> next;
		public Node(E d, Node<E> n){
			data = d;
			next = n;
		}
	}
	Node<E> head;
	private int theSize;
	private int modCount = 0;
	
	public Test3_11() {
		clear();
	}
	public void clear(){
		head = new Node<E>(null, null);
		theSize = 0;
		modCount++;
	}
	public int size(){
		return theSize;
	}
	public boolean add(E x){
		add(size(), x);
		return true;
	}
	public void add(int idx, E x){
		Node<E> p = new Node(x, null);
		getNode(idx).next = p;
		theSize++;
		modCount++;
	}
	private Node<E> getNode(int idx){
		Node<E> p;
		if(idx<0 || idx>size())
			throw new IndexOutOfBoundsException();
		p = head;
		for(int i=0; i<idx; i++)
			p = p.next;
		return p;
	}
	public E get(int idx){
		return getNode(idx).data;
	}
	public int getPosition(E e){
		Node p = head.next;
		for(int i=0; i<theSize; i++){
			if(p.data == e)
				return i;
			p = p.next;
		}
		return -1;
	}
	public E remove(int idx){
		return remove(getNode(idx));
	}
	private E remove(Node<E> p){
		p.next = p.next.next;
		theSize--;
		return p.data;
	}
	public void show(){
		Node p = head.next;
		while(p!=null){
			System.out.print(p.data + "\t");
			p = p.next;
		}
		System.out.println();
	}
	public boolean isExist(E e){
		Node p = head.next;
		while(p != null){
			if(p.data == e)
				return true;
			p = p.next;
		}
		return false;
	}
	public boolean isExitst(Node<E> p){
		return isExist(p.data);
	}
	public void merge(E e){
		int n = getPosition(e);
		if(n == -1){
			add(e);
		}else{
			remove(n);
		}
	}
	public Test3_11 sort(Test3_11<E> lists){
		Test3_11<E> temp = new Test3_11<>();
		temp.add(head.next.data);
		Node p = head.next;
		for(int i=1; i<=theSize; i++){
			p = p.next;
		}
		return temp;
	}
	public void swop(int n, int m){
		if(n == m)
			return;
		if(Math.abs(n-m) != 1)
			swop(getNode(n-1), getNode(n), getNode(m-1), getNode(m));
		else{
			int min = Math.min(n, m);
			int max = Math.max(n, m);
			swop(getNode(min-1), getNode(min), getNode(max));
		}
	}
	private void swop(Node<E> n1, Node<E> n2, Node<E> m1, Node<E> m2){
		Node<E> p = m2.next;
		m2.next = n2.next ;
		m1.next = n2;
		n2.next = p;
		n1.next = m2;
	}
	private void swop(Node<E> head, Node<E>n, Node<E> m){
		Node<E> p = n.next;
		n.next = m.next;
		m.next = head.next;
		head.next = p;
	}
	public void sort(){
		for(int i=1; i<=theSize; i++){
			for(int j=i+1; j<=theSize; j++){
				if((Integer)get(i) > (Integer)get(j)){
					swop(i, j);
				}
			}
		}
	}
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
