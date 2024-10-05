package SortedArray;

public class Delete {
	static int deleteSortedArray(int arr[],int key,int n) {
		int position = Search.recursiveBinarySearch(arr, 0, n-1, key);
		int i;
		for(i=position;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		return (n-1);
		
		
	}
}
