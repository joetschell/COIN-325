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
    public JPanel row1, row2, row3;
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
    
    public KeyboardPanel(){
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    
    row1 = new JPanel();
    row2 = new JPanel();
    row3 = new JPanel();
    
    row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
    row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
    row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
    
 
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

    this.add(row1);
    this.add(row2);
    this.add(row3);
}
    
    
    
}
