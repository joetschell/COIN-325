/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_project;

import javax.swing.JFrame; 
/** 
  * 
  * @author jschell157503 
  */ 
 public class StartMenu { 
     public static void main(String[] args) { 
         JFrame frame = new JFrame("Hangman"); 
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         StartMenuPanel smp = new StartMenuPanel(); 
         
         frame.add(smp); 
          
         frame.pack(); 
         frame.setVisible(true); 
     } 
      
 } 
