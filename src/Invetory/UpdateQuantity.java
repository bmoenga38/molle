package Invetory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateQuantity extends JFrame implements ActionListener {
    JLabel lblName,lblCQ,lblQnty;
    JTextField txtName,txtCQ,txtQnty;
    JButton btnUpdate;

    GridBagConstraints c;
    GridBagLayout gbl;

    public UpdateQuantity(){
        super("Update Quantity");
        setSize(560,700);
        getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        c = new GridBagConstraints();
        gbl = new GridBagLayout();
        setLayout(gbl);

        lblName = new JLabel("Item Name");
        lblName.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblName, c);

        txtName = new JTextField("Panadol");
        txtName.setFont(new Font("lucida calligraphy", Font.PLAIN, 22));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtName, c);

        lblCQ= new JLabel("Current Quantity");
        lblCQ.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblCQ, c);

        txtCQ = new JTextField();
        txtCQ.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtCQ, c);

        lblQnty= new JLabel("New Quantity");
        lblQnty.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblQnty, c);

        txtQnty = new JTextField();
        txtQnty.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 5;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtQnty, c);

        btnUpdate = new JButton("Update Stock");
        btnUpdate.addActionListener((ActionListener) this);
        btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 6;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(btnUpdate, c);

        setVisible(true);
    }


    public static void main(String[] args) {
        new UpdateQuantity();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
