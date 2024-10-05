package Queue;

public class MyQueue {
	int front;
	int rear;
	int max_size;
	
	public MyQueue(int max_size) {
		this.max_size = max_size;
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty() {
		if(front==-1 && rear==-1) {
			return true;
		}
		return false;
	}
	boolean isFull() {
		if(rear==max_size-1) {
			return true;
		}
		return false;
	}
	public void enQueue(int[] queue,int element) {
		if(isFull()) {
			System.out.print("Queue is Overflow");
		}
		else if(isEmpty()) {
			front =0;
			rear =0;
			queue[rear] = element;
		}
		else {
			rear++;
			queue[rear] = element;
		}
		
	}
	public void deQueue(int[] queue) {
		int temp;
		if(!isEmpty()) {
			if(front==rear && front!=-1) {
				temp = queue[front];
				front = -1;
				rear = -1; 
				System.out.print(temp+" is remove from the queue");
				return;
			}
			temp = queue[front];
			front++;
			System.out.print(temp+ "is remove from the queue");
		}
		System.out.print("Queue is Underflow!");
		
	}
	
	public void frontElement(int[] queue) {
		System.out.print("The front element of Queue is: "+queue[front]);
	}
	
	public void showQueue(int[] queue) {
		if(!isEmpty()) {
			for(int i=front;i<=rear;i++) {
				System.out.print(queue[i]+" ");
			}
			return;
		}
		System.out.print("Queue is Underflow!");
	}
	
}
