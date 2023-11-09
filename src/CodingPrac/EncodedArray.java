package CodingPrac;

public class EncodedArray {
    public static void main(String args[])
    {
//        e= 7,9,7,2
//        o = 3,4,5,2

//        int input1[] = {7, 6, 8, 16, 12, 3};
//        int input2 =6;

        int input1[] = {-2, -7, -12, -15, 12, 3};
        int input2 =4;
        int arr[]= new int[input2];
        arr[input2-1]=input1[input2-1];
        for(int i =input2-2;i>=0;i--)
        {
            arr[i]=input1[i]-arr[i+1];
        }
        int sum=0;
        for(int i=0;i<input2;i++)
        {
            System.out.println(arr[i]);
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
