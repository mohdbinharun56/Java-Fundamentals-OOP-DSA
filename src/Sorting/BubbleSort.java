package Sorting;

public class BubbleSort {
	static void bubbleSort(int arr[],int n) {
		int i,j,temp;
		boolean swapped;
		for( i=0; i<n; i++) {
			swapped =false;
			for(j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
//					return swapped;
				}
			}
			if(swapped==false) {
				break;
			}
//			return swapped;
		}
//		return swapped;
	}
	
	
	static void bubbleSortDecrease(int arr[],int n) {
		int i,j,temp;
		boolean swapped;
		
		for( i=0;i<n;i++) {
			swapped = false;
			for(j=0;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(swapped==false) {
				break;
			}
		}
	}
}
