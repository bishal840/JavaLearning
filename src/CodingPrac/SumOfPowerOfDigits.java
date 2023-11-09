package CodingPrac;

public class SumOfPowerOfDigits {
    public static void main(String args[])
    {
//        int input = 898544686;
        int input = 972467667;
        String str= String.valueOf(input);
        int sum =0;
        for(int i=0;i<str.length();i++ )
        {
            int n1 =Integer.parseInt(str.substring(i,i+1));
            int n2 =0;
            if(i==str.length()-1)
                n2=0;
            else
                n2=Integer.parseInt(str.substring(i+1,i+2));
            int v =(int)Math.pow(n1,n2);
            sum=sum+v;
        }
        System.out.println(sum);
    }
}
