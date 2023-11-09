package CodingPrac;

import java.util.ArrayList;
import java.util.List;

public class WeightOfString {
    public static void main(String args[])
    {
//        String input1 ="Hello World";
        String input1 ="Actions speak louder than words";
        int input2 =0;
        int sum=0;

//        System.out.println('a'-0);
        String strArr[]=input1.toLowerCase().split(" ");
        for(String s: strArr)
        {
            for(int i =0;i<s.length();i++)
            {
                String str = s.substring(i,i+1);
                if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u"))
                {
                    if(input2==0)
                        continue;
                    else
                        sum = sum+str.charAt(0)-'a'+1;
                }else {
                    sum = sum+str.charAt(0)-'a'+1;

                }
            }
        }
        System.out.println(sum);

    }
}
