/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_project;
import javax.swing.JButton; 
 import java.awt.Dimension; 
 import javax.swing.JLabel; 
 import javax.swing.JPanel; 
 import java.awt.event.ActionEvent;  
 import java.awt.event.ActionListener;  
 import java.util.Random; 
import java.awt.*;
import static java.awt.Component.BOTTOM_ALIGNMENT;
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
        
        
        
    }
}
