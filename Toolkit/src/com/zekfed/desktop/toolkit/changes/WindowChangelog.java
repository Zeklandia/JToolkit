package com.zekfed.desktop.toolkit.changes;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class WindowChangelog extends JFrame{

    public WindowChangelog() {

        JFrame frameChangelog = new JFrame ("Changelog and History");
        frameChangelog.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        frameChangelog.setUndecorated(false);

        JTabbedPane tabsChangelog = new JTabbedPane();
        tabsChangelog.addTab ("Changelog", new PanelChangelog());
        tabsChangelog.addTab ("Previous Versions", new PanelHistory());


        // Makes window

        frameChangelog.getContentPane().add(tabsChangelog);
        frameChangelog.pack();
        frameChangelog.setLocationRelativeTo(null);
        frameChangelog.setSize(new Dimension(420,300));
        frameChangelog.setVisible(true);
        frameChangelog.setTitle("Changelog and History");
        frameChangelog.setResizable(false);
        frameChangelog.setMaximumSize(new Dimension (420, 300));
        frameChangelog.setMinimumSize(new Dimension (420, 300));
    }

}