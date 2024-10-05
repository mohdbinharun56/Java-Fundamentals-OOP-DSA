package SortedArray;

public class Insertion {
	static int insertSortInArray(int arr[],int low,int high,int n,int capacity,int key) {
		
		if(high<low) {
			return -1;
		}
		int i;
		for( i=n-1;(i>=0 && arr[i]>key);i--) {
			arr[i+1] = arr[i];
		}
		arr[i+1] = key;
		return (n+1);
		
//		return insertSortInArray(arr,low,high,n,capacity,key);
	}
}
