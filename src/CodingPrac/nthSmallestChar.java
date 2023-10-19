package CodingPrac;

import java.util.Arrays;

public class nthSmallestChar {
    /*
         Given a string str which consists of only lowercase letters and an array arr[][] that represents range queries on the
         given string str where each query contains 3 integers, {L, R, N} such that for each query we have to output the
         Nth smallest character in the given range [L, R] as specified in the query.
 Examples:

 Input: str = “afbccdeb”, arr[][] = {{2, 4, 1}, {1, 6, 4}, {1, 8, 7}}
 Output: b c e
 Explanation:
 1st smallest character in range [2, 4] or in the sub-string “fbc” is ‘b’
 4th smallest character in range [1, 6] or in the sub-string “afbccd” is ‘c’
 7th smallest character in range [1, 8] or in the whole string is ‘e’

 Input: str = “geeksforgeeks”, arr[][] = {{1, 4, 2}, {3, 7, 3}, {4, 13, 4}}
 Output: e k g
 Explanation:
 2nd smallest character in range [1, 4] or in the sub-string “geek” is ‘e’
 3rd smallest character in range [3, 7] or in the sub-string “eksfo” is ‘k’
 4th smallest character in range [4, 13] or in the sub-string “sforgeeks”is ‘g’
          */

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int arr[][] = {{1, 4, 2}, {3, 7, 3}, {4, 13, 4}};
        String output1 ="";

        for(int i =0; i<arr.length;i++)
        {
            int fInd = arr[i][0];
            int lInd = arr[i][1];
            int n = arr[i][2];
            String subStr[] = str.substring(fInd-1,lInd).split("");
            Arrays.sort(subStr);
            for(int j=0;j<subStr.length;j++)
            {
                System.out.print(subStr[j]);
            }

            System.out.println();
            System.out.println(subStr[n-1]);
        }


    }
}
