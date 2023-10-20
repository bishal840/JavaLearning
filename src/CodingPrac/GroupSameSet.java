package CodingPrac;

import java.util.*;

public class GroupSameSet {
    /*
    Given a list of words with lower cases. Implement a function to find all Words that have the same unique character set.

Example:

Input: words[] = { "may", "student", "students", "dog", "studentssess", "god", "cat", "act",
                 "tab", "bat", "flow", "wolf", "lambs", "amy", "yam", "balms", "looped", "poodle"};
Output :
looped, poodle,
lambs, balms,
flow, wolf,
tab, bat,
may, amy, yam,
student, students, studentssess,
dog, god,
cat, act,

All words with same set of characters are printed
together in a line.
     */
    public static void main(String args[]) {
        String str[] = { "may", "student", "students", "dog", "studentssess", "god", "cat", "act",
                "tab", "bat", "flow", "wolf", "lambs", "amy", "yam", "balms", "looped", "poodle"};

        Map<ArrayList<String>, ArrayList<String>> map = new HashMap<>();
        for(String s : str)
        {
            ArrayList arr = new ArrayList<>();
            for(int i =0;i<s.length();i++)
            {
                String substr = s.substring(i,i+1);
                if(!arr.contains(substr))
                {
                     arr.add(substr);
                }
            }
            Collections.sort(arr);

            ArrayList arrVal = new ArrayList<>();
            if(map.containsKey(arr))
            {
                arrVal = map.get(arr);

            }
            arrVal.add(s);
            map.put(arr,arrVal);
        }
        Collection<ArrayList<String>> vals = map.values();

        for(ArrayList<String> v : vals)
        {
            for(String valstr : v)
                System.out.print(valstr+",");

            System.out.println();

        }
    }
}