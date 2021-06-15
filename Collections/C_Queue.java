import java.util.*;
class C_Queue{
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>(); //queue using linked list
		//linkedlist now has all the methods that Queue interface has provided

		queue.offer("a"); //adding elements
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		System.out.println(queue);

		System.out.println(queue.poll()); //remove the element from the front
		System.out.println(queue);

		System.out.println(queue.peek()); //next element to be removed = head of queue
	}
}

/*
add() : adds the element. If task is successful, it returns true, else throws an exception.
offer() : adds the element. If task is successful, it returns true, else returns false.

element() : returns the head of the queue. If queue is empty, throws an exception.
peek() : returns the head of the queue. If queue is empty, returns null.

remove() : returns and removes the head of the queue. If queue is empty, throws an exception.
poll() : returns and removes the head of the queue. If queue is empty, returns null.

*/