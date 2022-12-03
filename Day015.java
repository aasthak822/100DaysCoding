/*Calculate the Binomial Coefficient:
SOLUTION */



public class BinomialCoefficient {
	
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	
	public static int binoCoeff(int n ,int r) {
		int fact_n=factorial(n);
		int fact_r=factorial(r);
		int fact_nmr=factorial(n-r);
		
		int BioC=fact_n/(fact_r*fact_nmr);
		
		return BioC;
	}
	
	public static void main(String args[]) {

		int print=binoCoeff(5,2);
		System.out.println(print);
		
	}

}
