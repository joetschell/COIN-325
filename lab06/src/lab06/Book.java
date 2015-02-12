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
import java.util.Scanner;
public class Book {
    public String Title;
    public String Author;
    public String Publisher;
    public int Copyright;
    Scanner scan = new Scanner(System.in);
   
public Book (String title, String author, String publisher, int copyright)
{
   setTitle(title);
   setAuthor(author);
   setPublisher(publisher);
   setCopyright(copyright);
    
}
private void setTitle (String title)
{
   Title = title;
}

private void setAuthor (String author)
{
  Author = author;
}
private void setPublisher(String publisher)
{
   Publisher = publisher;
}
private void setCopyright (int copyright)
{
   Copyright = copyright;
}
}
