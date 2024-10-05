package SortedArray;

public class Search {
	static int recursiveBinarySearch(int arr[],int low,int high,int key) {
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
