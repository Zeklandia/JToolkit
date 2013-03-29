package com.zekfed.desktop.toolkit.changes;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class PanelHistory extends JPanel {

    public PanelHistory() {

        setFont (new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(this);
        this.setLayout(layout1);
        JSeparator separator1 = new JSeparator();

        JLabel textTwo = new JLabel ("<html><left>"
                + "This is text on the page."
                + "</left></html>", SwingConstants.CENTER);

        JButton button1 = new JButton("Button One");
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
               //action
            }
        });

        JButton button2 = new JButton("Second Button");
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //action
            }
        });



        JButton button3 = new JButton("Third Button");
        button3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //action
            }
        });


        JButton button4 = new JButton("Fourth Button");
        button4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //action
            }
        });

        layout1.setVerticalGroup(
               layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout1.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(button1)
                         .addComponent(button2)
                         .addComponent(button3)
                         .addComponent(button4))
                    .addContainerGap(61, Short.MAX_VALUE))
          );

    }

}
