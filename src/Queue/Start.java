package Queue;

public class Start {

	public static void main(String[] args) {
		
		try {
			MyQueue myqueue = new MyQueue(2);
			int[] queue = new int[myqueue.max_size];
			
//			myqueue.showQueue(queue);
//			myqueue.deQueue(queue);
			
			myqueue.enQueue(queue, 2);
			myqueue.enQueue(queue, 7);
			myqueue.enQueue(queue, 3);
			System.out.println();
			myqueue.showQueue(queue);
			System.out.println();
			myqueue.frontElement(queue);
		}catch(Exception e) {
			System.out.print(e);
		}

	}

}
