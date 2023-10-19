package CoreJava;

public class MultDimenArr {
    public static void main(String args[])
    {
        int inp[][] = new int[3][3];
        inp[0][0]=38;
        inp[0][2]=32;
        inp[0][1]=31;
        inp[1][0]=13;
        inp[1][1]=9;
        inp[1][2]=311;
        inp[2][2]=311;
        inp[2][1]=341;
        inp[2][0]=21;

        int small = (int) Double.MAX_VALUE;
        int smallInd =0;
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(inp[i][j]+"   ");
                if (small> inp[i][j]) {
                    small = inp[i][j];
                    smallInd = i;
                }
            }
            System.out.println();
        }

        int large = (int) Double.NEGATIVE_INFINITY;
        for (int j=0;j<3;j++)
        {

            if (large< inp[smallInd][j]) {
                large = inp[smallInd][j];
            }
        }
        System.out.println("smallest:"+small);
        System.out.println("Largest:"+large);

    }
}
