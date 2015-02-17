/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab07;
import javax.swing.JFrame;
/**
 *
 * @author jschell157503
 */
public class PushRandom {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PushRandomPanel prp = new PushRandomPanel();
        frame.add(prp);
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
