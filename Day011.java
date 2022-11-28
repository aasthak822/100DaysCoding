/* Check if the number is prime or not
SOLUTION */

import java.util.*;
public class PrimeNumberCheck {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n==2) {
			System.out.println(n+" is Prime number");
		}
		else {
		boolean isPrime=true;
		for(int i=2;i<Math.sqrt(n);i++) {
		if(n%i==0) {
			isPrime=false;
		}
		  }
		if(isPrime==false) {
			System.out.println(n+ " Not is Prime number");
		}
		else {
			System.out.println(n+ " is Prime Number");
		}
		sc.close();

	}

}
}


