/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab06.Book;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jschell157503
 */
public class BookTester {
    
    public BookTester() {
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
public void BookTester() {
    Book book = new Book("The Great Gatsby", "Fitzgerald", "Penguin", 1929);
    assertTrue(book.Title.equals("The Great Gatsby"));
     assertTrue(book.Author.equals("Fitzgerald"));
      assertTrue(book.Publisher.equals("Penguin"));
       assertTrue(book.Copyright == 1929);
            
}
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
