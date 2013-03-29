package com.zekfed.desktop.toolkit;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

class PanelFour extends JPanel {

    public PanelFour() {

        setFont (new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(this);
        this.setLayout(layout1);
        JSeparator separator1 = new JSeparator();

        JLabel text1 = new JLabel ("<html><left>"
                + "This is text on the page."
                + "</left></html>", SwingConstants.CENTER);

        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
               //action
            }
        });

        JButton button2 = new JButton("Button 2");
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //action
            }
        });



        JButton button3 = new JButton("Button 3");
        button3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //action
            }
        });


        JButton button4 = new JButton("Button 4");
        button4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //action
            }
        });

        layout1.setHorizontalGroup(
               layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout1.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout1.createSequentialGroup()
                              .addGap(12, 12, 12)
                              .addComponent(button1)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(button2)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(button3)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(button4)
                              .addContainerGap(54, Short.MAX_VALUE))
                         .addGroup(layout1.createSequentialGroup()
                              .addGroup(layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(separator1))
                              .addContainerGap())))
          );
          layout1.setVerticalGroup(
               layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout1.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(button1)
                         .addComponent(button2)
                         .addComponent(button3)
                         .addComponent(button4))
                    .addContainerGap(68, Short.MAX_VALUE))
          );

}

}