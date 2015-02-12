/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab06;

/**
 *
 * @author jschell157503
 */
public class BookShelf {
    
  
    Book book1 = null;
    Book book2 = null;
    Book book3 = null;
    Book book4 = null;
    Book book5 = null;
    
    public BookShelf (Book book1, Book book2, Book book3, Book book4, Book book5)
    {
        setBook1(book1);
        setBook2(book2);
        setBook3(book3);
        setBook4(book4);
        setBook5(book5);
    }
    
    private void setBook1 (Book book)
{
   book1 = book;
}
    
        private void setBook2 (Book book)
{
   book2 = book;
}
    
            private void setBook3 (Book book)
{
   book3 = book;
}
    
                private void setBook4 (Book book)
{
   book4 = book;
}
    
                    private void setBook5 (Book book)
{
   book5 = book;
}
    
    public int numBooks(BookShelf bShelf)
    {
        //BookShelf bookShelf = new BookShelf(book1,book2,book3,book4,book5);
    
       int count = 0;
            if(bShelf.book1!=null)
            {
                count ++;
            }
            if(bShelf.book2!=null)
            {
                count ++;
            }
            if(bShelf.book3!=null)
            {
                count ++;
            }
            if(bShelf.book4!=null)
            {
                count ++;
            }
            if(bShelf.book5!=null)
            {
                count ++;
            }
       
            return count;
    
    } 
}
