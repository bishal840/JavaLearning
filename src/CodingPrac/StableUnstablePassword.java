package CodingPrac;

import java.util.*;

public class StableUnstablePassword {
    public static void main(String args[]) {

//        String str = "3636, 101, 1414, 456, 788";
        String str = "566, 786, 8985, 9247, 6607";
        String arr[] = str.split(", ");

        int sumStable=0;
        int sumUnstable=0;
        for(String num : arr)
        {
            Map<String, Integer> map1 = new HashMap<>();

            List<String> numArr= Arrays.asList(num.split(""));
            List<String> arrName= new ArrayList<String>();

            for(String val: numArr)
            {
                int count=0;
                if(map1.containsKey(val))
                {
                    count = map1.get(val);
                }else{
                    arrName.add(val);
                }
                count++;
                map1.put(val,count);
            }
            System.out.println(map1);
//            List<String> valuess =  map1.values();
            int v1 = map1.get(arrName.get(0));
            boolean stable = true;
            for(int i =0 ;i< arrName.size();i++)
            {
                if(!map1.get(arrName.get(i)).equals(v1))
                {
                    sumUnstable = sumUnstable + Integer.parseInt(num);
                    stable = false;
                    break;
                }
            }
            if(stable)
                sumStable = sumStable + Integer.parseInt(num);

        }

        System.out.println("sumStable:"+ (sumStable));
        System.out.println("sumUnstable:"+ (sumUnstable));
        System.out.println("Password:"+ Math.abs(sumStable-sumUnstable));


    }
}