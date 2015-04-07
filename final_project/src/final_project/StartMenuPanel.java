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
import javax.swing.*;



/**
 *
 * @author jschell157503
 */
public class StartMenuPanel extends JPanel{
    
    

    public JButton mNewGame;
    public JButton mContinue;
    public JButton mClose;
    public JLabel mTitle;
    public ImageIcon mHangmanImage;
    public JLabel mHangmanImageLabel;
    
    public StartMenuPanel(){
       
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        
        
        mTitle = new JLabel("Hangman");
        mNewGame = new JButton("New Game");
        mContinue = new JButton("Continue");
        mClose = new JButton("Close");
        mHangmanImage = new ImageIcon("imgs/noose.jpg");
        mHangmanImageLabel = new JLabel();
        mHangmanImageLabel.setIcon(mHangmanImage);
        
        mClose.addActionListener(new CloseButtonListener());
         add(mTitle);
        add(mHangmanImageLabel);
        mNewGame.addActionListener(new NewGameListener(this));
        this.add(mNewGame);
        this.add(mClose);
        
        mTitle.setAlignmentX(CENTER_ALIGNMENT);
        
        mHangmanImageLabel.setAlignmentX(CENTER_ALIGNMENT);
        mClose.setAlignmentX(CENTER_ALIGNMENT);
        mClose.setAlignmentY(BOTTOM_ALIGNMENT);
        mNewGame.setAlignmentX(CENTER_ALIGNMENT);
        mNewGame.setAlignmentY(BOTTOM_ALIGNMENT);
        
       
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.white);
    }
    
   
    
    class CloseButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent ae) {
           System.exit(1);
        }
    }
    
    class NewGameListener implements ActionListener{
        JPanel mStartMenuPanel;

        NewGameListener(JPanel panel){
        mStartMenuPanel = panel;
    }
        @Override
        public void actionPerformed(ActionEvent ae) {
            mStartMenuPanel.removeAll();
        }
        
    }
}
