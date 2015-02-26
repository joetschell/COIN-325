/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab09;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jschell157503
 */
public class IntegerCounterTester {
    
    public IntegerCounterTester() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test 
     public void receiveTest() { 
         IntegerCounter ic = new IntegerCounter(); 
         ic.receiveInteger(1); 
         ic.receiveInteger(40); 
         ic.receiveInteger(1); 
         ic.receiveInteger(40); 
         ic.receiveInteger(40); 
          
         assertTrue(ic.receiveCount(0) == 0); 
         assertTrue(ic.receiveCount(1) == 2); 
         assertTrue(ic.receiveCount(40) == 3); 
     } 
      
     @Test 
     public void receiveTest2() { 
         IntegerCounter ic = new IntegerCounter(); 
         ic.receiveInteger(0); 
         ic.receiveInteger(5); 
         ic.receiveInteger(-4); 
         ic.receiveInteger(101); 
         ic.receiveInteger(5); 
          
         assertTrue(ic.receiveCount(1) == 0); 
         assertTrue(ic.receiveCount(0) == 1); 
         assertTrue(ic.receiveCount(5) == 2); 
     } 
      
     @Test 
     public void printout() { 
         IntegerCounter ic = new IntegerCounter(); 
          
         //assertTrue(ic.toString().equals("")); 
         ic.receiveInteger(0); 
         ic.receiveInteger(5); 
         ic.receiveInteger(-4); 
         ic.receiveInteger(101); 
         ic.receiveInteger(5); 
          
         assertTrue(ic.toString().equals("0: 1\n5: 2\n")); 
     } 
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
