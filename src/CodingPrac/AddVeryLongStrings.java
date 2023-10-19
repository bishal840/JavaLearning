package CodingPrac;

public class AddVeryLongStrings {
    public  static  void main(String args[]) {
        String inp1 = "87956812343";
        String inp2 = "59489026349";
        String temp="";

        int l1 = inp1.length();
        int l2 = inp2.length();

        if(l1>l2){
            temp = inp2;
            inp2=inp1;
            inp1= temp;
        }
         l1 = inp1.length();
         l2 = inp2.length();

         int carry=0, sum=0;
         String result="";
         inp1 =  new StringBuffer((inp1)).reverse().toString();
         inp2 =  new StringBuffer((inp2)).reverse().toString();

         for( int i =0; i<l1;i++)
         {
             sum = (int) ((inp1.charAt(i)-'0') + (inp2.charAt(i)-'0') + carry);
             result = result + sum%10;
             carry = sum/10;
         }
        for( int i =l1; i<l2;i++)
        {
            sum = (int) ( (inp2.charAt(i)-'0') + carry);
            result = result + sum%10;
            carry = sum/10;
        }

        if(carry!=0)
            result = result+carry;

        result = new StringBuffer(result).reverse().toString();

        System.out.println(result);



    }
}
