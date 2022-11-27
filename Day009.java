/*Calculate the income tax (Income tax Calculator) 
income <5L
0% TAX
income between 5-10L
20% tax
income>10L
30% tax 

SOLUTION*/

import java.util.*;

public class IncomeTax {
	public static void  main(String args[]) {
		int tax;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income");
		int Income=sc.nextInt();
		if(Income<500000) {
			tax=0;
		}
		else if(Income>=500000&&Income<1000000) {
			tax=(int)(Income*(0.2));	
		}
		else {
			tax=(int)(Income*(0.3));
		}
		System.out.println("Your tax is : "+tax);
		
		sc.close();
	}

}