package CodingPrac;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    public static void main(String args[])
    {
        String s[] ={"cat","ate","bat"};
        List<String>  wordsList =new ArrayList<>();

        permutations(s,0,wordsList);
        System.out.println(wordsList);
    }

    public static void permutations(String[] arr, int fi, List<String> wordsList) {

        if(fi==arr.length-1)
        {
            String s ="";
            for(int i =0;i< arr.length;i++) {
                s=s+arr[i];
            }
            wordsList.add(s);
            return;
        }
        for(int i=fi;i<arr.length;i++)
        {
            swap(arr,i,fi);
            permutations(arr,fi+1,wordsList);
            swap(arr,i,fi);

        }
    }

    private static void swap(String[] arr, int i, int fi) {
        String t = arr[i];
        arr[i]=arr[fi];
        arr[fi]=t;

    }

}
