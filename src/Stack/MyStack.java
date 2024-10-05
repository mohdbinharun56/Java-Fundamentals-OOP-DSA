package Stack;

public class MyStack {
	int Top;
	int max_size;
	
	MyStack(int size){
		this.max_size = size;
		Top = -1;
	}
	
	boolean isEmpty() {
		if(Top==-1) {
			return true;
		}
		return false;
	}
	boolean isFull() {
		if(Top==max_size) {
			return true;
		}
		return false;
	}
	
	void push(int stack[],int element) {
		if(isFull()) {
			System.out.print("Stack is Overflow!");
		}else {
			Top++;
			stack[Top] = element;
		}
	}
	void pop(int stack[]) {
		if(isEmpty()) {
			System.out.print("Stack is Underflow!");
		}else {
			int temp;
			temp = stack[Top];
			Top--;
			System.out.print(temp+" remove from the stack");
		}
	}
	
	void topElement(int stack[]) {
		if(isEmpty()) {
			System.out.print("Stack is Underflow!");
		}else {
			System.out.print("Top element of stack is "+stack[Top]);
		}
	}
	
	void printStack(int stack[]) {
		if(isEmpty()) {
			System.out.print("Stack is underflow");
			}else {
				for(int i=Top;i>=0;i--) {
					System.out.print(stack[i]+" ");
		}
	}
}
}
