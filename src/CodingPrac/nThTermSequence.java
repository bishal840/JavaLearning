package CodingPrac;

public class nThTermSequence {
    public static void main(String args[])
    {
        int arr[] = {2,2,3,3,5,5,8,7,13,11,21,13};

        int n =16;

        if(n%2==0)
            System.out.println(seqPrime(n/2));
        else
            System.out.println(seqFib(n/2+1));



    }
    public static int seqFib(int n)
    {
        if(n ==1)
            return 2;
        else if(n ==2)
            return 3;
        else
            return seqFib(n-1)+seqFib(n-2);
    }

    public static int seqPrime(int n)
    {
       int i=1;
       int t =0;
       while(t!=n)
       {
           i++;
           int count =0;
           for(int j=2;j<=i;j++) {
               if (i % j == 0)
                   count++;
           }
           if(count==1)
           {
               t++;
           }

       }

       return i;
    }
}
