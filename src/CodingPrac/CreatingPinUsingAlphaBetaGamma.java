package CodingPrac;

public class CreatingPinUsingAlphaBetaGamma {
    public static void main(String args[])
    {
//        int input1 = 324;
//        int input2 = 897;
//        int input3 = 623;
        int input1 = 607;
        int input2 = 924;
        int input3 = 862;

        int minO=10;
        int minT=10;
        int minH=10;
        int max=0;
        String output="";
        for(int j=0;j<3;j++) {
            String input = "";
            if(j==0)
                input= String.valueOf(input1);
            if(j==1)
                input= String.valueOf(input2);
            if(j==2)
                input= String.valueOf(input3);
            for (int i = 0; i < input.length(); i++) {
                int s = Integer.parseInt(input.substring(i, i + 1));
                if (i == 2) {
                    if (s < minO)
                        minO = s;
                }
                if (i == 1) {
                    if (s < minT)
                        minT = s;
                }
                if (i == 0) {
                    if (s < minH)
                        minH = s;
                }
                if (s > max)
                    max = s;
            }
        }
        System.out.println(max+""+minH+""+minT+""+minO);
    }
}
