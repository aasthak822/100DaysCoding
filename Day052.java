/* Segragate all the zero's to left and one's to right side 
Input - 10101
Output- 00111

SOLUTION */ 


public class SegregateAllZero {

	public static void main(String args[] ) {
		int n=5;
		int arr[]= {1,0,1,0,1};
		int left=0,right=n-1;
		while(true) {
			if(left>=right)
				break;
			if(arr[left]==0)
				left++;
			else if(arr[right]==1)
				right--;
			else {
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	}
}
