/* print SubArray
SOLUTION */

public class Subarray {
	
	public static void subprint(int number[]) {
		
		int ts=0;
		for(int i=0;i<number.length;i++) {//start
			
			for (int j=i;j<number.length;j++) {//end
				
				for(int k=i;k<=j;k++) {
					System.out.print(number[k]+"  ");//print
				}
				ts++;
				System.out.println();
			}
			System.out.println();
			
		}
		System.out.println(ts);
				
	}
	
	public static void main(String args[]) {
		int numbers[]= {2,4,6,8,10};
		subprint( numbers);
	}

}
