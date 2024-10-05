package Stack;

public class Start {

	public static void main(String[] args) {
		MyStack mystack = new MyStack(10);
		int[] stack = new int[mystack.max_size];
		mystack.push(stack, 5);
		mystack.push(stack, 10);
		mystack.push(stack, 23);
		mystack.push(stack, 1);
		mystack.push(stack, 4);
		
		System.out.print("Push in stack: ");
		mystack.printStack(stack);
		
		System.out.println("");
		System.out.print("pop from stack last in: ");
		mystack.pop(stack);
		
		System.out.println("");
		System.out.print("Stack after pop from stack: ");
		mystack.printStack(stack);
		
		
		System.out.println("");
		mystack.topElement(stack);
		
	}

}
