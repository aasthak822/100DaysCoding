
/*PROBLEM TO BE SOLVED :
To reverse the given number.

INPUT SAMPLE :
1234

OUTPUT SAMPLE:
4321

TEST CASE 1
If the number has same digits or palindrome number like 1111.


SOLUTION :*/

public class reverseTheNum {
	
	public static void main(String [] args ) {
		int num=637821;
		int rev=0;
		
		while(num>0) {
		int	lastDigit=num%10;
			 rev=(rev*10)+lastDigit;
			num=num/10;
			
		}
		System.out.print("The reverse of the number is : "+rev);
		
	}
	
}
