/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab08;

import javax.swing.JOptionPane;

/**
 *
 * @author jschell157503
 */
public class DialogSumProduct {
    public static void main(String[] args){
        int num1, num2, product, again;
        String userInput;
        do{
          userInput = JOptionPane.showInputDialog("Enter an integer.");
          num1 = Integer.parseInt(userInput);
          userInput = JOptionPane.showInputDialog("Enter a second integer.");
          num2 = Integer.parseInt(userInput);
          product = num1*num2;
          JOptionPane.showMessageDialog(null, product);
          again = JOptionPane.showConfirmDialog(null, "Would you like to"
                  + " calculate another product?");
         }while(again == JOptionPane.YES_OPTION);
    }
    
}
