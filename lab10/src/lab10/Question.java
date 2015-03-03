/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab10;

import java.util.Scanner;

/**
 *
 * @author jschell157503
 */
public class Question {
    String mQuestion;
    String mAnswer;
    String mResponse;
    Scanner scan = new Scanner(System.in);
    
    

     public Question(String question, String answer) {
         setQuestion(question);
         setAnswer(answer);
         
         
     } 
     //make some setters 
     public String getResponse() { 
         return mResponse;
     } 
    public void setQuestion(String question){ 
         mQuestion = question;
         
     } 
     public void setAnswer(String answer) { 
         mAnswer = answer;
         
     } 
     public void setResponse(String response) {
         mResponse = response;
         
     } 
     
     public String getQuestion(){
         return mQuestion;
     }
     
     public String getAnswer(){
         return mAnswer;
     }
     
   
     public static void main(String[] args) { 
         // populate a Quiz 
         Quiz quiz = new Quiz();
         Question q1 = new Question("What is 1+1?", "2");
         quiz.add(q1);
         
         Question q2 = new Question("Who shot first?", "Han");
         quiz.add(q2);
         
         Question q3 = new Question("Who is the best Star Trek Captain?", "Kirk");
         quiz.add(q3);
         
         
         // ask the user for responses 
         quiz.giveQuiz();
         
         
         
         
         
         // print results 
         System.out.println("Number of correct answers: " + quiz.getNumberOfCorrectResponses());
     } 
 } 

