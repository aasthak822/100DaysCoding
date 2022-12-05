/*TOPIC :ARRAY
QUESTION :
Maximum and Minimum element in an array:*/



import java.util.*;

public class LargestArray {
	
	public static int getlargest(int numbers[]) {
		int largest=Integer.MIN_VALUE;
		
		for(int i =0;i<numbers.length;i++) {
		if(largest<numbers[i]) {
			largest=numbers[i];
		   }
		}
		return largest;
	}
	public static int getSmallest(int numbers[]) {
          int smallest=Integer.MAX_VALUE;
		
		
		for(int i =0;i<numbers.length;i++) {
		if(smallest>numbers[i]) {
			smallest=numbers[i];
		   }
		}
		return smallest;
	}
	
	public static void main(String args[]) {
		int number[] ={100,2,3,4,5,6,7};
		System.out.println("the largest number is "+getlargest(number));
		System.out.println("the smallest number is "+getSmallest(number));
	}

}
