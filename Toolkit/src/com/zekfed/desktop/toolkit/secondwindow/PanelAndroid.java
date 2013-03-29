package com.zekfed.desktop.toolkit.secondwindow;

import java.awt.Font;
import javax.swing.*;

public class PanelAndroid extends JPanel {

    public PanelAndroid() {

        setFont (new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        javax.swing.GroupLayout layoutAndroid = new javax.swing.GroupLayout(this);
        this.setLayout(layoutAndroid);
        JSeparator separateAndroid = new JSeparator();

        JLabel textAndroid = new JLabel ("<html><left>Android is an Operating System for "
                + "<br>smartphones and tablets. It is based off of Linux."
                + "<br>Android is currently the most popular smartphone"
                + "<br>and tablet OS."
                + "</left></html>", SwingConstants.CENTER);


        layoutAndroid.setHorizontalGroup(
            layoutAndroid.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textAndroid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layoutAndroid.createSequentialGroup()
                .addContainerGap()
                .addGroup(layoutAndroid.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separateAndroid))
                    /*.addGroup(layoutAndroid.createSequentialGroup()
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCheckUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAndroid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                */
                .addContainerGap())
        );
        layoutAndroid.setVerticalGroup(
            layoutAndroid.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutAndroid.createSequentialGroup()
                .addComponent(textAndroid, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separateAndroid, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layoutAndroid.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING))
                    /*.addGroup(layoutAndroid.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonAndroid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCheckUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        )
                */
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }

}
