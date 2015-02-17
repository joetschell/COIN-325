/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab07;

import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.Random;


/**
 *
 * @author jschell157503
 */
public class PushRandomPanel extends JPanel{
    public int mNum;
    public JButton mPush;
    public JLabel mNumDisplay;
    
    public PushRandomPanel (){
        mNum = 0;
        mPush = new JButton("RNG");
        mNumDisplay = new JLabel("Your random number is: " + mNum);
        mPush.addActionListener(new ButtonListener());
        
        this.add(mNumDisplay);
        this.add(mPush);
        
        this.setPreferredSize(new Dimension(275, 100));
    }
    
    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Random numGenerator = new Random();
            mNum= numGenerator.nextInt(100);
            mNumDisplay.setText("Your random number is: " + mNum);
       
        }
        
    }
    
}
