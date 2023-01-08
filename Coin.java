import java.util.*;
public class Coin
{
    private String sideUp = "";

    public Coin()
    {
        toss();
    }

    public void toss()
    {
        int rand = (int)(Math.random()*2);

        if(rand ==0)
        {
            sideUp= "heads";
        }
        else
        {
            sideUp = "tails";
        }
    }

    public String getSideUp()
    {
        return sideUp;
    }

}