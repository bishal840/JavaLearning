package CodingPrac;

public class RobotGeeks {
/*
Given a robot which can only move in four directions, UP(U), DOWN(D), LEFT(L), RIGHT(R). Given a string consisting of instructions to move. Output the coordinates of a robot after executing the instructions. Initial position of robot is at origin(0, 0).

Examples:

Input : move = "UDDLRL"
Output : (-1, -1)

Explanation:
    Move U : (0, 0)--(0, 1)
    Move D : (0, 1)--(0, 0)
    Move D : (0, 0)--(0, -1)
    Move L : (0, -1)--(-1, -1)
    Move R : (-1, -1)--(0, -1)
    Move L : (0, -1)--(-1, -1)
    Therefore final position after the complete
    movement is: (-1, -1)

Input : move = "UDDLLRUUUDUURUDDUULLDRRRR"
Output : (2, 3)
 */


    public static void main(String args[]) {
        String input = "UDDLLRUUUDUURUDDUULLDRRRR";

        int currX=0;
        int currY=0;
        for(char ch : input.toCharArray())
        {
            if(ch=='U')
            {
                currY++;
            }
            if(ch=='D')
            {
                currY--;
            }
            if (ch=='L')
            {
                currX--;
            }
            if (ch =='R')
            {
                currX++;
            }
        }
        System.out.println(currX+","+currY);
    }



}
