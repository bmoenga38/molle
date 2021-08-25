package Invetory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteStock extends JFrame implements ActionListener {
    JLabel lblItemName;
    JTextField txtItemName;
    JButton btnDelete;

    GridBagConstraints c;
    GridBagLayout gbl;

    public DeleteStock(){
        super("Delete Stock");
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

        txtItemName = new JTextField();
        txtItemName.setFont(new Font("lucida calligraphy", Font.PLAIN, 22));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtItemName, c);

        btnDelete = new JButton("Delete Stock");
        btnDelete.addActionListener((ActionListener) this);
        btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 10, 10);
        add(btnDelete, c);


    setVisible(true);
    }

    public static void main(String[] args) {
        new DeleteStock();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
