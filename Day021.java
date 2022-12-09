/*question : Make possible number of pairs in an array and print the pairs and number of pairs.
SOLUTION */

public class arraypairs {
	
        public static void pairs(int number[]) {
        	int tp=0;
        	for(int i=0;i<number.length;i++) {
        		
        		int pair=number[i];
        		for(int j=i+1;j<number.length;j++) {
        			System.out.println("("+pair+","+number[j]+")");
        			tp++;
        		}
        		System.out.println();
        		
        	}
        	System.out.println("total pair is"+tp);
        	
        }
	
	public static void main(String args[]) {
		
		int number[]= {2,4,6,8,10};
		
		pairs(number);
		
		
		
	}

}
