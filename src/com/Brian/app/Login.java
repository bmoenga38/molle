package com.Brian.app;

import org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Login extends JFrame implements KeyListener {
    JLabel lblImg;
    JTextField txtUser;
    JPasswordField txtPass;
    Connection con;

    public Login(){
        try {
            UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setUndecorated(true);
        setExtendedState(MAXIMIZED_BOTH);
        setContentPane(new JLabel(new ImageIcon("Image/shirakawa.jpg")));
        setLayout(null);


        lblImg = new JLabel(new ImageIcon("Image/icon1.jpg"));
        lblImg.setBounds(740,270,240,220);

        add(lblImg);

        txtUser = new JTextField();
        txtUser.setToolTipText("Enter Your UserName here");
        txtUser.setBounds(740,500,240,30);
        add(txtUser);


        txtPass = new JPasswordField();
        txtPass.setToolTipText("Enter Your Password here");
        txtPass.setBounds(740,560,240,30);
        txtPass.addKeyListener(this);
        add(txtPass);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        String User = txtUser.getText();
        String pass = String.valueOf(txtPass.getPassword());
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Healthelic_pharmacy",User,pass);
                    JOptionPane.showMessageDialog(null, "Logged in");
                    dispose();


                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
 }

