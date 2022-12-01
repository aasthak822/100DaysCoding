/*Calculate the factorial of the given number
SOLUTION*/
public class Factorial {
	
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;	
		}
		return f;
	}

	public static void main(String args[]) {
	
	int n=4;
		System.out.println("The factorial of the number "+n+" is " +factorial(n));
		
	}

}
