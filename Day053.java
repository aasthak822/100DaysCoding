/* find number of ways to reach from (0,0) to (n-1 ,m-1) in a N*M Grid.
Allowed moves right or down.

SOLUTION */




public class GridWay {
	
	static int numberOfPaths(int m, int n)
    {
      
        if (m == 1 || n == 1)
            return 1;
 
        return numberOfPaths(m - 1, n)
            + numberOfPaths(m, n - 1);
        
    }
 
    public static void main(String args[])
    {
        System.out.println(numberOfPaths(3, 3));
    }
}
 