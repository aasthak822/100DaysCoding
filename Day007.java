 
/*PROBLEM TO BE SOLVED 
We use the integers a,b and n to create the following series:

(a+2^0.b),(a+2^0.b+2^1.b).....(a+2^0.b+....+2^n-1.b)



You are given q queries in the form of a, b,n and . For each query, print the series corresponding to the given a, b and n values as a single line of n space-separated integers.

Input Format

The first line contains an integer,q , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective ai,bi and ni values for that query.

Constraints
*0<=q<=500
*0<=a,b<=50
*1<=n<=15

*Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

*Sample Input

2
0 2 10
5 3 5

*Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98


SOLUTION:*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
         
            for(int j=0;j<n;j++){
            
               a+=b;
               if(j>0){
                   System.out.print(" ");
               }
               
               System.out.print(a);
               b=b*2;
            }
              System.out.println();
        }
        in.close();
    }
}



/*TEST CASE 1:

Compiler Message
Success
Input (stdin)

Download
2
0 2 10
5 3 5
Expected Output

Download
2 6 14 30 62 126 254 510 1022 204


TEST CASE 2:

Compiler Message
Success
Input (stdin)

Download
50
24 14 15
48 5 9
16 48 6
31 22 1
8 28 12
24 8 10
37 17 14
36 27 10
16 36 8
40 44 5
32 19 14
28 17 11
11 35 9
49 16 11
36 26 2
43 0 5
42 38 14
37 26 3
19 45 12
{-truncated-}

Expected Output


38 66 122 234 458 906 1802 3594 7178 14346 28682 57354 114698 229386 458762
53 63 83 123 203 363 683 1323 2603
64 160 352 736 1504 3040
53
36 92 204 428 876 1772 3564 7148 14316 28652 57324 114668
32 48 80 144 272 528 1040 2064 4112 8208
54 88 156 292 564 1108 2196 4372 8724 17428 34836 69652 139284 278548
63 117 225 441 873 1737 3465 6921 13833 27657
52 124 268 556 1132 2284 4588 9196
84 172 348 700 1404
51 89 165 317 621 1229 2445 4877 9741 19469 38925 77837 155661 311309
45 79 147 283 555 1099 2187 4363 8715 17419 34827
46 116 256 536 1096 2216 4456 8936 17896
65 97 161 289 545 1057 2081 4129 8225 16417 32801
62 114
43 43 43 43 43
80 156 308 612 1220 2436 4868 9732 19460 38916 77828 155652 311300 622596
63 115 219
64 154 334 694 1414 2854 5734 11494 23014 46054 92134 184294
56 126 266 546 1106 2226 4466 8946 17906 35826 71666
{-truncated-}6
8 14 26 50 98*/


