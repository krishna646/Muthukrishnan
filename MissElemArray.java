

package week1.day1;

import java.util.Arrays;

public class MissElemArray {

	public static void main(String[] args) {
		
		int[] arr = {2,3,1,6,7,4,8};
		Arrays.sort(arr);
	
		for (int i = 0; i < arr.length-1; i++) {
			if((arr[i+1]-arr[i])!= arr[0]) {
				
				System.out.println("Missing Element in Array is " +(arr[i]+arr[0]));
	break;
			}

}
}


	}


