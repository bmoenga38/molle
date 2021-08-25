package Invetory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdatePrice extends JFrame implements ActionListener {
    JLabel lblItemName,lblCurrntPrc,lblNewPrc;
    JTextField txtItemName,txtCurrntPrc,txtNewPrc;
    JButton btnUpdatePrice;
    GridBagConstraints c;
    GridBagLayout gbl;


    public UpdatePrice(){

        super("Update Price");
        setSize(500,600);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        c = new GridBagConstraints();
        gbl = new GridBagLayout();
        setLayout(gbl);

        lblItemName = new JLabel("Item Name");
        lblItemName.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblItemName, c);

        txtItemName = new JTextField("Panadol");
        txtItemName.setFont(new Font("lucida calligraphy", Font.PLAIN, 22));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtItemName, c);

        lblCurrntPrc= new JLabel("Current Price");
        lblCurrntPrc.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblCurrntPrc, c);

        txtCurrntPrc = new JTextField();
        txtCurrntPrc.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtCurrntPrc, c);

        lblNewPrc= new JLabel("New Price");
        lblNewPrc.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblNewPrc, c);

        txtNewPrc = new JTextField();
        txtNewPrc.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtNewPrc, c);

        btnUpdatePrice = new JButton("Update Price");
        btnUpdatePrice.addActionListener((ActionListener) this);
        btnUpdatePrice.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(btnUpdatePrice, c);




        setVisible(true);
    }

    public static void main(String[] args) {
        new UpdatePrice();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
