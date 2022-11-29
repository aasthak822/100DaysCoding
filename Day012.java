/*Print the number pyramid 
SOLUTION */
public class HalfPyramid {
	public static void main(String args[]) {
      int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);	
			}
			System.out.println();
		}
         for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);	
			}
			System.out.println();
		}


	}
}


