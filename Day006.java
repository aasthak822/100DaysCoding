/*Demonstration of else if calculating Attendence and grade .*/

import java.util.*;

public class attendence {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter class held");
		double ch =sc.nextInt();
		System.out.println("enter class attended");
		double ca =sc.nextInt();
		double total=(ca/ch)*100;
		System.out.println(total + "%");
		if(total<75) {
			System.out.println("Allowed and grade D");
		}
		else if((total>=75)&&(total<85)) {
			System.out.println("Allowed and grade C");
		}
		else if((total>=85)&&(total<95)) {
			System.out.println("Allowed and grade B");
		}
		else if(total>=95) {
			System.out.println("Allowed and grade A");
		}
		
		else {
			System.out.println("Not allowed");
		}
		sc.close();
	}
}
