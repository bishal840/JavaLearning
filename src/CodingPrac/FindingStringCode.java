package CodingPrac;

public class FindingStringCode {
    public static void main(String args[])
    {
//        String input = "Hello World";
        String input = "World Wide Web";
        input = input.toLowerCase();
        int sum1 = 0;
        String sum ="";
        int diff =0;
        String inpArr[] = input.split(" ");
        for(String s : inpArr)
        {
            sum1=0;

            for(int i=0;i<s.length()/2;i++)
            {
                diff = s.charAt(i)-s.charAt(s.length()-1-i);
                System.out.println("diff:"+diff);
                sum1 = sum1+ Math.abs(diff);

            }
            if(s.length()%2==1)
            {
                sum1 = sum1+ s.charAt(s.length()/2)-96;
            }

            System.out.println("sum1:"+sum1);
            sum = sum + sum1;
        }

        System.out.println(sum);

    }
}
