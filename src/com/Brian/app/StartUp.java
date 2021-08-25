package com.Brian.app;


import org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel;

import javax.swing.*;
import java.awt.*;

public class StartUp extends JWindow  {
    JProgressBar bar;
    JLabel lbl;

    public StartUp (){

        createGUI();
        createProgressBar();
        initiateProgress();
    }

    public void createGUI(){
        try {
            UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setSize(450,450);
        setLocationRelativeTo(null);
        setContentPane(new JLabel((new ImageIcon("Image/chemist.png"))));
        setLayout(null);

        setVisible(true);

    }
        public void createProgressBar(){
            bar = new JProgressBar();
            lbl = new JLabel("Preparing for a workspace...");
            bar.setBorderPainted(true);
            bar.setStringPainted(true);
            bar.setValue(0);
            bar.setBackground(new Color(0,0,128));
            bar.setForeground(Color.YELLOW);
            bar.setBounds(20,410,400,30);
            lbl.setBounds(20,380,400,40);
            lbl.setForeground(Color.WHITE);
            lbl.setFont(new Font("Times New Roman",Font.PLAIN,20));
            add(lbl);
            add(bar);
        }

    private void initiateProgress() {
        int i =0;
        while (i<=100){
            i+= 1;
            bar.setValue(i);
            try {
                Thread.sleep(100);
                if (i ==100) {
                    dispose();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new StartUp();
    }

}
