package chapel3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {
	public static class Node<E>{
		public Node(E d, Node<E> p, Node<E> n){
			data = d;
			prev = p;
			next = n;
		}
		public E data;
		public Node<E> prev;
		public Node<E> next;
	}
	
	
	public MyLinkedList(){
		clear();
	}
	public void clear(){
		beginMarker = new Node<E>(null, null, null);
		endMarker = new Node<E>(null, beginMarker, null);
		beginMarker.next = endMarker;
		theSize = 0;
		modCount++;
	}
	public int size(){
		return theSize;
	}
	public boolean isEmpty(){
		return size() == 0;
	}
	public boolean add(E x){
		add(size(), x);
		return true;
	}
	public void add(int idx, E x){
		addBefore(getNode(idx), x);
	}
	public E get(int idx){
		return getNode(idx).data;
	}
	public E set(int idx, E newVal){
		Node<E> p = getNode(idx);
		E oldVal = p.data;
		p.data = newVal;
		return oldVal;
	}
	public E remove(int idx){
		return remove(getNode(idx));
	}
	private void addBefore(Node<E> p, E x){
		Node<E> newNode = new Node<>(x, p.prev, p);
		newNode.prev.next = newNode;
		p.prev = newNode;
		theSize++;
		modCount++;
	}
	private E remove(Node<E> p){
		p.next.prev = p.prev;
		p.prev.next = p.next;
		theSize--;
		modCount++;
		return p.data;
	}
	public Node<E> getNode(int idx){
		Node<E> p;
		if(idx<0 || idx>size())
			throw new IndexOutOfBoundsException();
		if(idx < size()/2){
			p = beginMarker.next;
			for(int i=0; i<idx; i++)
				p = p.next;
		}else{
			p = endMarker;
			for(int i=size(); i>idx; i--)
				p=p.prev;
		}
		return p;
	}
	public Iterator<E> iterator(){
		return new LinkedListIerator();
	}
	private class LinkedListIerator implements Iterator<E>{
		private Node<E> current = beginMarker.next;
		private int expectedModCount = modCount;
		private boolean okToRemove = false;
		public boolean hasNext(){
			return current != endMarker;
		}
		public E next(){
			if(modCount != expectedModCount)
				throw new ConcurrentModificationException();
			if(!hasNext())
				throw new NoSuchElementException();
			E nextItem = current.data;
			current = current.next;
			okToRemove = true;
			return nextItem;
		}
		public void remove(){
			if(modCount != expectedModCount)
				throw new ConcurrentModificationException();
			if(!okToRemove)
				throw new IllegalStateException();
			MyLinkedList.this.remove(current.prev);
			okToRemove = false;
			expectedModCount++;
		}
	}
	
	private int theSize;
	private int modCount = 0;
	Node<E> beginMarker;
	Node<E> endMarker;
	
}

