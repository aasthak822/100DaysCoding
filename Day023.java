/* Calculate and print Max SubArray 
SOLUTION */

public class maxsub {

public static void subprint(int number[]) {
		
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		
		for(int i=0;i<number.length;i++) {//start
			
			for (int j=i;j<number.length;j++) {//end
				currsum=0;
				for(int k=i;k<=j;k++) {//print
					
					currsum+=number[k];
				}
				System.out.println(currsum);
				if(maxsum<currsum) {
					maxsum=currsum;
					}
			}	
	}		
			System.out.println("Max sum is  "+maxsum);		
	}
	public static void main(String args[]) {
		int numbers[]= {2,4,6,8,10};
		subprint( numbers);
	}
}


