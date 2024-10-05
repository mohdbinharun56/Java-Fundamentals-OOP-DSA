package UnsortedArray;

public class Delete {
	
	static int delete(int arr[],int position,int n) {
		for(int i=position;i<(n-1);i++) {
			arr[i] = arr[i+1];
		}
		return n-1;
	}

}
