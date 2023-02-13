/* Sum of minimum absolute difference of each array element
SOLUTION */

import java.util.*;
import java.io.*;
public class Solution {
     
    // function to find the sum of
    // minimum absolute difference
    static int sumOfMinAbsDifferences(
                        int arr[] ,int n)
    {
        int sum=0;
      for(int i=0;i<n;i++){
        int diff=Integer.MAX_VALUE;
       for(int j=0;j<n;j++){
        if(i!=j){
          diff=Math.min(diff,Math.abs(arr[i]-arr[j]));
        }
       }
        sum+=diff;
         
      }
        // required sum
        return sum;
    }   
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = {5, 10, 1, 4, 8, 7};
        int n = arr.length;
         
        System.out.println( "Sum = "
        + sumOfMinAbsDifferences(arr, n));
    }
}