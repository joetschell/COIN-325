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
 * @author Admin
 */
public class GamePanel extends JPanel{
    public ImageIcon mGallows; 
    public JLabel mGallowsLabel;
    public ImageIcon mUnderscore; 
    public JLabel mUnderscoreLabel;
    
    public GamePanel(){
        //this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        this.setPreferredSize(new Dimension(500, 500));
        mGallows = new ImageIcon("imgs/gallows.gif");
        mGallowsLabel = new JLabel();
        mGallowsLabel.setIcon(mGallows);
        mUnderscore = new ImageIcon("imgs/underscore.png");
        mUnderscoreLabel = new JLabel();
        mUnderscoreLabel.setIcon(mUnderscore);
        
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setVerticalGroup(
          layout.createSequentialGroup()
                .addComponent(mGallowsLabel)
                .addComponent(mUnderscoreLabel)
                );
      // add(mGallowsLabel);
      
    }
    
}
