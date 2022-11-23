 

/*PROBLEM TO BE SOLVED -

* Given an integer, print its first 10 multiples. Each multiple n*i should be printed on a new line in the form: n x i = result.
* Constraints - 2<=n<=20
* Input Format - integer
* Sample Input 2 
* Sample Output 
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

PROBLEM SOLVED :*/


import java.io.*;
import java.util.*;




public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
for (int i =1;i<11;i++){
    int result=i*n;

System.out.println(n +" x "+i+" = "+result);

        bufferedReader.close();
    }
  }
}

/* *TEST CASE 1

Compiler Message
Success
Input (stdin)
7
Expected Output
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70

*TEST CASE 2

Compiler Message
Success
Input (stdin)
19
Expected Output
19 x 1 = 19
19 x 2 = 38
19 x 3 = 57
19 x 4 = 76
19 x 5 = 95
19 x 6 = 114
19 x 7 = 133
19 x 8 = 152
19 x 9 = 171
19 x 10 = 190*/

