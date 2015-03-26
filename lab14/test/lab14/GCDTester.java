/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab14;

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
public class GCDTester {
    
    public GCDTester() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void GCDTest(){
        assertTrue(DivisorCalc.gcd(3,9)==3);
        assertTrue(DivisorCalc.gcd(10,15)==5);
        assertTrue(DivisorCalc.gcd(7, 8)==1);
        assertTrue(DivisorCalc.gcd(24,12)==12);
        assertTrue(DivisorCalc.gcd(7, 49)==7);
        assertTrue(DivisorCalc.gcd(56, 8)==8);
        assertTrue(DivisorCalc.gcd(125, 25)==25);
        assertTrue(DivisorCalc.gcd(9,4)==1);
        assertTrue(DivisorCalc.gcd(8,6)==2); 
    }
}
