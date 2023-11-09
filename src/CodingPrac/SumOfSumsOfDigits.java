package CodingPrac;

public class SumOfSumsOfDigits {
    public static void main(String srgs[])
    {
//        int input = 501301;
        int input = 898546862;


        int sum =0;
        String inpArr[]= String.valueOf(input).split("");
        for(int j=0;j<inpArr.length;j++)
        {
            for (int i=inpArr.length-1;i>=j;i-- )
            {
                sum = sum + Integer.parseInt(inpArr[i]);
                System.out.println(inpArr[i]);
            }
            System.out.println("____________");
        }
        System.out.println(sum);
    }
}
