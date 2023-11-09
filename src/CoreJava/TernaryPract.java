package CoreJava;

public class TernaryPract {
    public static void main(String args[])
    {
        int a =100;
        int b =10;
        int c =300;


        int large =0;
        large= a>b?(a>c?a:c):(b>c?b:c);

        System.out.println(large);
    }
}
