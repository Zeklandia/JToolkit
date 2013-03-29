package com.zekfed.desktop.toolkit.secondwindow;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class PanelJava extends JPanel {

    public PanelJava() {

        setFont (new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        javax.swing.GroupLayout layoutJava = new javax.swing.GroupLayout(this);
        this.setLayout(layoutJava);
        JSeparator separateJava = new JSeparator();

        JLabel textJava = new JLabel ("<html><left>Java is a prgramming language for anything"
                + "<br>with a processor. It can be used on Blu-Ray"
                + "<br>players to parking meters."
                + "<br>This applet is written entirely in Java."
                + "</left></html>", SwingConstants.CENTER);


        layoutJava.setHorizontalGroup(
            layoutJava.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textJava, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layoutJava.createSequentialGroup()
                .addContainerGap()
                .addGroup(layoutJava.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separateJava))
                    /*.addGroup(layoutJava.createSequentialGroup()
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCheckUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonApps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                */
                .addContainerGap())
        );
        layoutJava.setVerticalGroup(
            layoutJava.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutJava.createSequentialGroup()
                .addComponent(textJava, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separateJava, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layoutJava.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING))
                    /*.addGroup(layoutJava.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonApps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCheckUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        )
                */
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }

}
