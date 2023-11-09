package CodingPrac;

public class EncodingThreeStrings {

    public static void main(String args[]){
        String input1="John";
        String input2="Johny";
        String input3="Janardhan";

        String first="";
        String second="";
        String third="";

        for(int i =0;i<3;i++)
        {
            String input="";
            if(i==0)
                input=input1;
            if(i==1)
                input=input2;
            if(i==2)
                input=input3;
            int inpL =input.length();

            if(inpL%3==0)
            {
                first=first + input.substring(0,inpL/3);
                second = second+ input.substring(inpL/3,(inpL*2)/3);
                third = third+ input.substring((inpL*2)/3,inpL);

            }else if(inpL%3==1)
            {
                first=first + input.substring(0,inpL/3);
                second = second+ input.substring(inpL/3,((inpL*2)/3)+1);
                third = third+ input.substring(((inpL*2)/3)+1,inpL);

            }else{
                first=first + input.substring(0,(inpL/3)+1);
                second = second+ input.substring((inpL/3)+1,((inpL*2)/3));
                third = third+ input.substring(((inpL*2)/3),inpL);

            }

        }
        String thirdR="";
        for(int i=0;i<third.length();i++)
        {
            if(third.charAt(i)<92)
                thirdR=thirdR+third.substring(i,i+1).toLowerCase();

            if(third.charAt(i)>96)
                thirdR=thirdR+third.substring(i,i+1).toUpperCase();
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(thirdR);
        System.out.println(third);

    }
}
