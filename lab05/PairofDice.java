/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab05;

/**
 *
 * @author jschell157503
 */
import java.util.Scanner;
public class PairofDice {
    public static void main(String[] args){
     
        PairofDice pair = new PairofDice();
        System.out.println("The sum is: " + pair.calcSum());
    }
    Scanner scan = new Scanner(System.in);
    
        
        Die die = new Die();
        int die1, die2;
       
       
        int sum;
        
        
    public int calcSum()
    {
        System.out.print("Input the value of the first Die: ");
        die1=scan.nextInt();
        System.out.print("Input the value of the first Die: ");
        die2=scan.nextInt();
        
        if (die1 == -1){
            die1 = die.roll();
        }
        if (die2 == -1){
            die2=die.roll();
        }
       
        
        sum = die1+die2;
       return sum;
    }      
    
    public int getSum()
    {
        return sum;
    }
    
   
   
    }