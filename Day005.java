/*PROBLEM TO BE SOLVED :
Check for palindrome number

1 SAMPLE INPUT 
   1122211
  OUTPUT EXPECTED 
   Palindrome

2 SAMPLE INPUT 
   1234511
  OUTPUT EXPECTED 
   Not Palindrome
 
SOLUTION :*/

import java.util.Scanner;

public class Palindrome {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int res = num;
		int rev = 0;
		while(num>0) {
			int lastDigit=num%10;
			rev = (rev*10) + lastDigit;
			num = num/10;
		}
		if(rev==res) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		scan.close();
	}
}


/*TEST CASES 1 :
If the input contains symbols or alphabets.
If NULL.
If the number is not palindrome.*/





