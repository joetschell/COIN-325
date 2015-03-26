/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

/**
 *
 * @author Admin
 */
public class ArrayList implements List{
    Object[] array = new Object[0];
    private int arraySize=0;
    
     @Override
     public Object get(int index) { 
         
         return array[index];
     }
 
     @Override
     public void add(Object obj) { 
         int size = array.length;
         Object[] array2 = new Object[size+1]; 
      
         arraySize=size;
         
         if(arraySize != 0){
         System.arraycopy(array2, 0, array2, 0, size);
         array2[size+1]=obj;
         arraySize = size+1;
        
         }
      
         else if(size ==0){
             array2[size]=obj;
             arraySize = size+1;
         }
            
         
         
         
         
     }
     
     @Override
      public int size() { 
          
          return arraySize;
      }
}
