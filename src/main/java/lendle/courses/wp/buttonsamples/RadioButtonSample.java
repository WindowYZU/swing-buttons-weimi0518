/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.buttonsamples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class RadioButtonSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());
        JRadioButton radio1 = new JRadioButton("radio1");
        JRadioButton radio2 = new JRadioButton("radio2");
        JCheckBox checkBox=new JCheckBox("check1");
        JToggleButton toggleButton=new JToggleButton("toggle1");
        
        frame.add(radio1);
        frame.add(radio2);
        frame.add(checkBox);
        frame.add(toggleButton);
        //建立 ButtonGroup，把 radio1, radio2 加到 ButtonGroup
        ButtonGroup group=new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(checkBox);
        group.add(toggleButton);
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, ""+radio1.isSelected()+". "+radio1.isSelected()+", "+checkBox.isSelected()+", "+toggleButton.isSelected());
            }
        };
        radio1.addActionListener(listener);
        radio2.addActionListener(listener);
        checkBox.addActionListener(listener);
        toggleButton.addActionListener(listener);
        ////////////////////////////////////////////////////
        
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

}
