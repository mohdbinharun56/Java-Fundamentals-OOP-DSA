package UnsortedArray;

public class Search {
	static boolean findelement(int arr[], int value) {
		for(int i:arr) {
			if(i==value) {
				return true; 
			}
		}
		return false;
		
	}
}

// Time Complexity O(N)
// Auxilary space O(1)
