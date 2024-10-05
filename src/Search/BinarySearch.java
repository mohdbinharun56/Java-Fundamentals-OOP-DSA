package Search;

public class BinarySearch {
	static int iterationbinarySearch(int arr[],int value) {
		int low =0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = low + (high-low)/2;

			if(arr[mid]==value) {
				return mid;
			}
			if(arr[mid]< value) {
				low = mid +1;
			}
			if(arr[mid]>value) {
				high = mid-1;
			}
			
		}
		return -1;
	}
	
	
	 int recursiveBinarySearch(int arr[],int low,int high,int key) {
		if(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]<key) {
				return recursiveBinarySearch(arr,mid+1,high,key);
			}else {
				return recursiveBinarySearch(arr,low,mid-1,key);
			}
		}
		
		
		return -1;
	}
}
