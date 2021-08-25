import Invetory.NewDrug;
import Invetory.SearchDrug;
import Invetory.UpdatePrice;
import ShapedWindow.InternalOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Home extends JFrame implements ActionListener {
    Dimension d;
    JMenuBar bar;
    JMenu file;
    JMenuItem newWin;
    JDesktopPane desk;
    Connection connect;
    private Object UpdatePrice;

    public Home(){
        super("Healthelic Pharmacy");
        d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d);
        setDefaultCloseOperation(3);
        //setContentPane(new JLabel(new ImageIcon("Image/1.jpg")));

        bar =  new JMenuBar();
        file = new JMenu("file");
        newWin = new JMenuItem("New Window");
        newWin.addActionListener(this);
        file.add(newWin);

        newWin = new JMenuItem("Search");
        newWin.addActionListener(this);
        file.add(newWin);

        bar.add(file);
        setJMenuBar(bar);

        desk = new JDesktopPane();

        add(desk);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Home();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== newWin){
            desk.add(new NewDrug(connect));
        }else if (e.getSource()== UpdatePrice){
            desk.add(new SearchDrug(connect));
        }
    }
}
