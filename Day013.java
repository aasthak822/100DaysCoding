/* TOPIC : FUNCTIONS/METHODS
Find the product of two numbers using function
SOLUTION*/
public class Product {
	public static int  multiple(int a,int b) {
		
		int Product=a*b;
		return Product;
	}
	public static void main(String args[]) {
		
		int a=multiple(3,4);
		int b=multiple(3,5);
		System.out.println("the product of a* b is : "+a);
		System.out.println("the product of a* b is : "+b);
		
	}

}
