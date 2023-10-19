package Collectionss;

import java.util.*;

public class Map1 {
    public static void main(String args[])
    {
        HashMap m1 = new HashMap<>();

        m1.put(51,"bis");
        m1.put(2,"lka");
        m1.put(3,"opas");
        m1.put(4,"jas");

        System.out.println(m1);


        Iterator itr =  m1.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry e = (Map.Entry)itr.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        TreeMap t1 = new TreeMap<>(m1);
        System.out.println(t1);

        //sort HashMap by value
        Collection values1 = m1.values();
        ArrayList<String> values = new ArrayList<>(values1);
        Collections.sort(values);
        for (String val: values) {
            Iterator itr3 = m1.entrySet().iterator();

            while (itr3.hasNext())
            {
                Map.Entry e = (Map.Entry) itr3.next();
                if(e.getValue().equals(val))
                {
                    System.out.println(e.getKey()+" "+e.getValue());
                    break;
                }
            }
        }
    }
}
