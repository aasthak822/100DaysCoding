/* Generate all the binary strings of N bits
Given a positive integer number N. The task is
 to generate all the binary strings of N bits.
 These binary strings should be in ascending order.

SOLUTION */

import java.util.*;

public class BinaryString {
	
	static void printTheArray(int arr[], int n)
	{
	    for (int i = 0; i < n; i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	}
	 
	// Function to generate all binary strings
	static void generateAllBinaryStrings(int n,
	                            int arr[], int i)
	{
	    if (i == n)
	    {
	        printTheArray(arr, n);
	        return;
	    }
	
	    arr[i] = 0;
	    generateAllBinaryStrings(n, arr, i + 1);
	
	    
	    arr[i] = 1;
	    generateAllBinaryStrings(n, arr, i + 1);
	}
	 
	// Driver Code
	public static void main(String args[])
	{
	    int n = 4;
	 
	    int[] arr = new int[n];
	 
	    // Print all binary strings
	    generateAllBinaryStrings(n, arr, 0);
	}
	}
