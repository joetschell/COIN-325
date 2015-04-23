/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab18a;

import java.util.LinkedList;

/**
 *
 * @author jschell157503
 */
public class HashLinkedChaining<K, V> implements Hash<K,V> { 
     private Object[] mTable; 
     private int mCount;
    HashLinkedChaining() { 
         mTable = (new Object[2]); 
         for (int i = 0; i < mTable.length; i++) { 
             mTable[i] = new LinkedList<HashNode<K,V>>(); 
        } 
     } 
 
 
     @Override 
     public void put(K key, V value) { 
         if (key == null || value == null){ 
             return; 
         } 
          
         LinkedList<HashNode<K,V>> list = (LinkedList<HashNode<K,V>>) 
                 mTable[Math.abs(key.hashCode()) % mTable.length]; 
          
         list.add(new HashNode(key, value)); 
         mCount++;
     } 
 
 
     @Override 
     public V get(K key) { 
         V ret; 
         
         if (key == null) { 
             return null; 
         } 
          
         LinkedList<HashNode<K,V>> list = (LinkedList<HashNode<K,V>>) 
                 mTable[Math.abs(key.hashCode()) % mTable.length]; 
          
         for(int i = 0; i<mCount; i++){
             
        
         if (list.get(i).getKey() == key){
             ret=list.get(i).getValue();
             return ret;
         }
         
         }
         return null;
          
         
     } 
 
 
     @Override 
     public int size() { 
         return mCount;
     } 
 } 
