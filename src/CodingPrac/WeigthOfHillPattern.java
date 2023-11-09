package CodingPrac;

public class WeigthOfHillPattern {
    public static void main(String args[])
    {
        int input1=5;
        int input2=10;
        int input3=2;

        int sum =0;
        for(int i=0;i<input1;i++)
        {
            if(i!=0)
                input2=input2+input3;
            for(int j=0;j<=i;j++)
            {
                sum = sum+input2;
            }
        }

        System.out.println(sum);
    }
}
