package Collectionss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PracticePrograms {

    public static void main(String args[])
    {
        //Print all the duplicate character and their count in the given string
            //INPUT : String str=""hcl-tech"" ---OUTPUT :h-2,c-2”
        String str="hcl-tech";
        Map map1= new HashMap<String, Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(map1.containsKey(str.charAt(i))){
                int count= (int) map1.get(str.charAt(i));
                count++;
                map1.put(str.charAt(i),count);
            }else{
                map1.put(str.charAt(i),1);
            }

        }

        Iterator itr = map1.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry e1= (Map.Entry) itr.next();
            if((int)e1.getValue()>1)
            {
                System.out.println(e1.getKey()+" : "+e1.getValue());
            }
        }


        //Move all zeroes to end of array- Given an array of integers, Move the all zero's to end of the array.
            //INPUT: myArray={2,5,0,4,2,7,0,0,1,9,4} ---OUTPUT: myArray={2,5,4,2,7,1,9,4,0,0,0}"
        int arr[] = {2,5,0,4,2,7,0,0,1,9,4};
        int arr2[]= new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr2[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr2[i]);
        }


//        Reverse a string preserving space positions.
//        INPUT : "Java is a programming language" ---OUTPUT : "egau gn a lgnimmargor pasiavaJ"

        str="Java is a programming language";
        String strArr[] = str.split(" ");
        int spaceArr[] = new int[strArr.length];
        String strNoSc="";
        for(int i =0;i<strArr.length;i++)
        {
            spaceArr[i]=strArr[i].length();
            strNoSc=strNoSc+strArr[i];
            System.out.println(spaceArr[i]);
        }
        System.out.println(strNoSc);

        StringBuffer strRev = new StringBuffer(strNoSc).reverse();
        System.out.println(strRev);

        int sumSpace=0;
        for(int i=0;i<spaceArr.length-1;i++)
        {
            if(i>0)
                sumSpace= sumSpace+1;

            sumSpace=sumSpace+spaceArr[i];
            System.out.println(spaceArr[i]);

            strRev=strRev.insert(sumSpace," ");
        }

        System.out.println(strRev);

    }
}
