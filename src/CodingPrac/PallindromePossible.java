package CodingPrac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PallindromePossible {
    public static void main(String args[])
    {
        int input = 11223;

        String inputStr = String.valueOf(input);

        Map<String, Integer> map1 = new HashMap<>();

        for(int i =0; i<inputStr.length();i++)
        {
            int count =0;

            String str = inputStr.substring(i,i+1);
            if(map1.containsKey(str))
            {
                count = map1.get(str);
            }
            count++;
            map1.put(str,count);
        }

        Set<Map.Entry<String, Integer>> keyVal = map1.entrySet();

        int oddCount=0;
        for(Map.Entry<String, Integer> m : keyVal)
        {
            if(m.getValue()%2!=0)
                oddCount++;
        }

        if(oddCount<=1)
            System.out.println("Pall poss");
        else
            System.out.println("Pall NOT poss");

    }
}
