/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab16;

/**
 *
 * @author jschell157503
 */
public class LinkedStack<T> implements Stack<T> { 
    private int count; 
     private LinkedNode<T> top; 
      
     public LinkedStack() { 
         count = 0; 
         top = null; 
     } 
 
 
     @Override 
     public void push(T element) { 
         LinkedNode<T> node = new LinkedNode<T>();
         node.setElement(element);
         if(top == null){
             top=node;
             count++;
         }
         else{
             node.setNext(top);
             top = node;
             count++;
         }
      
         
     } 
 
 
     @Override 
     public T pop() throws EmptyCollectionException { 
         if ( top == null ) { 
             throw new EmptyCollectionException(); 
         } 
          
         T result = top.getElement(); 
         top = top.getNext(); 
         count--; 
          
         return result; 
     } 
 
 
     @Override 
     public T peek() throws EmptyCollectionException { 
          if( top == null ) { 
             throw new EmptyCollectionException(); 
         } 
          
         T result = top.getElement(); 
         
          
         return result; 
     } 
      
 
 
     @Override 
     public boolean isEmpty() { 
         if (count == 0){
             return true;
         }
         else{
             return false;
         }
     } 
 
 
     @Override 
     public int size() { 
         return count;
     } 
     
     class Node {  
          Object value;  
          Node next;  
      }  

      
 } 

