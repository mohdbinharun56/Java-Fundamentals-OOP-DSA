package SortedArray;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = arr.length;
        int n = 6;
        int key = 26;
        int low =0;
        int high = n-1;
        
//        for(int i:arr) {
//        	System.out.print(i+" ");
//        }
        System.out.print("Before Insertion: ");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        
        n = Insertion.insertSortInArray(arr, low, high, n, capacity, key);
        
//        for(int i:arr) {
//        	System.out.print(i+" ");
//        }
        System.out.print("After Insertion: ");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        n = Delete.deleteSortedArray(arr, 16, n);
        
        System.out.print("After Delete: ");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
