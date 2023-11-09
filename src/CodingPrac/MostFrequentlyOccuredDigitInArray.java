package CodingPrac;

import java.util.*;

public class MostFrequentlyOccuredDigitInArray {
    public static void main(String args[])
    {

//        int input1[] = {7, 6, 8, 16, 12, 3};
//        int input2 =6;

        int input1[] = {8985, 6079, 676, 704, 446, 862};
        int input2 =6;

        Map<String,Integer> m = new HashMap<>();
        for(int i=0;i<input1.length;i++)
        {
            String s = String.valueOf(input1[i]);
            for(int j=0;j<s.length();j++) {
                int count = 0;
                if (m.containsKey(s.substring(j,j+1)))
                    count = m.get(s.substring(j,j+1));
                count++;
                m.put(s.substring(j,j+1), count);
            }
        }

        System.out.println(m);
        Set<Map.Entry<String,Integer>> s =m.entrySet();
        String str ="";
        int max = Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> s1:s)
        {
            if(s1.getValue()>max) {
                max = s1.getValue();
                str = s1.getKey();
            }

        }


        System.out.println(str);
    }
}
