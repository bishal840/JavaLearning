package CodingPrac;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String args[])
    {
        String strArr[]={"A","B","C","D"};

        int l = strArr.length;

       System.out.println("FINAL:"+ recursion(strArr,l,0));
    }

    private static List<List<String>> recursion(String[] strArr, int l, int i) {

        if(i==l-1){
            List<List<String>> pR =new ArrayList<>();
            List<String> p =new ArrayList<>();
            p.add("");
            pR.add(p);
            List<String> p1 =new ArrayList<>();
            p1.add(strArr[i]);
            pR.add(p1);
            System.out.println("pR:"+pR);
            return pR;
        }else {
            List<List<String>> pR1 = recursion(strArr, l, i + 1);
            List<List<String>> pR2 = recursion(strArr, l, i + 1);
            for (List<String> pr : pR2) {
                for (String p : pr) {
                    p = p + strArr[i];
                    List<String> pL = new ArrayList<>();
                    pL.add(p);
                    pR1.add(pL);
                }
            }
            System.out.println("pR1:"+pR1);

            return pR1;

        }
    }
}
