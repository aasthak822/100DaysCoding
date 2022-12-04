/*TOPIC - ARRAY 
to perform Linear Search
SOLUTION */
public class LinearSearch {
	public static int linearSearch(int number[],int key) {
		for(int i=0;i<=number.length;i++) {
			if(number[i]==key) {
				return number[i];
			}	
		}
		return -1;
	}
public static void main(String args[]) {
		int number[]= {2,4,7,3,8,9,10};
		int key =10;
		int index=linearSearch(number,key);
		if(index==-1) {
			System.out.println("Not Found");
		}
		System.out.println("key found");
	}
	
}

 