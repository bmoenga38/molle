package ShapedWindow;

import javax.swing.*;
import java.awt.*;

public class InternalOne extends JInternalFrame {
    JLabel lblFName,lblLName;
    JButton Upload;
    GridBagLayout gbl;
    GridBagConstraints c;


    public InternalOne(){
        super("New Drugs",true,true,true,true);
        setBounds(500,300,500,500);
        getContentPane().setBackground(Color.blue);
        setLayout(gbl);

        lblFName = new JLabel("Drug ID");
        lblFName.setFont(new Font("Tahoma",Font.PLAIN,30));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10,10,10,10);


    }
}
