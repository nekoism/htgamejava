import java.util.*;
public class CoinToss {
    public static void main(String args[])
    {
        Coin c1 = new Coin();
        Scanner in = new Scanner(System.in);

        Player p1 = new Player();
        Player p2 = new Player();

        while(p1.getPoints()!=5 && p2.getPoints()!=5)
        {
            System.out.println("Initial side facing up: " + c1.getSideUp());

            System.out.println();

            System.out.println("Coin is tosssed...");

            System.out.println();

            c1 = new Coin();

            System.out.println("What is your call player 1?");
            String p1Inp = in.nextLine();

            System.out.println("What is your call player 2?");
            String p2Inp = in.nextLine();

            String result = c1.getSideUp();

            System.out.println("The coin side up is.... "  +  result);

            if(result.equals(p1Inp))
            {
                System.out.println("Player 1 guess was correct");
                p1.addPoints(1);
                p2.addPoints(0);
                System.out.println();
            }
            else if(result.equals(p2Inp))
            {
                System.out.println("Player 2 guess was correct");
                p2.addPoints(1);
                p1.addPoints(0);
                System.out.println();
            }

            System.out.println("Player 1 points: " + p1.getPoints() + " ||||| " + "Player 2 points: " + p2.getPoints());
            System.out.println();

            c1 = new Coin();
        }
        
        if(p1.getPoints()==5)
        {
            System.out.println("Player 1 winssss!!!!");
        }
        else if(p2.getPoints()==5)
        {
            System.out.println("Player 2 winsssss!!!");
        }
    }

    
}
