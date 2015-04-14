/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab17;

/**
 *
 * @author jschell157503
 */
public class LinkedQueue<T> implements Queue<T>{ 
     private int mCount; 
     private LinkedNode<T> mHead, mTail; 
      
     public LinkedQueue () { 
         mCount = 0; 
         mHead = mTail = null; 
     } 
      
     @Override 
     public void enqueue(T element) { 
         LinkedNode<T> node = new LinkedNode<T>(); 
          
         node.setElement(element); 
          
         if (mHead == null) { 
             mHead = node; 
         } else { 
             mTail.setNext(node); 
         } 
          
         mTail = node; 
         mCount++; 
     } 
 
 
     @Override 
     public T dequeue() throws EmptyCollectionException { 
       if(mHead == null){
           throw new EmptyCollectionException();
       }
       
           T result = mHead.getElement();
           mHead=mHead.getNext();
           mCount--;
       
       return result;
     } 
 
 
     @Override 
     public T first() throws EmptyCollectionException { 
        if(mHead == null){
           throw new EmptyCollectionException();
       }
       
           T result = mHead.getElement();
          
       
       return result;
     } 
 
 
     @Override 
     public boolean isEmpty() { 
         if(mCount == 0){
             return true;
         }
         else{
             return false;
         }
     } 
 
 
     @Override 
    public int size() { 
         return mCount;
     } 
 } 

