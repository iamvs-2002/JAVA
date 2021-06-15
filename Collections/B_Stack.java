import java.util.*;
class B_Stack{
	public static void main(String[] args) {
		//LIFO
		Stack<String> stack = new Stack<>();
		stack.push("a"); //adding the elements to the stack
		stack.push("b");
		stack.push("c");
		stack.push("d");

		System.out.println(stack);
		System.out.println(stack.peek());//top most element in the stack
		stack.pop();
		System.out.println(stack.peek());//top most element in the stack
		System.out.println(stack);
		stack.push("d");
		System.out.println(stack);
	}
}