/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab09;

/**
 *
 * @author jschell157503
 */
public class IntegerCounter {
    public int[] counters = new int[101];
 int count, mNum;
     public void receiveInteger(int num) {  
         if (num >=0 && num <=100){
         counters[num]+=1;
         }
    } 
      
     public int receiveCount(int num) { 
         return counters[num];       
     }
     
      
     public void printout(){ 
        System.out.print(toString()); 
     } 
      

     public String toString() { 
         return ""; 
     } 
}
