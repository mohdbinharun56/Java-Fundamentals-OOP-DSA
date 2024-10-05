package Sorting;

public class SelectionSort {
	static void ascSelectionSort(int arr[],int n) {
		int i,j,temp;
		for( i=0; i < n; i++) {
			
			int min_idx = i;
			
			for(j=i+1;j<n;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
				}
			}
			if(min_idx != i) {
				temp = arr[i];
				arr[i] = arr[min_idx];
				arr[min_idx] = temp;
			}
		}
	}
	
	
	static void descSelectionSort(int arr[],int n) {
		int i,j,temp;
		for( i=0; i < n; i++) {
			
			int min_idx = i;
			
			for(j=i+1;j<n;j++) {
				if(arr[j]>arr[min_idx]) {
					min_idx = j;
				}
			}
			if(min_idx != i) {
				temp = arr[i];
				arr[i] = arr[min_idx];
				arr[min_idx] = temp;
			}
		}
	}
}
