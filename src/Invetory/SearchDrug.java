package Invetory;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Searching a drug require a RS Execute query
 * */
public class SearchDrug extends JFrame implements ActionListener {

    JLabel lblID, lblName, lblSupID, lblCatID, lblQuantity, lblUPrice, lblStock;
    JTextField txtID, txtName, txtSupID, txtCatID, txtQuantity, txtUPrice, txtStock;
    JButton btnSearch;
    GridBagLayout gbl;
    GridBagConstraints c;

    Connection con;
    Statement st;
    ResultSet rs;

    public SearchDrug(Connection cn) {
        super("Search For Drugs"/*, true, true, true, true*/);
        this.con = cn;

        setBounds(200, 100, 600, 500);
        setContentPane(new JLabel(new ImageIcon("Image/Hosi1.jpg")));
        gbl = new GridBagLayout();
        c = new GridBagConstraints();

        setLayout(gbl);

        lblID = new JLabel("Drug ID");
        lblID.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill  = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10,10,10,10);
        add(lblID,c);

        txtID = new JTextField();
        txtID.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 2.5;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtID, c);

        lblName = new JLabel("Drug Name");
        lblName.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblName, c);

        txtName = new JTextField();
        txtName.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtName, c);

        lblSupID = new JLabel("Supplier ID");
        lblSupID.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblSupID, c);

        txtSupID = new JTextField();
        txtSupID.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtSupID, c);

        lblCatID = new JLabel("Category ID");
        lblCatID.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 3;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblCatID, c);

        txtCatID = new JTextField();
        txtCatID.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtCatID, c);

        lblQuantity = new JLabel("Quantity per unit");
        lblQuantity.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblQuantity, c);

        txtQuantity = new JTextField();
        txtQuantity.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 4;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtQuantity, c);


        lblUPrice = new JLabel("Unit price");
        lblUPrice.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 5;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblUPrice, c);

        txtUPrice = new JTextField();
        txtUPrice.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 5;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtUPrice, c);

        lblStock = new JLabel("Units in stock");
        lblStock.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 6;
        c.insets = new Insets(10, 10, 10, 10);
        add(lblStock, c);

        txtStock = new JTextField();
        txtStock.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 6;
        c.insets = new Insets(10, 10, 10, 10);
        add(txtStock, c);

        btnSearch = new JButton("     Search     ");
        btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btnSearch.addActionListener(this);
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 7;
        c.insets = new Insets(10, 10, 10, 10);
        add(btnSearch, c);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String id = txtID.getText();
        if (e.getSource() == btnSearch){
          try {
              st = con.createStatement();
              String s = "select * from products where Product_ID = '"+id+"' ";
              rs = st.executeQuery(s);

              while (rs.next()){
                  txtName.setText(rs.getString(2));
                  txtSupID.setText(rs.getString(3));
                  txtCatID.setText(rs.getString(4));
                  txtQuantity.setText(rs.getString(5));
                  txtUPrice.setText(rs.getString(6));
                  txtStock.setText(rs.getString(7));
              }

          } catch (SQLException throwables) {
              throwables.printStackTrace();
          }
        }

    }
}
