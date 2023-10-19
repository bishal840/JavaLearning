package CodingPrac;

public class AlternateAddSub {

    public static void main(String args[]) {
        int n = 9;
        int opt1 = 2;

        int sum=n;
        int count=1;
        for(int i=n-1; i>=1;i--)
        {
            if(count%2==0)
            {
                if (opt1==1)
                    sum = sum +i;
                else
                    sum = sum -i;

            }else {
                if (opt1==1)
                    sum = sum-i;
                else
                    sum = sum+i;
            }
//                System.out.println("SUM1:"+sum);

            count++;
        }

        System.out.println("SUM:"+sum);
    }


}
