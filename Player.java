import java.util.*;
public class Player {
    private int point;
    private String call;
    public Player()
    {

    }

    public int getPoints()
    {
        return point;
    }

    public void addPoints(int n)
    {
        if(n==0 && point>0)
        {
            point--;
        }
        else if(n==1 && point>=0)
        {
            point++;
        }
    }

}
