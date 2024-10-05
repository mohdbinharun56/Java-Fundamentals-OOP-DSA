package Sorting;

public class InsertionSort {
	static void ascInsertion(int arr[],int n) {
		int i,j,k;
		for(i=1;i<n;i++) {
			k = arr[i]; // second element
			j = i-1; // previous element of arr[i] element
			while(j>=0 && arr[j]>k) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = k;
		}
	}
}
