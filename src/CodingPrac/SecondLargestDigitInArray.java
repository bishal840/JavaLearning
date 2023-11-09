package CodingPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SecondLargestDigitInArray {
    public static void main(String args[])
    {

//        int input1[] = {2654, 834, 9248, 868327};
        int input1[] = {786, 41625, 243510, 183276};

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<input1.length;i++)
        {
            String str = String.valueOf(input1[i]);
            for(int j=0;j<str.length();j++)
            {
                int s= Integer.parseInt(str.substring(j,j+1));
                if(s>max) {
                    max2=max;
                    max = s;
                }
                else if (s>max2 && s!=max) {
                    max2=s;
                }
            }

        }
        System.out.println(max2);

    }
}
