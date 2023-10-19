package CodingPrac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstRepeated2 {
    /*
    Find the first repeated character in a string

Given a string, find the first repeated character in it. We need to find the character that occurs more than once and
whose index of second occurrence is smallest.

Examples:

Input: ch = “geeksforgeeks”
Output: e
e is the first element that repeats

Input: str = “hello geeks”
Output: l
l is the first element that repeats
     */
    public static void main(String args[]) {
//        String input = "geeksforgeeks";
        String input = "hello geeks";
        int smallest= (int) Double.MAX_VALUE;
        String arr[]=input.split("");
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j].equals(arr[i]))
                {
                    if(j<smallest) {
                        smallest = j;
                    }
                }
            }
        }

        System.out.println(smallest);
        System.out.println(arr[smallest]);
    }
}
