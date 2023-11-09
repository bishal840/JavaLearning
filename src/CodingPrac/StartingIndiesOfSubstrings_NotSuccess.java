package CodingPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartingIndiesOfSubstrings_NotSuccess {
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
       String S= "catbatatecatatebat";
       List<String>  L = Arrays.asList("cat", "ate", "bat");

       List<List<String>> ans = new ArrayList<>();
        ArrayList<String> ds = new ArrayList<>();
       boolean marked[] = new boolean[L.size()];

          recurMethod(L, ds, marked,ans);
//        for(int i=0; i<L.size();i++)
//       {
//           String s = "";
//           s=s+L.get(i);
//           for(int j=i+1;j<L.size()+i;j++) {
//               if(j<L.size())
//                    s = s+ L.get(j);
//               else{
//                   int k = j - L.size();
//                   s = s+ L.get(k);
//
//               }
//           }
//
//           for(int j=L.size()-1;j>i;j++) {
//               if(j<L.size())
//                   s = s+ L.get(j);
//               else{
//                   int k = j - L.size();
//                   s = s+ L.get(k);
//
//               }
//           }
//
           System.out.println(ans);
//       }


    }

    private static void  recurMethod(List<String> l, ArrayList<String> ds, boolean[] marked, List<List<String>>ans) {
//        List<List<String>> ans = new ArrayList<>();
        if(ds.size()==l.size())
        {
            System.out.println(ds);
            ans.add(new ArrayList<>(ds));
//


        }
        for(int i=0;i< l.size();i++)
        {

            if(!marked[i])
            {
                marked[i]=true;
                ds.add(l.get(i));
                recurMethod(l,ds, marked,ans);
                ds.remove(ds.size()-1);
                marked[i]= false;

            }
        }


    }
}
