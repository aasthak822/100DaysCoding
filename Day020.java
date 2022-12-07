/*TOPIC :Array
Question:
Reverse athe given array.*/



    public class arrayreverse {
    	
    	public static void reverseArray(int number[]) {
    		int start=0;
    		int end = number.length-1;
    		
    		while(start<=end) {
    			
    		
    		int temp=number[start];
    		number[start]=number[end];
    		number[end]=temp;
    		
    		start++;
    		end--;
    		
    		}
    	}
    	
	public static void main(String args[] ) {
		
		int number[]= {2,4,6,8,10,12};
		
		reverseArray(number);
		
		for(int i=0;i<number.length;i++) {
			
		
		System.out.print("  "+number[i]);
 }
	}
	
}

