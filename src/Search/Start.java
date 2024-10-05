package Search;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		int low =0,high=9;
//		int m = low + (high-low) / 2;
//		System.out.print(m);
//		System.out.println();
		
		BinarySearch bn = new BinarySearch();
		int[] arr = {2,4,5,10,11,14,20,24,40,41};
		
		int value = 4;
		int low =0;
		int high = arr.length-1;
		
		
		int result = bn.recursiveBinarySearch(arr, low, high, value);
		
		if(result==-1) {
			System.out.print("Value Not found!");
		}else {
			System.out.print("Value Found at position: "+ (result+1));
		}
		
		
		
	}

}
