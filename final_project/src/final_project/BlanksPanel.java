/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_project;
 import javax.swing.JLabel; 
 import javax.swing.JPanel; 
import javax.swing.*;
/**
 *
 * @author jschell157503
 */
public class BlanksPanel extends JPanel{
    public ImageIcon mUnderscore; 
    public JLabel mUnderscoreLabel;
    public ImageIcon mUnderscore2; 
    public JLabel mUnderscoreLabel2;
    
    public int count=0;
    public JPanel mPanel;
    public char[] mWord = {'A', 'P', 'P', 'L', 'E'};
    public JLabel[] mBlanks;
    
    public JLabel mALabel;
    public BlanksPanel(){
      
        
        
        
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        mUnderscore = new ImageIcon("imgs/underscore.png");
        
         mBlanks = new JLabel[20];
        
        
        for(int i = 0; i< 20; i++){
            mUnderscoreLabel = new JLabel();
            mUnderscoreLabel.setIcon(mUnderscore);
            mBlanks[i]=(mUnderscoreLabel);
            
        }
        
        for(int i = 0; i<mWord.length; i++){
            add(mBlanks[i]);
            
            
        } 
        mALabel = new JLabel("A");
        //add(mALabel);
         
        
        
    }
}
