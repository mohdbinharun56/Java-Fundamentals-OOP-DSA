package UnsortedArray;

public class Insertion {
	static int insertInEnd(int arr[],int value,int n,int capacity) {
				if(n>=capacity) {
					return n;
				}
				arr[n] = value;
				return n+1;
	}
	
	static void insertatAnyPosition(int arr[],int position,int n,int key) {
		for(int i = n-1;i>=position;i--) {
			arr[i+1] = arr[i];
		}
		arr[position] = key;
	}
}
//Time Complexity O(1)
//Auxilary space O(1)