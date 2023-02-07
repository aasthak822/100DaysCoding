/* Find first non-repeating character of given String 

SOLUTION */


import java.io.*;
 
public class Solution {

    public static void main(String[] args) {

        String string = "geeksforgeeks";
        int index = -1;
        char fnc = ' ';
        for (char i : string.toCharArray()) {

            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fnc = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == 1) {
            System.out.println("Either all characters are repeating or "
                             + "string is empty");
        }
        else {
            System.out.println("First non-repeating character is " + fnc);
        }
    }
}