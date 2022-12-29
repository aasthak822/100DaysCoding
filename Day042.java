/* Tiling problem 
Given a “2 x n” board and tiles of size “2 x 1”,
 count the number of ways to tile the given board using the 2 x 1 tiles.
 A tile can either be placed horizontally i.e.,
 as a 1 x 2 tile or vertically i.e., as 2 x 1 tile. 
SOLUTION */



public class TilingProblem {
	
	  static int getNoOfWays(int n)
	  {
	 
	    // Base case
	    if (n <= 2) {
	      return n;
	    }
	    return getNoOfWays(n - 1) + getNoOfWays(n - 2);
	  }
	 
	  // Driver Function
	  public static void main(String[] args)
	  {
	    System.out.println(getNoOfWays(2));
	  
	  }
	}