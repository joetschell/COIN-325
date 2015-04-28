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
public class KeyboardPanel extends JPanel{
    public JPanel row1, row2, row3, row4, row5, row6;
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
    public JButton mNewGameButton;
    
    public JLabel mALabel;
    public JLabel mPLabel;
    public JLabel mP2Label;
    public JLabel mLLabel;
    public JLabel mELabel;
    
    public ImageIcon mUnderscore; 
    public JLabel mUnderscoreLabel;
    public ImageIcon mUnderscore2; 
    public JLabel mUnderscoreLabel2;
    
    public int count=0;
    public JPanel mPanel;
    public char[] mWord = {'A', 'P', 'P', 'L', 'E'};
    public JLabel[] mBlanks;
    
   
    public ImageIcon mGallows; 
    public JLabel mGallowsLabel;
    public ImageIcon mGallowsHead; 
    public JLabel mGallowsHeadLabel;
    public ImageIcon mGallowsHeadBody; 
    public JLabel mGallowsHeadBodyLabel;
    public ImageIcon mGallowsHeadBody1Arm; 
    public JLabel mGallowsHeadBody1ArmLabel;
    public ImageIcon mGallowsHeadBody2Arm; 
    public JLabel mGallowsHeadBody2ArmLabel;
    public ImageIcon mGallowsHeadBody2Arm1Leg; 
    public JLabel mGallowsHeadBody2Arm1LegLabel;
    public ImageIcon mGallowsHeadBody2Arm2Leg; 
    public JLabel mGallowsHeadBody2Arm2LegLabel;
    
    public int mWrong;
    public int mCorrect;
    public JLabel mWon;
    public JLabel mLost;
    
