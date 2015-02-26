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
public class IntegerCount {
 public int[] numbers = new int[101];
 
     public void receiveInteger(int num) {
         
        
    } 
      
     public int receiveCount(int num) { 
          numbers[num]+=1;
         
        
         
         
         return numbers[num];
     }
     
      
     public void printout(){ 
        System.out.print(toString()); 
     } 
      
     public String toString() { 
         return ""; 
     } 
 } 
