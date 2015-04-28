/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import javax.swing.JLabel; 
 import javax.swing.JPanel; 
import javax.swing.*;
/**
 *
 * @author jschell157503
 */
public class WordPanel extends JPanel{
    public JLabel mALabel;
    public JLabel mPLabel;
    public JLabel mP2Label;
    public JLabel mLLabel;
    public JLabel mELabel;
    
    public WordPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        mALabel = new JLabel("A    ");
        mPLabel = new JLabel("P    ");
        mP2Label = new JLabel("P    ");
        mLLabel = new JLabel("L    ");
        mELabel = new JLabel("E    ");
        
        add(mALabel);
        add(mPLabel);
        add(mP2Label);
        add(mLLabel);
        add(mELabel);
        
        //mALabel.setVisible(false);
       // mPLabel.setVisible(false);
       // mP2Label.setVisible(false);
       // mLLabel.setVisible(false);
       // mELabel.setVisible(false);
        
        this.setBackground(Color.white);
        
        add(new BlanksPanel());
        
     
 }
    
}
    
    