package com.zekfed.desktop.toolkit;

//******************************************************************************
//         Author: Asher Wood
//
//                 Try it!
//******************************************************************************

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import javax.swing.*;


public class WindowMain
{

    //--------------------------------------------------------------------------
    //  Creates a tabbed panel with any information an admissions officer may
    //  need.
    //--------------------------------------------------------------------------

    public static void main (String[] args) throws ClassNotFoundException

    {

         //Sets the look and feel (LAF) to Nimbus (looks like Mac OS X)
        try {UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			UIDefaults defaults = UIManager.getLookAndFeelDefaults();}
        catch (Exception e) {}

        JFrame frameMain = new JFrame ("Dektop Toolkit");
        frameMain.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frameMain.setDefaultLookAndFeelDecorated(true);
        frameMain.setUndecorated(false);

        // Adds Tabs

        JTabbedPane tabsMain = new JTabbedPane(JTabbedPane.TOP);
        tabsMain.setToolTipText("Click on the tabs to change the page...");
        tabsMain.addTab ("Home", new PanelOne());
        tabsMain.addTab ("Tab 2", new PanelTwo());
        tabsMain.addTab ("Tab 3", new PanelThree());
        tabsMain.addTab ("Tab 4", new PanelFour());
        tabsMain.addTab ("Tab 5", new PanelFive());

        // Makes window

        frameMain.getContentPane().add(tabsMain);
        frameMain.pack();
        frameMain.setSize(new Dimension(420, 300));
        frameMain.setVisible(true);
        frameMain.setLocationRelativeTo(null);
        frameMain.setTitle("Toolkit - ZekFed Dev Team");
        frameMain.setResizable(false);
        frameMain.setMaximumSize(new Dimension (420, 300));
        frameMain.setMinimumSize(new Dimension (420, 300));

        //Gets user's attention focused on the window
        System.out.println ("Hello!");
        System.out.println ("Please refer to the window labled 'Desktop'");

        // Checks for Updates, then Downloads and executes them

        String userHome = System.getProperty("user.home");

        try
     {  long startTime = System.currentTimeMillis();

        System.out.println("Checking for Update...");

        URL url = new URL("https://dl.dropbox.com/s/sro3q6ok0vvxbl5/.version?dl=1");
        url.openConnection();
        InputStream reader = url.openStream();
        FileOutputStream writer = new FileOutputStream(userHome + "/Downloads/.version");
        byte[] buffer = new byte[153600];
        int totalBytesRead = 0;
        int bytesRead = 0;
        while ((bytesRead = reader.read(buffer)) > 0)
        {
           writer.write(buffer, 0, bytesRead);
           buffer = new byte[153600];
           totalBytesRead += bytesRead;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Update Check Complete.\nSaved to "
                + userHome
                + "/Downloads/.version\n"
                + (new Integer(totalBytesRead).toString())
                + " bytes downloaded:\n ("
                + (new Long(endTime - startTime).toString())
                + " millseconds).\n");
        writer.close();

        File updateFileSource = new File(userHome + "/Downloads/.version");
        String updateFile = new String(Files.readAllBytes(FileSystems.getDefault().getPath(userHome + "/Downloads/.version")));
        int version = 0;
        int update = (int) Double.parseDouble(updateFile);
        if (version == update){
             System.out.println("This version is up to date!");
            }

        else if(version < update){

             System.out.println("An update is available!");
             JOptionPane.showMessageDialog(frameMain, "An Update is Available!\nUse the 'Force Update' button on the home tab.");
        }

        else if(version > update){

             System.out.println("Back... TO THE FUTURE!!!!");
             JOptionPane.showMessageDialog(frameMain, "ಠ_ಠ\nDon't edit that file!");
            }

        reader.close();
        updateFileSource.delete();
        System.out.println("Version code file deleted.");

     }
     catch (MalformedURLException t)
     {
        System.err.println("What happened? I think there was a disk error!");
     }
     catch (IOException r)
     {
        System.err.println("Great Scott! An error!");
     }


    }

}