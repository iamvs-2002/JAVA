class Queue{
	int capacity = 8;
	int[] queue = new int[capacity];
	int front=0;
	int rear=0;
	int size=0;

	void enqueue(int data){
		if(isFull()){
			System.out.println("Overflow");
			return;
		}
		queue[rear] = data;
		rear = (rear+1)%capacity;
		size++;
	}

	int dequeue(){
		if(isEmpty()){
			System.out.println("Underflow");
			return -1;
		}
		int data = queue[front];
		front=(front+1)%capacity;
		size--;
		return data;
	}

	boolean isFull(){
		return (size==capacity);
	}

	boolean isEmpty(){
		return size==0;
	}

	void show(){
		System.out.print("\nPrinting the queue: ");
		for(int i=0;i<size;i++){
			System.out.print(queue[(front+i)%capacity]+" ");
		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.show();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.show();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.show();
		queue.dequeue();
		queue.show();
	}
}

/*
Output:

Printing the queue: 1 2 3 4 5
Printing the queue: 4 5
Printing the queue: 4 5 1 2
Printing the queue: 5 1 2
*/
