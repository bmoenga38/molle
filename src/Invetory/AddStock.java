package Invetory;

import org.jvnet.substance.SubstanceLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* adding doesn't require a
* Statement pekee
* */

public class AddStock extends JFrame implements ActionListener{
    JLabel lblName,lblDetail,lblPrice,lblQnt,lblCompany,lblEXpD;
    JTextField txtName,txtDetail,txtPrice,txtQnt,txtCompany,txtEXpD;
    JButton btnAdd;

    GridBagConstraints c;
    GridBagLayout gbl;


    public AddStock(){

        super("Add Stock");
     try {
      UIManager.setLookAndFeel(new SubstanceLookAndFeel());
     } catch (UnsupportedLookAndFeelException e) {
      e.printStackTrace();
     }
     setSize(720,650);
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        gbl = new GridBagLayout();
        c = new GridBagConstraints();
        setLayout(gbl);

        lblName = new JLabel("Item Name");
        lblName.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblName, c);

        txtName = new JTextField();
        txtName.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtName, c);

        lblDetail = new JLabel("Item Details");
        lblDetail.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblDetail, c);

        txtDetail = new JTextField();
        txtDetail.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtDetail, c);

        lblPrice = new JLabel("Item Price");
        lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblPrice, c);

        txtPrice = new JTextField();
        txtPrice.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtPrice, c);

        lblQnt = new JLabel("Quantity");
        lblQnt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 3;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblQnt, c);

        txtQnt = new JTextField();
        txtQnt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 3;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtQnt, c);

        lblCompany = new JLabel("Company Name");
        lblCompany .setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblCompany , c);

        txtCompany  = new JTextField();
        txtCompany .setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 4;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtCompany , c);

        lblEXpD = new JLabel("Expiry Date");
        lblEXpD.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 5;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblEXpD , c);

        txtEXpD  = new JTextField();
        txtEXpD .setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 5;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtEXpD, c);

        btnAdd = new JButton("Add");
        btnAdd.addActionListener((ActionListener) this);
        btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 6;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(btnAdd, c);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AddStock();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnAdd){

        }
    }
}
