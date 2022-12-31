/*Friends Pairing Problem
Given n friends, each one can remain single or can be
 paired up with some other friend. Each friend can be paired only once. 
Find out the total number of ways 
in which friends can remain single or can be paired up. 

SOLUTION  */

import java.io.*;

public class FriendsPairing {

	    static int countFriendsPairings(int n)

	    {
	        int dp[] = new int[n + 1];
	 
	        
	        for (int i = 0; i <= n; i++) {
	            if (i <= 2)
	                dp[i] = i;
	            else
	                dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
	        }
	 
	        return dp[n];
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int n = 4;
	        System.out.println(countFriendsPairings(n));
	    }
	}

