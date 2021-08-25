package Invetory;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class NewDrug extends JInternalFrame implements ActionListener {

	/*
	 *
	 * mysql> desc products;
+-------------------+--------------+------+-----+---------+-------+
| Field             | Type         | Null | Key | Default | Extra |
+-------------------+--------------+------+-----+---------+-------+
| Product_ID        | varchar(20)  | NO   | PRI |         |       |
| Product_Name      | varchar(100) | YES  |     | NULL    |       |
| Supplier_ID       | varchar(20)  | YES  | MUL | NULL    |       |
| Category_ID       | varchar(20)  | YES  | MUL | NULL    |       |
| Quantity_Per_Unit | varchar(100) | YES  |     | NULL    |       |
| Unit_Price        | double       | YES  |     | NULL    |       |
| Units_in_stock    | varchar(100) | YES  |     | NULL    |       |
+-------------------+--------------+------+-----+---------+-------+
	 */

    JLabel lblID, lblName, lblSupID, lblCatID, lblQuantity, lblUPrice, lblStock;
    JButton btnUpload;
    JTextField txtID, txtName, txtSupID, txtCatID, txtQuantity, txtUPrice, txtStock;

    GridBagLayout gbl;
    GridBagConstraints c;

    Connection con;
    Statement st;

    public NewDrug(Connection cn) {
        super("New Drugs", true, true, true, true);

        this.con = cn;

        setBounds(200, 100, 600, 500);
        setContentPane(new JLabel(new ImageIcon("images/capsule.pill.health.medicine (1).jpg")));

        gbl = new GridBagLayout();
        c = new GridBagConstraints();

        setLayout(gbl);

        lblID = new JLabel("Drug ID");
        lblID.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblID, c);

        txtID = new JTextField();
        txtID.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 2.5;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtID, c);

        lblName = new JLabel("Drug Name");
        lblName.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblName, c);

        txtName = new JTextField();
        txtName.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtName, c);

        lblSupID = new JLabel("Supplier ID");
        lblSupID.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblSupID, c);

        txtSupID = new JTextField();
        txtSupID.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtSupID, c);

        lblCatID = new JLabel("Category ID");
        lblCatID.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 3;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblCatID, c);

        txtCatID = new JTextField();
        txtCatID.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtCatID, c);



        lblQuantity = new JLabel("Quantity per unit");
        lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblQuantity, c);

        txtQuantity = new JTextField();
        txtQuantity.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 4;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtQuantity, c);


        lblUPrice = new JLabel("Unit price");
        lblUPrice.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 5;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblUPrice, c);

        txtUPrice = new JTextField();
        txtUPrice.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 5;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtUPrice, c);

        lblStock = new JLabel("Units in stock");
        lblStock.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 6;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblStock, c);

        txtStock = new JTextField();
        txtStock.setFont(new Font("Tahoma", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 6;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtStock, c);

        btnUpload = new JButton("     Upload     ");
        btnUpload.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnUpload.addActionListener(this);
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 7;
        c.insets = new Insets(10, 10, 10, 10);
        add(btnUpload, c);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String id = txtID.getText();
        String n = txtName.getText();
        String sup = txtSupID.getText();
        String cat = txtCatID.getText();
        String q = txtQuantity.getText();
        String price = txtUPrice.getText();
        String s = txtStock.getText();



        if(e.getSource() == btnUpload){

            try {

                st = con.createStatement();

                String add = "insert into products values('"+id+"', '"+n+"', '"+sup+"', '"+cat+"', '"+q+"', '"+price+"', '"+s+"')";

                int r = st.executeUpdate(add);

                JOptionPane.showMessageDialog(null, r + " record added");

                txtID.setText("");
                txtName.setText("");
                txtSupID.setText("");
                txtCatID.setText("");
                txtQuantity.setText("");
                txtUPrice.setText("");
                txtStock.setText("");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        }

    }

}

