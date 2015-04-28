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
public class StartMenuPanel extends JPanel{
    
    

    public JButton mNewGame;
    public JButton mContinue;
    public JButton mClose;
    public JLabel mTitle;
    public ImageIcon mHangmanImage;
    public JLabel mHangmanImageLabel;
    public ImageIcon mGallows; 
    public JLabel mGallowsLabel;
    
    public ImageIcon mUnderscore; 
    public JLabel mUnderscoreLabel;
    public ImageIcon mUnderscore2; 
    public JLabel mUnderscoreLabel2;
    public JPanel mGamePanel;
    
   public JLabel mALabel;
    //Only do this if there will be only one!
    //private static StartMenuPanel mInstance;
    
   
    //public static StartMenuPanel getInstance(){ return mInstance;}
    public StartMenuPanel(){
      
       
       this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
       //mInstance = this;
      
        GamePanel mGamePanel = new GamePanel();
        
        mTitle = new JLabel("Hangman");
        mNewGame = new JButton("New Game");
        mContinue = new JButton("Continue");
        mClose = new JButton("Close");
        mHangmanImage = new ImageIcon("imgs/noose.jpg");
        mHangmanImageLabel = new JLabel();
        mHangmanImageLabel.setIcon(mHangmanImage);
        mUnderscore = new ImageIcon("imgs/underscore.png");
        mUnderscoreLabel = new JLabel();
        mUnderscoreLabel.setIcon(mUnderscore);
        mUnderscore2 = new ImageIcon("imgs/underscore.png");
        mUnderscoreLabel2 = new JLabel();
        mUnderscoreLabel2.setIcon(mUnderscore2);
        
        
        
        
        mClose.addActionListener(new CloseButtonListener());
        mNewGame.addActionListener(new NewGameListener(this));
        
        
        add(mTitle);
        add(mHangmanImageLabel);
        add(mNewGame);
        add(mClose);
        
       
        mTitle.setAlignmentX(CENTER_ALIGNMENT);
        mHangmanImageLabel.setAlignmentX(CENTER_ALIGNMENT);
        mClose.setAlignmentX(CENTER_ALIGNMENT);
        mClose.setAlignmentY(BOTTOM_ALIGNMENT);
        mNewGame.setAlignmentX(CENTER_ALIGNMENT);
        mNewGame.setAlignmentY(BOTTOM_ALIGNMENT);
        
       
        this.setPreferredSize(new Dimension(500, 500));
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
        JPanel mGamePanel;

        NewGameListener(JPanel panel){
        mStartMenuPanel = panel;
        
    }
        @Override
        public void actionPerformed(ActionEvent ae) {
           mClose.setVisible(false);
           mNewGame.setVisible(false);
           mHangmanImageLabel.setVisible(false);
           mTitle.setVisible(false);
           mStartMenuPanel.removeAll();
          
           
           this.mStartMenuPanel.add(new KeyboardPanel());
        
          
           
           }
        }
}
    
    
