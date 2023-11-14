package CodingPrac;

public class PallUsingRecursion {
    public static void main(String args[])
    {
        String str ="ethythte";
        System.out.println(str.indexOf("yth"));
        System.out.println(isPall(str));
    }

    private static boolean isPall(String str) {
        int l = str.length();
        if(l==1)
            return true;
        else if (l==2) {
            if(str.substring(0,1).equals(str.substring(1,2)))
                return true;
            else
                return false;
        }
        else {
            if(str.substring(0,1).equals(str.substring(l-1,l)))
                return isPall(str.substring(1,l-1));
            else
                return false;
        }

    }
}
