package CoreJava;

public class Patt {
    public static void main(String args[])
    {
        int n =20;
        int k=1;
        for(int i =1; i<=(n-1)/2; i++)
        {
            for(int j=1; j<=((n-i*2)/2); j++  )
            {
                System.out.print(k+"   ");
                k++;

            }

            System.out.println("");
        }
    }
}

/*


1 2 3 4 5 6 7
5 6 7 8 9 10
11 12 13 14
15 16 17
18 19
20
 */