/*Perform Binary Search
SOLUTION*/ 

public class BinarySearch {
	
	public static int binarysearch(int num[],int key) {
		
		int start=0,end=num.length-1;
		
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(num[mid]>key) {//left
				start=mid-1;
			}
			else {
				start=mid+1;
			}
			if(num[mid]==key) {
				return num[mid];
				
			}
		}
		return -1;			
	}	
	public static void main(String args[] ) {
		
		int number[]= {1,2,3,4,5,7};
		int key =30;
		int index=binarysearch(number, key);
		
		if(index==-1) {
			System.out.println("Key not Found "+ index);
		}
		else {
              System.out.println("Key Found  "+ index);
		}	
	}
}
