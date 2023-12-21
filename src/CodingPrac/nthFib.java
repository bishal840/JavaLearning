package CodingPrac;

public class nthFib {
    public static void main(String args[])
    {
        int n =10;

        System.out.println(fib(n));
    }

    public static int fib(int n)
    {
        if(n==1)
            return 0;
        else if (n==2)
            return 1;
        else
            return fib(n-1)+ fib(n-2);
    }
}
