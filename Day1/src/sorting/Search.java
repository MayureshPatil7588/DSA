package sorting;

public class Search {
	
	public static int Search(int arr[], int key) {
		int pos = -999;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				//pos = i;
				return i;
				//break;
			}
		}
		return -999;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {2,9,75,6,5,65,213,2125,225,3};
		
		int i =Search(arr, 213);
		
		System.out.println("Position of the element is "+i);
	}
}
	

