package CodingPrac;

import java.util.ArrayList;

public class NambiarNumber {

    public static void main(String args[])
    {
//        long input = 9860857152l;
        long input = 9880127431l;
        String inp = String.valueOf(input);

        String out ="";
        int sum=0;
        ArrayList<String> sumArr = new ArrayList<>();
        int state= 0;
        int count =0;

        for(int i=0;i<inp.length();i++)
        {
            int i1 = Integer.parseInt(inp.substring(i, i + 1));
            if(count ==0)
            {
                state = i1 %2;
            }
            sum =sum + i1;
            if(sum%2 !=state)
            {
                state=sum%2;
                sumArr.add(String.valueOf(sum));
                sum =0;
                count =0;
            }else{
                count++;
                if(i==inp.length()-1)
                {
                    sumArr.add(String.valueOf(sum));

                }
            }
        }
        for(String s : sumArr)
        {
            out = out+s;
        }
        System.out.println(out);
    }

}
