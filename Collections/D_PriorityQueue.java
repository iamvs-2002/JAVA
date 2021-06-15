import java.util.*;
class D_PriorityQueue{
	public static void main(String[] args) {
		//PriorityQueue<Integer> pqueue = new PriorityQueue<>(); //ordered as per min heap
		PriorityQueue<Integer> pqueue = new PriorityQueue<>(Comparator.reverseOrder()); //ordered as per max heap
		pqueue.add(3);
		pqueue.add(1);
		pqueue.add(4);
		pqueue.add(2);
		System.out.println(pqueue); 

		pqueue.poll(); //the element with the lowest priority, i.e., smallest element will be removed
		System.out.println(pqueue);

		System.out.println(pqueue.peek()); //the next element to be removed
	}
}