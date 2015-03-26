/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13;

/**
 *
 * @author jschell157503
 */
public class Converter { 
     public static Integer utoi (String str) { 
         
         try{
            Integer.parseInt(str); 
         }catch (NumberFormatException e) {
          System.err.println("NumberFormatException: The string that was entered cannot be converted to an integer.");
          return null;
         }
          
         return Integer.parseInt(str); 
     } 
 } 

