/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab06.Book;
import lab06.BookShelf;
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
public class BookShelfTester {
    
    public BookShelfTester() {
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
    public void NullBookShelfTester(){
      BookShelf bookShelf = new BookShelf(null,null,null,null,null);
      
        assertTrue(bookShelf.numBooks(bookShelf)==0);
        
        
    }
    
    @Test
    public void FullBookShelfTester(){
        Book book = new Book ("Gatsby", "Fitzgerald", "Penguin", 1929);
        BookShelf bookShelf = new BookShelf(book, book, book, book, book) ;
        assertTrue(bookShelf.numBooks(bookShelf)==5);
    }
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

