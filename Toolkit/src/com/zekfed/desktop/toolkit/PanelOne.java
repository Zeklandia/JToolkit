package com.zekfed.desktop.toolkit;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import javax.swing.*;

class PanelOne extends JPanel {

    public PanelOne() {

        setFont (new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(this);
        this.setLayout(layout1);
        JSeparator separator1 = new JSeparator();

        JLabel text1 = new JLabel ("<html><left>"
                + "This is text on the page."
                + "</left></html>", SwingConstants.CENTER);

        JButton button1 = new JButton("Force Update");
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
               // Checks for Updates, then Downloads and executes them

         String userHome = System.getProperty("user.home");

         try
     {
        long startTime = System.currentTimeMillis();

        System.out.println("Downloading...");

        URL url = new URL("https://dl.dropbox.com/s/18wwi5nwlznlz7j/Toolkit.jar?dl=1");
        url.openConnection();
        InputStream reader = url.openStream();
        FileOutputStream writer = new FileOutputStream(userHome + "/Downloads/Toolkit.jar");
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

        System.out.println("Download Complete.\nSaved to "
                + userHome
                + "/Downloads/Toolkit.jar\n"
                + (new Integer(totalBytesRead).toString())
                + " bytes read (" + (new Long(endTime - startTime).toString())
                + " millseconds).\n");
        writer.close();
        reader.close();
        Runtime.getRuntime().exec("java -jar " + userHome + "/Downloads/Toolkit.jar");
         System.out.println("Running Updated Applet...");
         System.exit(0);
     }
     catch (MalformedURLException d)
     {
        d.printStackTrace();
     }
     catch (IOException d)
     {
        d.printStackTrace();
     }
            }
        });

        JButton button2 = new JButton("Check Update");
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //Checks for updates via internet, then acts on status

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
             JOptionPane.showMessageDialog(null, "This version is up to date!");
            }

        else if(version < update){

             System.out.println("An update is available!\nDownloading now...");
             JOptionPane.showMessageDialog(null, "An update is available!");

         try
     {
        long startTimeUpdate = System.currentTimeMillis();

        System.out.println("Downloading...");

        URL urlUpdate = new URL("https://dl.dropbox.com/s/18wwi5nwlznlz7j/Toolkit.jar?dl=1");
        url.openConnection();
        InputStream readerUpdate = url.openStream();
        FileOutputStream writerUpdate = new FileOutputStream(userHome + "/Downloads/Toolkit.jar");
        byte[] bufferUpdate = new byte[153600];
        int totalBytesReadUpdate = 0;
        int bytesReadUpdate = 0;
        while ((bytesRead = reader.read(buffer)) > 0)
        {
           writerUpdate.write(bufferUpdate, 0, bytesRead);
           bufferUpdate = new byte[153600];
           totalBytesReadUpdate += bytesReadUpdate;
        }

        long endTimeUpdate = System.currentTimeMillis();

        System.out.println("Download Complete.\nSaved to "
                + userHome
                + "/Downloads/Toolkit.jar\n"
                + (new Integer(totalBytesReadUpdate).toString())
                + " bytes read (" + (new Long(endTimeUpdate - startTimeUpdate).toString())
                + " millseconds).\n");
        writer.close();
        reader.close();
        Runtime.getRuntime().exec("java -jar " + userHome + "/Downloads/Toolkit.jar");
         System.out.println("Running Updated Applet...");
         System.exit(0);
     }
     catch (MalformedURLException d)
     {
        d.printStackTrace();
     }
     catch (IOException d)
     {
        d.printStackTrace();
     }

            }

        else if(version > update){

             System.out.println("Back... TO THE FUTURE!!!!");
             JOptionPane.showMessageDialog(null, "ಠ_ಠ");
            }

        reader.close();
        updateFileSource.delete();
        System.out.println("Version code file deleted.");
     }
     catch (MalformedURLException t)
     {
     }
     catch (IOException r)
     {
     }
            }
        });



        JButton button3 = new JButton("Changes");
        button3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //action
            }
        });


        JButton button4 = new JButton("About");
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