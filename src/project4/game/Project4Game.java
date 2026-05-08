
package project4.game;

import java.util.Scanner;
public class Project4Game {

    
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    int winner = 0;
    System.out.println("hur många spelare är ni");
    int players = input.nextInt();
    int position[] = new int[players];
    for (int h = 0;h<players;h++)
    {
        position[h] = 0;
    }
    
    int which = 0;
    while (winner == 0)
    {
        System.out.println("press 1 then enter to roll");
        int nothing = input.nextInt();
        int dice = dice();
        System.out.println("you rolled a " + dice);
        position[which] = position[which] + dice;
        System.out.println("player number " + (which+1) + " is on tile " + position[which]);
        if (1==1)//(position[which] == 20||position[which] == 40||position[which] == 60||position[which] == 80)
        {
            System.out.println("you landed on a special space");
            special(position[which]);
        }
        
        if (which == players-1)
        {
            which = 0;
        }
        else if (position[which] >= 100)
        {
            break;
        }
        else
        {
            which++;
        }
        
    }
    System.out.println("player number " + (which+1) + " won the game");
        
    
    }
    
    public static int dice()
    {
        int number = (int)(Math.random()*6+1);
        return number;
    }
    public static void special(int position)
    {
        int special = (int)(Math.random()*5+1);
        
        if (special==1)
        {
            
        }
    }
    
}
