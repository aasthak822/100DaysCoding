/*Program to print the sum of odd and even numbers.*/

import java.util.*;

public class evenOddSumm {
	 public static void main(String [] args) {
		 
		 int evenSum=0;
		 int oddSum=0;
		 int choice;
		 int n;
		 	 
		 Scanner sc=new Scanner (System.in);
		 
		 
		 
		 do {
			 System.out.println("enter a number");
			 n=sc.nextInt();
			 if(n%2==0) {
				 evenSum+=n;
		 }else {
			 oddSum+=n;
		 }
			 System.out.println("do you want to continue press 1 if not press 0"); 
			
			 choice= sc.nextInt();
		 } while(choice==1);
		 System.out.println("odd sum=" + oddSum);
		 System.out.println("even sum=" + evenSum);
		 
		sc.close();
		
	 }

}
