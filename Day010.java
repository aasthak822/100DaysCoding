/* Simple Calculator using swtich case
SOLUTION */

import java.util.*;


public class SimpleCalculator {
	public static void main(String  args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter case operator");
		int operator=sc.next().charAt(0);
		int a=8;
		int b=6;
		switch(operator) {
		case '+':
			System.out.println("Addition "+"a+b="+(a+b));
			break;
		case '-':
			System.out.println("Substraction "+"a-b="+(a-b));
			break;
		case '*':
			System.out.println("Multiplication "+"a*b="+(a*b));
			break;
		case '%':
			System.out.println("Division "+"a%b="+(a%b));
			break;
		}
		sc.close();
	}
	

}
