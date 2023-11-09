package CodingPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartingIndiesOfSubstrings_Success {
    /*
    Find the starting indices of the substrings in string (S) which is made by concatenating all words from a list(L)

You are given a string S, and a list of words L i.e array/vector of strings (Words in list L are all of the same length).
Find the starting indices of the substrings in string S, which contains all the words present in list L.
The order of words of list L appearing inside string S does not matter i.e if string S is “barfooapplefoobar”
and list of words (L) is [“foo”, “bar”] then we have to look for substrings “foobar”, “barfoo” in string S.
Note : Words inside the list L can repeat.

Examples :

Input : S: "barfoothefoobarman"
        L: ["foo", "bar"]
Output : 0 9
Explanation :
// at index 0 : barfoo
// at index 9 : foobar

Input : S: "catbatatecatatebat"
        L: ["cat", "ate", "bat"]
Output : 0 3 9
Explanation :
// at index 0 : catbatate
// at index 3 : batatecat
// at index 9 : catatebat

Input : S : "abcdababcd"
        L : ["ab", "ab", "cd"]
Output : 0 2 4
Explanation :
// at index 0 : abcdab
// at index 2 : cdabab
// at index 4 : ababcd

Input : S : "abcdababcd"
        L : ["ab", "ab"]
Output : 4
     */

    public static void main(String agrs[])
    {
//       String S= "catbatatecatatebat";
//        String str[]={"cat", "ate", "bat"};

        String S= "barfoothefoobarman";
       String str[]={"foo", "bar"};
       List<String>  wordsList =new ArrayList<>();
       AllPermutations.permutations(str,0,wordsList);

       for(String word:wordsList)
       {
           if(S.indexOf(word)>=0)
               System.out.println(S.indexOf(word));
       }
    }
}
