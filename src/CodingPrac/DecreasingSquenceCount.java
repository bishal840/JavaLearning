package CodingPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecreasingSquenceCount {
    public static void main(String args[])
    {
//        int input1[]={11,3,1,4,7,8,12,2,9,7,2};
        int input1[]={12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5};
        int input2 = 20;
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        boolean seq=false;
        for(int i=0;i<input2-1;i++)
        {


            if(input1[i]>input1[i+1])
            {
                li.add(input1[i]);
                if(i==input2-2) {
                    li.add(input1[i + 1]);
                    seq=false;
                    l.add(new ArrayList<>(li));
                    System.out.println(li);
                    li.clear();
                }
                seq=true;
            }
            else {
                if(seq)
                {
                    li.add(input1[i]);
                    seq=false;
                    l.add(new ArrayList<>(li));
                    System.out.println(li);
                    li.clear();
                }else {
                    seq=false;
                }
            }

        }
        System.out.println(l);
        System.out.println(l.size());
        int max =0;
        for(int i=0;i< l.size();i++)
        {
            if(l.get(i).size()>max)
                max=l.get(i).size();
        }
        System.out.println(max);

    }
}
