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
    public char[] mWord = {'A', 'P', 'p', 'L', 'E'};
    public ImageIcon mUnderscore; 
    public JLabel mUnderscoreLabel;
    public ImageIcon mUnderscore2; 
    public JLabel mUnderscoreLabel2;
    public JPanel mGamePanel;
    public JButton mAButton;
    public JButton mBButton;
    public JButton mCButton;
    public JButton mDButton;
    public JButton mEButton;
    public JButton mFButton;
    public JButton mGButton;
    public JButton mHButton;
    public JButton mIButton;
    public JButton mJButton;
    public JButton mKButton;
    public JButton mLButton;
    public JButton mMButton;
    public JButton mNButton;
    public JButton mOButton;
    public JButton mPButton;
    public JButton mQButton;
    public JButton mRButton;
    public JButton mSButton;
    public JButton mTButton;
    public JButton mUButton;
    public JButton mVButton;
    public JButton mWButton;
    public JButton mXButton;
    public JButton mYButton;
    public JButton mZButton;
   
    
    public StartMenuPanel(){
      
       
       this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      
        GamePanel mGamePanel = new GamePanel();
        
        mTitle = new JLabel("Hangman");
        mNewGame = new JButton("New Game");
        mContinue = new JButton("Continue");
        mClose = new JButton("Close");
        mHangmanImage = new ImageIcon("imgs/noose.jpg");
        mHangmanImageLabel = new JLabel();
        mHangmanImageLabel.setIcon(mHangmanImage);
        mGallows = new ImageIcon("imgs/gallows.gif");
        mGallowsLabel = new JLabel();
        mGallowsLabel.setIcon(mGallows);
        mUnderscore = new ImageIcon("imgs/underscore.png");
        mUnderscoreLabel = new JLabel();
        mUnderscoreLabel.setIcon(mUnderscore);
        mUnderscore2 = new ImageIcon("imgs/underscore.png");
        mUnderscoreLabel2 = new JLabel();
        mUnderscoreLabel2.setIcon(mUnderscore2);
        mAButton = new JButton();
        mBButton = new JButton("B");
        mCButton = new JButton("C");
        mDButton = new JButton("D");
        mEButton = new JButton("E");
        mFButton = new JButton("F");
        mGButton = new JButton("G");
        mHButton = new JButton("H");
        mIButton = new JButton("I");
        mJButton = new JButton("J");
        mKButton = new JButton("K");
        mLButton = new JButton("L");
        mMButton = new JButton("M");
        mNButton = new JButton("N");
        mOButton = new JButton("O");
        mPButton = new JButton("P");
        mQButton = new JButton("Q");
        mRButton = new JButton("R");
        mSButton = new JButton("S");
        mTButton = new JButton("T");
        mUButton = new JButton("U");
        mVButton = new JButton("V");
        mWButton = new JButton("W");
        mXButton = new JButton("X");
        mYButton = new JButton("Y");
        mZButton = new JButton("Z");
        
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
           this.mStartMenuPanel.add(mGallowsLabel);
           mGallowsLabel.setAlignmentX(LEFT_ALIGNMENT);
           
           //int space = 200;
           //for(int i=0; i<mWord.length; i++){
           this.mStartMenuPanel.add(mUnderscoreLabel);
           mUnderscoreLabel.setAlignmentY(BOTTOM_ALIGNMENT);
         // mUnderscoreLabel.setAlignmentX();
           //space += 25;
//         this.mStartMenuPanel.add(mUnderscoreLabel2);
//          mUnderscoreLabel2.setAlignmentX(RIGHT_ALIGNMENT);
//          
           this.mStartMenuPanel.add(mAButton);
           this.mStartMenuPanel.add(mBButton);
           this.mStartMenuPanel.add(mCButton);
           this.mStartMenuPanel.add(mCButton);
           this.mStartMenuPanel.add(mEButton);
           this.mStartMenuPanel.add(mFButton);
           this.mStartMenuPanel.add(mGButton);
           this.mStartMenuPanel.add(mHButton);
           this.mStartMenuPanel.add(mJButton);
           this.mStartMenuPanel.add(mKButton);
           this.mStartMenuPanel.add(mLButton);
           this.mStartMenuPanel.add(mMButton);
           this.mStartMenuPanel.add(mNButton);
           this.mStartMenuPanel.add(mOButton);
           this.mStartMenuPanel.add(mPButton);
           this.mStartMenuPanel.add(mQButton);
           this.mStartMenuPanel.add(mRButton);
           this.mStartMenuPanel.add(mSButton);
           this.mStartMenuPanel.add(mTButton);
           this.mStartMenuPanel.add(mUButton);
           this.mStartMenuPanel.add(mVButton);
           this.mStartMenuPanel.add(mWButton);
           this.mStartMenuPanel.add(mXButton);
           this.mStartMenuPanel.add(mYButton);
           this.mStartMenuPanel.add(mZButton);
          
           
           }
        }
        
    }

