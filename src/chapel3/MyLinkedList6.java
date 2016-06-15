package chapel3;

import java.util.Iterator;


public class MyLinkedList6<E>implements Iterable<E> {

	private static class Node<E>{
		private E data;
		private Node<E> next;
		public Node(E d, Node<E> n){
			data = d;
			next = n;
		}
	}
	private int theSize;
	private int modCount = 0;
	Node<E> beginNode;
	Node<E> endNode;
	public MyLinkedList6() {
		clear();
	}
	public void clear(){
		beginNode = new Node<E>(null, null);
		endNode = new Node<E>(null, null);
		beginNode.next = endNode;
		endNode.next = beginNode;
		theSize = 0;
		modCount++;
	}
	public int size(){
		return theSize;
	}
	public boolean add(E x){
		add(size(),x);
		return true;
	}
	public void add(int idx, E x){
		Node<E> p = getNode(idx);
		Node<E> newNode = new Node<>(x, p.next);
		p.next  = newNode;
		theSize++;
		modCount++;
	}
	public E remove(int idx){
		return remove(getNode(idx-1));
	}
	public E remove(Node<E> pre){
		Node<E> tempNode = pre.next;
		pre.next = pre.next.next;
		theSize--;
		modCount++;
		return tempNode.data;
	}
	public E get(int idx){
		return getNode(idx).data;
	}
	public Node<E> getNode(int idx){
		Node<E> p;
		if(idx<0 || idx>size())
			throw new IndexOutOfBoundsException();
		p = beginNode.next;
		for(int i=0; i<idx; i++)
			p = p.next;
		return p;
	}
	public E del(int m){
		Node<E> temp = beginNode.next;
		Node<E> p;
		getNode(theSize).next = beginNode.next;
		while(temp != temp.next){
//			System.out.println("----------------------");
			for(int i=0; i<m; i++){
				if(temp.data == null){
					i--;
					continue;
				}
				temp = temp.next;
			}
			p = temp.next;
			System.out.println("exit:" + remove(temp));
			temp = p;
		}
		return temp.data;
	}
	public void show(){
		System.out.println(endNode.next == beginNode);
		for(Node<E>i=beginNode.next; i!=beginNode; i=i.next){
			System.out.println(i.data);
		}
	}
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
