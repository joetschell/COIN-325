package lab05;

/**
 *
 * @author jschell157503
 */
public class PairofDice {
        Die die1 = new Die();
        Die die2 = new Die();
        int sum;
    public void calcSum()
    {
        int sum;
        sum = die1.roll() + die2.roll();
       
    }      
    
    public int getSum()
    {
        return sum;
    }
    
   
    }
           