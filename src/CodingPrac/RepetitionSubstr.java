package CodingPrac;

import java.util.*;

public class RepetitionSubstr {
    /*
    Given a string, find if it is possible to convert it to a string that is the repetition of a substring with k characters.
     To convert, we can replace one substring of length k starting at index i (zero-based indexing) such that
     i is divisible by K, with k characters.

Examples:

Input: str = "bdac",  k = 2
Output: True
We can either replace "bd" with "ac" or
"ac" with "bd".

Input: str = "abcbedabcabc",  k = 3
Output: True
Replace "bed" with "abc" so that the
whole string becomes repetition of "abc".

Input: str = "bcacc", k = 3
Output: False
k doesn't divide string length i.e. 5%3 != 0

Input: str = "bcacbcac", k = 2
Output: False

Input: str = "bcacbcac", k = 3
Output: False
     */

    public static void main(String args[]) {
        String input = "abcbedabcabc";
        int k =3;
        if(input.length()%k==0) {
            String arr="";
            Map<String, Integer> map = new HashMap();

            for (int i = 0; i < input.length(); i=i+k) {
                arr = input.substring(i,i+k);
                System.out.println(arr);
                int count=0;
                if(map.containsKey(arr))
                {
                    count = map.get(arr);
                }
                count++;
                map.put(arr,count);
            }
            System.out.println("map.size():"+map.size());

            if(map.size()>2) {
                System.out.println("FALSE");
                Set str1 = map.keySet();
                Iterator itr = str1.iterator();
                while (itr.hasNext())
                {
                    System.out.println(itr.next());
                }
                System.out.println("======");
                System.out.println(map);
            }
            else {
                if(map.containsValue(1)) {
                    System.out.println("TRUE");
                    System.out.println(map);
                }else {
                    System.out.println("FALSE");
                    System.out.println(map);
                }
            }
        }else{
            System.out.println("FALSE");
        }
    }
}
