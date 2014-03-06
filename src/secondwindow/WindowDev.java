package com.zekfed.desktop.toolkit.secondwindow;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class WindowDev extends JFrame{

    public WindowDev() {

        JFrame frameDev = new JFrame ("Android and Java Development");
        frameDev.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        frameDev.setUndecorated(false);

        JTabbedPane tabsDev = new JTabbedPane();
        tabsDev.addTab ("Android Apps", new PanelAndroid());
        tabsDev.addTab ("Java Programs", new PanelJava());
        tabsDev.addTab ("Programming", new PanelProgramming());


        // Makes window

        frameDev.getContentPane().add(tabsDev);
        frameDev.pack();
        frameDev.setLocationRelativeTo(null);
        frameDev.setSize(new Dimension(420,300));
        frameDev.setVisible(true);
        frameDev.setTitle("Android and Java Development");
        frameDev.setResizable(false);
        frameDev.setMaximumSize(new Dimension (420, 300));
        frameDev.setMinimumSize(new Dimension (420, 300));
    }

}