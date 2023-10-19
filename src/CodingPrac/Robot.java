package CodingPrac;

public class Robot {

    public static void main(String args[]) {
        int inp1 = 3;
        int inp2 = 3;
        String inp3 = "2-2-E";
        String inp4 = "R M L M L M R M";

        int currX = Integer.parseInt(inp3.split("-")[0]);
        int currY = Integer.parseInt(inp3.split("-")[1]);

        String currD = inp3.split("-")[2];

        String moveArr[] = inp4.split(" ");
        for (String move : moveArr) {

            if(move.equals("M"))
            {
                if(currD.equals("N") && currY<inp2)
                {
                    currY++;
                }else if (currD.equals("S") && currY>0)
                {
                    currY--;
                }else if (currD.equals("E") && currX< inp1)
                {
                    currX ++;
                }else if (currD.equals("W") && currX>0)
                {
                    currX --;
                }

            }
            else if(move.equals("L"))
            {
                if(currD.equals("N"))
                {
                    currD="W";
                }else if (currD.equals("S"))
                {
                    currD="E";

                }else if (currD.equals("E"))
                {
                    currD="N";

                }else if (currD.equals("W"))
                {
                    currD="S";

                }
            }else if(move.equals("R"))
            {
                if(currD.equals("N"))
                {
                    currD="E";

                }else if (currD.equals("S"))
                {
                    currD="W";

                }else if (currD.equals("E"))
                {
                    currD="S";

                }else if (currD.equals("W"))
                {
                    currD="N";

                }
            }
        }
        System.out.println(currX+"-"+currY+"-"+currD);
    }

}
