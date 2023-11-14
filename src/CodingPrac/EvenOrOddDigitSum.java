package CodingPrac;

public class EvenOrOddDigitSum {
    public static void main(String args[])
    {
        int input = 24729;
        String input2 ="odd";

        String inpStr = String.valueOf(input);
        int sum =0;

        for(int i =0;i<inpStr.length();i++)
        {
            int in = Integer.parseInt(inpStr.substring(i,i+1));
            if(in%2==0)
            {
                if(input2.equals("even"))
                    sum = sum+in;
            }else{
                if(input2.equals("odd"))
                    sum = sum+in;
            }
        }
        System.out.println(sum);
    }
}
