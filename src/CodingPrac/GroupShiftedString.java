package CodingPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupShiftedString {

    /*
    Given an array of strings (all lowercase letters),
    the task is to group them in such a way that all strings in a group are shifted versions of each other.
    Two string S and T are called shifted if,
        S.length = T.length
        and S[i] = T[i] + K for 1 <= i <= S.length  for a constant integer K


For example strings, {acd, dfg, wyz, yab, mop} are shifted versions of each other.

Input  : str[] = {"acd", "dfg", "wyz", "yab", "mop",
                 "bdfh", "a", "x", "moqs"};

Output : a x
         acd dfg wyz yab mop
         bdfh moqs
All shifted strings are grouped together.
     */
    public static void main(String args[])
    {
        String str[] = {"acd", "dfg", "wyz", "yab", "mop", "bdfh", "a", "x", "moqs"};

        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String s : str)
        {
            String diff ="";

            if(s.length()==1) {
//                if(map.containsKey("s"))
//                {
//                    ArrayList arr =  map.get("s");
//                    arr.add(s);
//
//                    map.put("s", arr);
//
//                }else {
//
//                    ArrayList arr = new ArrayList<>();
//                    arr.add(s);
//
//                    map.put("s", arr);
//                }
                diff="s";


            }else {

                for(int i=0;i<s.length()-1;i++)
                {
                    int d = s.charAt(i)-s.charAt(i+1);

                    if(d>0)
                        d= d-26;
                    diff = diff+d;

                }

            }

            if(map.containsKey(diff))
            {
                ArrayList arr =  map.get(diff);
                arr.add(s);

                map.put(diff, arr);

            }else {

                ArrayList arr = new ArrayList<>();
                arr.add(s);

                map.put(diff, arr);

            }
        }

        System.out.println(map);
    }
}
