package com.zekfed.desktop.toolkit.secondwindow;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class PanelProgramming extends JPanel {

    public PanelProgramming() {

        setFont (new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        javax.swing.GroupLayout layoutProgramming = new javax.swing.GroupLayout(this);
        this.setLayout(layoutProgramming);
        JSeparator separateProgramming = new JSeparator();

        JLabel textProgramming = new JLabel ("<html><left>So far, I am working on one"
                + "<br>Android app and this Java applet. I plan"
                + "<br>to do much more when I have the time."
                + "</left></html>", SwingConstants.CENTER);


        layoutProgramming.setHorizontalGroup(
            layoutProgramming.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textProgramming, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layoutProgramming.createSequentialGroup()
                .addContainerGap()
                .addGroup(layoutProgramming.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separateProgramming))
                    /*.addGroup(layoutProgramming.createSequentialGroup()
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCheckUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonProgramming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                */
                .addContainerGap())
        );
        layoutProgramming.setVerticalGroup(
            layoutProgramming.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutProgramming.createSequentialGroup()
                .addComponent(textProgramming, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separateProgramming, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layoutProgramming.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING))
                    /*.addGroup(layoutProgramming.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonProgramming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCheckUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        )
                */
                .addContainerGap(80, Short.MAX_VALUE))
        );
}
}



