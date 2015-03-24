/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab12a;

/**
 *
 * @author jschell157503
 */
public class SLinkedList implements List{ 
     Node head, tail; 
     @Override 
     public Object get(int index) { 
      
         Node rover = head;
         for(int i=0; i < index; i++){
             rover = rover.next;
         }
         return rover.value; 
     } 
 
 
     @Override 
     public void add(Object obj) { 
         Node node = new Node(); 
         node.value = obj; 
          
         if (head == null && tail == null) {     
             node.next = null; 
             head = tail = node; 
         } else { 
             // We assume both head tail are not null. 
             if (head != null && tail != null) { 
                 node.next = null; 
                 tail.next = node; 
                 tail = node; 
             } else { 
                 // Show never happen... 
                 System.err.println("Invalid state only one is null: head, tail"); 
             } 
         } 
     } 
 
 
     @Override 
     public int size() { 
         int listSize=0;
         
         Node rover =head;
         if(head != null){
             listSize = 1;
         
         while(rover.next != null){
             rover = rover.next;
             listSize = listSize+1;
         }
        return listSize; 
         }
         else
             return 0;
     }
     } 




     class Node { 
         Object value; 
         Node next; 
     } 