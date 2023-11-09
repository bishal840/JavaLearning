package CodingPrac;

public class IdentifyPossibleWords {
    public static void main(String args[])
    {
        String input1="Fi_er";
        String input2="Fever:filer:Filter:Fixer:fiber:Fibre:tailor:offer";
//        String input2="Fever:Filter:fibre:tailor:offer";
        String output ="";
        input1 =input1.toUpperCase();
        input2 =input2.toUpperCase();

        String inp2Arr[]=input2.split(":");
        String inp1SW = input1.substring(0,input1.indexOf("_"));
        String inp1EW = input1.substring(input1.indexOf("_")+1,input1.length());
        for(String inp2:inp2Arr)
        {
            if(inp2.length()==input1.length())
            {
                if(inp2.startsWith(inp1SW) && inp2.endsWith(inp1EW))
                {
                    output=output+inp2+":";
                }
            }
        }
        if(output.equals(""))
            System.out.println("ERROR-009");
        else
            System.out.println(output.substring(0,output.length()-1));
    }
}
