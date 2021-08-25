package Invetory;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Customer extends JFrame{
    JPanel panMain,pan1,pan2,pan3,pan4;
    JLabel lblId,lblFName,lblLName,lblGender,lblEmpId,lblEmpName,lblDate;
    JTextField txtId,txtFName,txtLName,txtGender,txtEmpId,txtEmpName,txtDate;
    JButton btnew,btsave;
    GridBagLayout gbl;
    GridBagConstraints c;
    Border b;

    public Customer() {
        setDefaultCloseOperation(3);
        setSize(840,600);
        gbl = new GridBagLayout();
        c = new GridBagConstraints();

        panMain=new JPanel();
        panMain.setLayout(null);


        pan1=new JPanel();
        pan1.setBounds(5, 5, 300, 590);
        pan1.setLayout(gbl);
        pan1.setBorder(BorderFactory.createTitledBorder(b, "Details", TitledBorder.CENTER, TitledBorder.TOP, new Font("Monotype Corsiva", Font.PLAIN, 25), Color.blue));

        pan2=new JPanel();
        pan2.setLayout(null);
        pan2.setBounds(310, 200, 100, 300);

        pan3=new JPanel();
        pan3.setBounds(415, 5, 200, 590);
        pan3.setBorder(BorderFactory.createTitledBorder(b, "Customer Deatils", TitledBorder.CENTER, TitledBorder.TOP, new Font("Monotype Corsiva", Font.PLAIN, 25), Color.blue));
        pan4=new JPanel();
        pan4.setBounds(620, 5, 200, 590);
        pan4.setBorder(BorderFactory.createTitledBorder(b, "Employee Details", TitledBorder.CENTER, TitledBorder.TOP, new Font("Monotype Corsiva", Font.PLAIN, 25), Color.blue));

        lblId=new JLabel("CustomerId");
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(lblId,c);

        txtId=new JTextField(10);
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(txtId,c);

        lblFName=new JLabel("First Name");
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(lblFName,c);
        txtFName=new JTextField();
        txtFName.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(txtFName,c);

        lblLName=new JLabel("Last Name");
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(lblLName,c);
        txtLName=new JTextField();
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(txtLName,c);

        lblGender=new JLabel("Gender");
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 3;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(lblGender,c);
        txtGender=new JTextField();
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(txtGender,c);

        lblEmpId=new JLabel("Employee Id");
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(lblEmpId,c);
        txtEmpId=new JTextField();
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 4;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(txtEmpId,c);

        lblEmpName=new JLabel("Employee Name");
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 5;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(lblEmpName,c);
        txtEmpName=new JTextField();
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 5;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(txtEmpName,c);

        lblDate=new JLabel("Date");
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 6;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(lblDate,c);
        txtDate=new JTextField();
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 6;
        c.insets = new Insets(10, 10, 10, 10);
        pan1.add(txtDate,c);

        btnew=new JButton("New");
        btnew.setBounds(3, 3, 80, 20);
        btsave=new JButton("Save");
        btsave.setBounds(3, 30, 80, 20);

        pan2.add(btnew);
        pan2.add(btsave);

        panMain.add(pan1);panMain.add(pan2);panMain.add(pan3);panMain.add(pan4);

        add(panMain);

        setVisible(true);
    }
    public static void main(String [] args) {
        new Customer();
    }

}
