package CodingPrac;

public class RemoveForPall {
    public static void main(String args[])
    {
        String inp1 = "101015";
        String inpRev =new StringBuffer(inp1).reverse().toString();


        if(inp1.equals(inpRev)) {
            System.out.println("-1");
        }else {
            for (int i = 0; i < inp1.length(); i++) {
                String s = inp1.substring(i, i + 1);
                String str = inp1.replaceFirst(s, "");
                String strRev = new StringBuffer(str).reverse().toString();

                if (strRev.equals(str)) {


                    System.out.println(s);
                    break;
                }
            }
        }
    }
}
