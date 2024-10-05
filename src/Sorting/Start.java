package Sorting;

public class Start {
	public static void main(String[] args) {
		int[] arr = {35,1,24,0,40,23,12};
		int n = arr.length;
		
		System.out.print("Before Sorting: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
//		ascending orser Buuble
//		BubbleSort.bubbleSort(arr, n);
//		System.out.print("After Sorting: ");
//			for(int i:arr) {
//				System.out.print(i+" ");
//			}
		
//		ascending order Buuble
//		BubbleSort.bubbleSortDecrease(arr, n);
//		System.out.print("After Sorting: ");
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
		
		
//		Selecting Sort Ascending order
		
//		SelectionSort.ascSelectionSort(arr, n);
//		System.out.print("After Sorting: ");
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
		
		InsertionSort.ascInsertion(arr, n);
		System.out.print("After Inertion sort: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
}
