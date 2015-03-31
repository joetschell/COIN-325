/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab15;

/**
 *
 * @author jschell157503
 */
public class ArrayStack<T> implements Stack<T> { 
     private final int DEFAULT_CAPACITY = 10; 
     private T[] mArray; 
     private int mPosition; 
      
     public ArrayStack() { 
         mArray = (T[]) (new Object[DEFAULT_CAPACITY]); 
         mPosition = 0; 
     } 
      
     @Override 
    public void push(T element) { 
         if (mPosition == mArray.length) { 
             expandCapacity(); 
         } 
          
         mArray[mPosition] = element; 
         mPosition++; 
     } 
      
     private void expandCapacity() { 
         T[] array = (T[]) (new Object[mArray.length*2]); 
          
         for (int i = 0; i < array.length; i++) { 
             array[i] = mArray[i]; 
         } 
          
         mArray = array; 
     } 
 
 
     @Override 
     public boolean isEmpty() { 
         if (size() == 0){
             return true;
         } 
         else{
             return false;
         }
     } 
 
 
     @Override 
     public int size() { 
         return mPosition;
     } 
 
 
     @Override 
     public T pop() throws EmptyCollectionException { 
         if(isEmpty() == true){
         throw new EmptyCollectionException();
         }
         else{
         T element = mArray[mPosition-1];
         mArray[mPosition-1] = null;
         mPosition -= mPosition;
         return element; 
     } 
     }
 
 
     @Override 
     public T peek() throws EmptyCollectionException { 
         if(isEmpty() == true){
         throw new EmptyCollectionException();
         }
         else{
         T element = mArray[mPosition-1];
         return element;
         }
         
         
     } 
      
 } 
