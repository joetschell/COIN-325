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
public class Quiz {
    Question[] questions = new Question[25];
    int count = 0;
    Scanner scan = new Scanner(System.in);
    // This function adds the question to the END of the list of questions. 
    public void add(Question question) { 
     
    questions[count] = question;
    count++;
     } 
      
     public Question getQuestion(int index) { 
        if(index >= 0 && index < 25){
         Question question = questions[index];
        
         return question; 
        }
        else
            return null;
     } 
      
     public int getNumberOfQuestions() { 
         int numberOfQs;
         numberOfQs = count;
         return numberOfQs; 
     } 
      
     public int getNumberOfCorrectResponses() {
         int correctCount=0;
        for( int i = 0; i<count; i++){
            System.out.println(questions[i].getResponse());
            if(questions[i].getResponse() == null){
                correctCount += 0;
            }
            else if (questions[i].getResponse().equals(questions[i].getAnswer())){
                correctCount++;
                
            }   
            
        }
        return correctCount;
     }
      
     public void giveQuiz() { 
         //Present each question to the user 
         //accept response from the user 
         for(int i=0; i<count; i++){
             
        System.out.println(questions[i].getQuestion());
        System.out.println("Student's response: ");
        questions[i].setResponse(scan.nextLine());
        
         }
         }
     } 


