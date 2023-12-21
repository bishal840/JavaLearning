package CodingPrac;

public class nThPrime {
    public static void main(String args[])
    {
        int n = 1000;
        int num=1;
        int i=0;
        while(i<n)
        {
            num++;

            int count =0;
            for(int j=2;j<=num;j++)
            {
                if(num%j==0)
                    count ++;
            }
            if(count==1)
                i++;

        }

        System.out.println(num);
    }
}
