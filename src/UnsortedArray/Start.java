package UnsortedArray;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
//        int capacity = 20;
        int n = 6;
        int i;
//        key = 20;
        int position = 3;
        
//        int[] array = new int [n];
        
        System.out.print("Before Delete: ");
    	for (i = 0; i < n; i++)
    		System.out.print(arr[i] + " ");
    	
    	
    	System.out.println("");
        n = Delete.delete(arr, position, n);
        
        System.out.print("After Delete: ");
    	for (i = 0; i < n; i++)
    		System.out.print(arr[i] + " ");
    	
//        System.out.print("Before Insertion: ");
//        	for (i = 0; i < n; i++)
//        		System.out.print(arr[i] + " ");
//        System.out.println();
//        Insertion.insertatAnyPosition(arr, position, n, key);
//        n++;
//        System.out.print("After Insertion: ");
//        for (i = 0; i < n; i++)
//    		System.out.print(arr[i] + " ");
        	
        	
//        System.out.print("Before Insertion: ");
//        for (i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//
//        // Inserting key
//        n = Insertion.insertInEnd(arr,key, n, capacity);
//
//        System.out.print("\n After Insertion: ");
//        for (i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//		
//        
        
        
//		Search search = new Search();
//		boolean element = Search.findelement(arr,9);
//		
//		if(element) {
//			System.out.print("Find the element");
//		}else {
//			System.out.print("Not Find element");
//		}
		
		
	}

}
