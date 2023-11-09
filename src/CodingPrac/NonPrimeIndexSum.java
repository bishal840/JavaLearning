package CodingPrac;

public class NonPrimeIndexSum {
    public static void main(String args[])
    {
        int input1[] = {9,2,4,7,8,9,8,5,6,3,9,2,4,7,8,9,8,5,6,3};
        int inp2 = 20;
        int sum = 0;
        for(int i =0; i<inp2;i++)
        {
            if(i<2 || isNonPrime(i))
            {
                sum = sum+ input1[i];
            }
        }
        System.out.println(sum);
    }

    private static boolean isNonPrime(int i) {
        if(i==2)
            return false;
        else {
            for (int j = 2; j < i; j++)
            {
                if(i%j==0)
                    return true;
            }
            return false;
        }
    }
}
