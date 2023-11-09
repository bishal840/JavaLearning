package CodingPrac;

public class CodeThroughStrings {
    public static void main(String args[]){

//    String input = "Hello World";
    String input = "A picture is worth a thousand words";

    String strArr[] = input.split(" ");

    int sum = 0;
    for(String s :strArr)
    {
        sum = sum+s.length();
    }
//    if(sum<10)
    while(sum>=10){
        String s = String.valueOf(sum);
        int sum2 = 0;
        for(int i =0;i<s.length();i++)
        {
            sum2=sum2+Integer.parseInt(s.substring(i,i+1));
        }
        sum = sum2;
    }
        System.out.println(sum);

    }

}
