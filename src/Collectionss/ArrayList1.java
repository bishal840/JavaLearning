package Collectionss;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String args[])
    {
        ArrayList aarList1 = new ArrayList<>();

        aarList1.add("bis");
        aarList1.add("man");
        aarList1.add("shre");
        aarList1.add("adi");
        aarList1.add("rahul");

        ArrayList aarList2 = (ArrayList) aarList1.clone();
        System.out.println(aarList1);
        System.out.println(aarList2);
        if(aarList2.equals(aarList1))
        {
            System.out.println("true");
        }

        Collections.sort(aarList1);
        System.out.println(aarList1);
        System.out.println(aarList2);
        if(aarList2.equals(aarList1))
        {
            System.out.println("true");
        }

        ArrayList a1 = new ArrayList<>();
        a1.add(10);
        System.out.println(a1.get(0).getClass());
        
    }

}
