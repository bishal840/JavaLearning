package CodingPrac;

public class FirstRepeated {
    /*
    Find repeated character present first in a string

    Given a string, find the repeated character present first in the string.
    (Not the first repeated character, found here.)

    Examples:

    Input  : geeksforgeeks
    Output : g
      (mind that it will be g, not e.)
*/
    public static void main(String args[])
    {
//        String input = "geeksforgeeks";
        String input = "ekesyy";

        int i =1;
        for(String str : input.split(""))
        {
            if(input.substring(i,input.length()).contains(str))
            {
                System.out.println(str);
                break;
            }
            i++;
        }
    }
}
