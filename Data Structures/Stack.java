class Stack{
	int[] stack = new int[5]; //max sized of stack = 5
	int top = -1;
	void push(int data){
		if (top==4) {
			System.out.println("\nStack overflow");
			return;
		}
		stack[++top]=data;
	}
	void pop(){
		if(top==-1){
			System.out.println("\nStack underflow");
			return;
		}
		top--;
	}
	int size(){
		int size = 0;
		for(int i=0;i<=top;i++)
			size++;
		return size;
	}
	void print(){
		System.out.print("\nPrinting the stack:");
		for(int i=0;i<=top;i++){
			System.out.print(stack[i]+" ");
		}
	}
	int peek(){
		return stack[top];
	}
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.print();
		s.push(4);
		s.push(5);
		s.print();
		s.push(0);
	 	System.out.println(s.peek());
	 	s.pop();
	 	s.print();
	}
}

/*
Output:

Printing the stack:1 2 3
Printing the stack:1 2 3 4 5
Stack overflow
5

Printing the stack:1 2 3 4

*/