    public KeyboardPanel(){
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    mUnderscore = new ImageIcon("imgs/underscore.png");
    
    mBlanks = new JLabel[20];
    mWrong = 0;
    
     mGallows = new ImageIcon("imgs/gallows.gif");
     mGallowsLabel = new JLabel();
     mGallowsLabel.setIcon(mGallows);
     
     mGallowsHead = new ImageIcon("imgs/gallowsHead.gif");
     mGallowsHeadLabel = new JLabel();
     mGallowsHeadLabel.setIcon(mGallowsHead);
     
     mGallowsHeadBody = new ImageIcon("imgs/gallowsHeadBody.gif");
     mGallowsHeadBodyLabel = new JLabel();
     mGallowsHeadBodyLabel.setIcon(mGallowsHeadBody);
     
     mGallowsHeadBody1Arm = new ImageIcon("imgs/gallowsHeadBody1Arm.gif");
     mGallowsHeadBody1ArmLabel = new JLabel();
     mGallowsHeadBody1ArmLabel.setIcon(mGallowsHeadBody1Arm);
     
     mGallowsHeadBody2Arm = new ImageIcon("imgs/gallowsHeadBody2Arm.gif");
     mGallowsHeadBody2ArmLabel = new JLabel();
     mGallowsHeadBody2ArmLabel.setIcon(mGallowsHeadBody2Arm);
     
     mGallowsHeadBody2Arm1Leg = new ImageIcon("imgs/gallowsHeadBody2Arm1Leg.gif");
     mGallowsHeadBody2Arm1LegLabel = new JLabel();
     mGallowsHeadBody2Arm1LegLabel.setIcon(mGallowsHeadBody2Arm1Leg);
     
     mGallowsHeadBody2Arm2Leg = new ImageIcon("imgs/gallowsHeadBody2Arm2Leg.gif");
     mGallowsHeadBody2Arm2LegLabel = new JLabel();
     mGallowsHeadBody2Arm2LegLabel.setIcon(mGallowsHeadBody2Arm2Leg);
     
     mNewGameButton = new JButton("New Game");
     mWon = new JLabel("WINNER!");
     mLost = new JLabel("YOU LOST!");
     
     mLost.setForeground(Color.white);
     mWon.setForeground(Color.white);
    
    for(int i = 0; i< 20; i++){
            mUnderscoreLabel = new JLabel();
            mUnderscoreLabel.setIcon(mUnderscore);
            mBlanks[i]=(mUnderscoreLabel);
        }
        
         
     
    
    row1 = new JPanel();
    row2 = new JPanel();
    row3 = new JPanel();
    row4 = new JPanel();
    row5 = new JPanel();
    row6 = new JPanel();
    
    row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
    row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
    row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
    row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
    row5.setLayout(new BoxLayout(row5, BoxLayout.X_AXIS));
    //row6.setLayout(new BoxLayout(row6, BoxLayout.X_AXIS));
    
    row6.add(mGallowsLabel);
    
    for(int i = 0; i<mWord.length; i++){
           row5.add(mBlanks[i]);  
        }
    
    row4.add(mALabel = new JLabel("A    "));
    row4.add(mPLabel = new JLabel("P    "));
    row4.add(mP2Label = new JLabel("P    "));
    row4.add( mLLabel = new JLabel("L    "));
    row4.add( mELabel = new JLabel("E    "));
    
    row1.add(mAButton = new JButton("A"));
    row1.add( mBButton = new JButton("B"));
    row1.add(mCButton = new JButton("C"));
    row1.add( mDButton = new JButton("D"));
    row1.add(mEButton = new JButton("E"));
    row1.add(mFButton = new JButton("F"));
    row1.add(mGButton = new JButton("G"));
    row1.add( mHButton = new JButton("H"));
    row1.add( mIButton = new JButton("I"));
            
            
    row2.add(mJButton = new JButton("J"));
    row2.add (mKButton = new JButton("K"));
    row2.add (mLButton = new JButton("L"));
    row2.add (mMButton = new JButton("M"));
    row2.add (mNButton = new JButton("N"));
    row2.add (mOButton = new JButton("O"));
    row2.add (mPButton = new JButton("P"));
    row2.add (mQButton = new JButton("Q"));
    row2.add (mRButton = new JButton("R"));
           
            
    row3.add( mSButton = new JButton("S"));
    row3.add (mTButton = new JButton("T"));
    row3.add ( mUButton = new JButton("U"));
    row3.add ( mVButton = new JButton("V"));
    row3.add (mWButton = new JButton("W"));
    row3.add ( mXButton = new JButton("X"));
    row3.add ( mYButton = new JButton("Y"));
    row3.add ( mZButton = new JButton("Z"));

    this.add(row6);
    this.add(mWon);
    this.add(mLost);
    this.add(row4);
    this.add(row5);  
    this.add(row1);
    this.add(row2);
    this.add(row3);
    this.add(mNewGameButton);
    
    this.setBackground(Color.white);
    row4.setBackground(Color.white);
    row6.setBackground(Color.white);
    mNewGameButton.setAlignmentX(CENTER_ALIGNMENT);
    mWon.setAlignmentX(CENTER_ALIGNMENT);
    mLost.setAlignmentX(CENTER_ALIGNMENT);
    
    mALabel.setForeground(Color.white);
    mPLabel.setForeground(Color.white);
    mP2Label.setForeground(Color.white);
    mLLabel.setForeground(Color.white);
    mELabel.setForeground(Color.white);
    
    mAButton.addActionListener(new AButtonPress());
    mPButton.addActionListener(new PButtonPress());
    mLButton.addActionListener(new LButtonPress());
    mEButton.addActionListener(new EButtonPress());
   
    mBButton.addActionListener(new anyOtherButtonPress(mBButton));
    mCButton.addActionListener(new anyOtherButtonPress(mCButton));
    mDButton.addActionListener(new anyOtherButtonPress(mDButton));
    mFButton.addActionListener(new anyOtherButtonPress(mFButton));
    mGButton.addActionListener(new anyOtherButtonPress(mGButton));
    mHButton.addActionListener(new anyOtherButtonPress(mHButton));
    mIButton.addActionListener(new anyOtherButtonPress(mIButton));
    mJButton.addActionListener(new anyOtherButtonPress(mJButton));
    mKButton.addActionListener(new anyOtherButtonPress(mKButton));
    mMButton.addActionListener(new anyOtherButtonPress(mMButton));
    mNButton.addActionListener(new anyOtherButtonPress(mNButton));
    mOButton.addActionListener(new anyOtherButtonPress(mOButton));
    mQButton.addActionListener(new anyOtherButtonPress(mQButton));
    mRButton.addActionListener(new anyOtherButtonPress(mRButton));
    mSButton.addActionListener(new anyOtherButtonPress(mSButton));
    mTButton.addActionListener(new anyOtherButtonPress(mTButton));
    mUButton.addActionListener(new anyOtherButtonPress(mUButton));
    mVButton.addActionListener(new anyOtherButtonPress(mVButton));
    mWButton.addActionListener(new anyOtherButtonPress(mWButton));
    mXButton.addActionListener(new anyOtherButtonPress(mXButton));
    mYButton.addActionListener(new anyOtherButtonPress(mYButton));
    mZButton.addActionListener(new anyOtherButtonPress(mZButton));
   
    
    
    mNewGameButton.addActionListener(new NewGameListener(this));
    
}
    public void disableButtons(){
        mAButton.setEnabled(false);
        mBButton.setEnabled(false);
        mCButton.setEnabled(false);
        mDButton.setEnabled(false);
        mEButton.setEnabled(false);
        mGButton.setEnabled(false);
        mFButton.setEnabled(false);
        mHButton.setEnabled(false);
        mIButton.setEnabled(false);
        mJButton.setEnabled(false);
        mKButton.setEnabled(false);
        mLButton.setEnabled(false);
        mMButton.setEnabled(false);
        mNButton.setEnabled(false);
        mOButton.setEnabled(false);
        mPButton.setEnabled(false);
        mQButton.setEnabled(false);
        mRButton.setEnabled(false);
        mSButton.setEnabled(false);
        mTButton.setEnabled(false);
        mUButton.setEnabled(false);
        mVButton.setEnabled(false);
        mWButton.setEnabled(false);
        mXButton.setEnabled(false);
        mYButton.setEnabled(false);
        mZButton.setEnabled(false);
    }
    
