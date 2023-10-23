package CodingPrac;

public class UserIdGeneration {

    public static void main(String args[])
    {
        String inp1 ="Krish";
        String inp2 ="Kumar";
        String inp3 ="501301";
        int inp4 = 6;

        String output="";

        String smaller="";
        String larger="";

        if(inp1.length()==inp2.length())
        {
            if(inp1.compareTo(inp2)<0)
            {
                smaller=inp1;
                larger=inp2;
            }else {
                smaller=inp2;
                larger=inp1;
            }
        }else {
            if(inp1.length()<inp2.length())
            {
                smaller=inp1;
                larger=inp2;
            }else {
                smaller=inp2;
                larger=inp1;
            }
        }

        String output1 = smaller.substring(smaller.length()-1) + larger  + inp3.charAt(inp4-1) + inp3.charAt(6-inp4);

        System.out.println(output1);
//        StringBuffer sb = new StringBuffer(output1);
//        int a ='a';
//        int A = 'A';
//        System.out.println(a);
//        System.out.println(A);
        char charArr[]= output1.toCharArray();
        for(char ch : charArr)
        {
            if(ch>96 && ch<122)
                ch= (char) (ch-32);
            else if(ch>64 && ch<90)
                ch = (char) (ch+32);

            output = output+ ch;
        }
        System.out.println(output);

    }
}
