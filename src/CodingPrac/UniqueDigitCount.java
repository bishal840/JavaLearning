package CodingPrac;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueDigitCount {
    public static void main(String args[])
    {
        int input = 24252;
        String inpStr = String.valueOf(input);
        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<inpStr.length();i++)
        {
            String s = inpStr.substring(i,i+1);
            int count =0;
            if(map.containsKey(s))
                count=map.get(s);
            count++;
            map.put(s,count);
        }

        int countUnique=map.size();
        int countNonRepeatedDigit =0;

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> set: entrySet)
        {
            if(set.getValue()==1)
                countNonRepeatedDigit++;
        }

        System.out.println("Number of Unique Digits:"+countUnique+"\n"+"Number of Non repeated digits:"+countNonRepeatedDigit);




    }
}