    class AButtonPress implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           mALabel.setForeground(Color.black);
           mAButton.setEnabled(false);
           mCorrect ++;
           if (mCorrect == mWord.length){
               mWon.setForeground(Color.red);
               disableButtons();
           }
        }
    }
    
    class PButtonPress implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           mPLabel.setForeground(Color.black);
           mP2Label.setForeground(Color.black);
           mCorrect = mCorrect +2;
           mPButton.setEnabled(false);
           if (mCorrect == mWord.length){
               mWon.setForeground(Color.red);
               disableButtons();
           }
        }
    }
    
    class LButtonPress implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           mLLabel.setForeground(Color.black);
           mLButton.setEnabled(false);
           mCorrect ++;
           if (mCorrect == mWord.length){
               mWon.setForeground(Color.red);
               disableButtons();
           }
        }
    }
    
    class EButtonPress implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           mELabel.setForeground(Color.black);
           mEButton.setEnabled(false);
           mCorrect ++;
           if (mCorrect == mWord.length){
               mWon.setForeground(Color.red);
               disableButtons();
           }
        }
    }
        
    class anyOtherButtonPress implements ActionListener{
        JButton mButton;
        
        anyOtherButtonPress(JButton button){
            mButton = button;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            switch(mWrong){
                case 0:
                        mGallowsLabel.setVisible(false);
                        row6.add(mGallowsHeadLabel);
                        break;
                case 1:
                        mGallowsHeadLabel.setVisible(false);
                        row6.add(mGallowsHeadBodyLabel);
                        break;
                case 2:
                        mGallowsHeadBodyLabel.setVisible(false);
                        row6.add(mGallowsHeadBody1ArmLabel);
                        break;
                case 3:
                        mGallowsHeadBody1ArmLabel.setVisible(false);
                        row6.add(mGallowsHeadBody2ArmLabel);
                         break;
                case 4:
                        mGallowsHeadBody2ArmLabel.setVisible(false);
                        row6.add(mGallowsHeadBody2Arm1LegLabel);
                        break;
                case 5:
                        mGallowsHeadBody2Arm1LegLabel.setVisible(false);
                        row6.add(mGallowsHeadBody2Arm2LegLabel);
                        mLost.setForeground(Color.red);
                        disableButtons();
                        break;    
                    
                    
            }
            
            mWrong++;
            mButton.setEnabled(false);
        }
    }
    
    class NewGameListener implements ActionListener{
        JPanel mKeyBoardPanel;
        

        NewGameListener(JPanel panel){
        mKeyBoardPanel = panel;
        
    }
        @Override
        public void actionPerformed(ActionEvent ae) {
           mKeyBoardPanel.setVisible(false);
           mKeyBoardPanel.removeAll();
           this.mKeyBoardPanel.add(new KeyboardPanel());
           mKeyBoardPanel.setVisible(true);
          
           
           }
        }
        
    
        
    }

    
    

