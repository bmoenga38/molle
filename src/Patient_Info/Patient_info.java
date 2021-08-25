package Patient_Info;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Patient_info extends JFrame {
    JPanel pan1, pan2, pan3,pan4, pan5;
    JButton btn,btn1,btn2,btn3,btn4,lblk,lbll,lblm;
    JLabel lbl,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11,
            lbla,lblb,lblc,lbld,lble,lblf,lblg,lblh,lbli,lblj;
    JTextField txt,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txta,txtb,txtc,txtd,
            txte,txtf,txtg,txth,txti,txtj,txtk,txtl,txtm;
    JMenu one,two,three,four;
    public Patient_info() {
        super("Client Information");
        setDefaultCloseOperation(3);
        setSize(1510,840);


        pan1 = new JPanel();
        pan1.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        //pan1.setBounds(10,10,1510,840);
        pan1.setLayout(null);
        pan1.setName("Patient info");


        pan2 = new JPanel();
        pan2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        pan2.setBounds(20,20,600,500);
        pan2.setLayout(null);

        lbl = new JLabel("Client ID");
        lbl.setBounds(10,10,100,70);

        lbl1 = new JLabel("Client Name");
        lbl1.setBounds(10,50,100,70);

        lbl2 = new JLabel("Gender");
        lbl2.setBounds(10,90,100,70);

        lbl3 = new JLabel("Signs and Symptoms");
        lbl3.setBounds(10,130,150,70);

        lbl4 = new JLabel("Disease");
        lbl4.setBounds(10,170,100,70);

        lbl5 = new JLabel("Purchase Date");
        lbl5.setBounds(10,210,100,70);

        lbl6 = new JLabel(" Teller Room");
        lbl6.setBounds(10,250,100,70);

        lbl7 = new JLabel("Rep ID");
        lbl7.setBounds(10,290,100,70);

        lbl8 = new JLabel("Rep Name");
        lbl8.setBounds(10,330,100,70);

        lbl9 = new JLabel("Discharge date");
        lbl9.setBounds(10,370,100,70);

        lbl10 = new JLabel("(YYYY-MM-DD)");
        lbl10.setBounds(500,230,250,30);

        lbl11 = new JLabel("(YYYY-MM-DD)");
        lbl11.setBounds(500,390,250,30);


        txt = new JTextField();
        txt.setBounds(150,30,250,30);

        txt1 = new JTextField();
        txt1.setBounds(150,70,250,30);

        txt2 = new JTextField();
        txt2.setBounds(150,110,250,30);

        txt3 = new JTextField();
        txt3.setBounds(180,150,250,30);

        txt4 = new JTextField();
        txt4.setBounds(150,190,250,30);

        txt5 = new JTextField();
        txt5.setBounds(150,230,250,30);

        txt6 = new JTextField();
        txt6.setBounds(150,270,250,30);

        txt7 = new JTextField();
        txt7.setBounds(150,310,250,30);

        txt8 = new JTextField();
        txt8.setBounds(150,350,250,30);

        txt9 = new JTextField();
        txt9.setBounds(150,390,250,30);


        //Adding labels
        pan2.add(lbl);pan2.add(lbl1);pan2.add(lbl2);pan2.add(lbl3);pan2.add(lbl4);pan2.add(lbl5);
        pan2.add(lbl6);pan2.add(lbl7);pan2.add(lbl8);pan2.add(lbl9);pan2.add(lbl10);pan2.add(lbl11);
        //Adding Text fields
        pan2.add(txt);pan2.add(txt1);pan2.add(txt2);pan2.add(txt3);pan2.add(txt4);pan2.add(txt5);pan2.add(txt6);pan2.add(txt7);
        pan2.add(txt8);pan2.add(txt9);

        pan3 = new JPanel();
        pan3.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        pan3.setBounds(700,50, 300, 300);
        pan3.setLayout(null);

        btn = new JButton("New");
        btn.setBounds(60,10,150,20);

        btn1 = new JButton("Save");
        btn1.setBounds(60,50,150,20);

        btn2 = new JButton("Delete");
        btn2.setBounds(60,90,150,20);

        btn3 = new JButton("Update");
        btn3.setBounds(60,130,150,20);

        btn4 = new JButton("GetData");
        btn4.setBounds(60,170,150,20);

        //adding buttons to the panel
        pan3.add(btn);pan3.add(btn1);pan3.add(btn2);pan3.add(btn3);
        pan3.add(btn4);



        pan4 = new JPanel();
        pan4.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        pan4.setBounds(1100,20,350,800);
        pan4.setLayout(null);

        lblk=new JButton("Client ID");
        lblk.setBounds(0,0,100,30);
        lbll=new JButton("Client N");
        lbll.setBounds(100,0,100,30);
        lblm=new JButton("Service C");
        lblm.setBounds(200,0,150,30);

        txtk=new JTextField();
        txtk.setBounds(0,30,100,30);
        txtl=new JTextField();
        txtl.setBounds(100,30,100,30);
        txtm=new JTextField();
        txtm.setBounds(200,30,150,30);

        //adding labels
        pan4.add(lblk);pan4.add(lbll);pan4.add(lblm);
        //adding text fields
        pan4.add(txtk);pan4.add(txtl);pan4.add(txtm);

        pan5 = new JPanel();
        pan5.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        pan5.setLayout(null);
        pan5.setBounds(20,550,1000,300);

        lbla=new JLabel("Teller Room Charges");
        lbla.setBounds(10,20,100,20);

        lblb=new JLabel("Service charges");
        lblb.setBounds(10,70,100,20);

        lblc=new JLabel("Payment Mode");
        lblc.setBounds(10,120,100,20);

        lbld=new JLabel("Payment Mode Details");
        lbld.setBounds(10,170,150,20);

        lble=new JLabel("Total Charges");
        lble.setBounds(10,220,100,20);

        lblf=new JLabel("No. Of Drugs");
        lblf.setBounds(200,20,100,20);

        lblg=new JLabel("Billing Date");
        lblg.setBounds(200,70,100,20);

        lblh=new JLabel("Total Room Charges");
        lblh.setBounds(600,20,200,20);

        lbli=new JLabel("Billing No");
        lbli.setBounds(300,220,100,20);

        lblj=new JLabel("(YYYY-MM-DD)");
        lblj.setBounds(550,70,100,20);






        txta=new JTextField();
        txta.setBounds(120,20,70,20);

        txtb=new JTextField();
        txtb.setBounds(120,70,70,20);

        txtc=new JTextField();
        txtc.setBounds(120,120,70,20);

        txtd=new JTextField();
        txtd.setBounds(180,170,500,20);

        txte=new JTextField();
        txte.setBounds(120,220,70,20);

        txtf=new JTextField();
        txtf.setBounds(300,20,100,20);

        txtg=new JTextField();
        txtg.setBounds(300,70,200,20);

        txth=new JTextField();
        txth.setBounds(740,20,100,20);

        txti=new JTextField();
        txti.setBounds(380,220,300,20);


        //adding labels
        pan5.add(lbla);
        pan5.add(lblb);pan5.add(lblc);pan5.add(lbld);pan5.add(lble);pan5.add(lblf);
        pan5.add(lblg);pan5.add(lblh);pan5.add(lbli);pan5.add(lblj);
        //ADDING TEXT FIELDS
        pan5.add(txta);pan5.add(txtb);pan5.add(txtc);pan5.add(txtd);pan5.add(txte);pan5.add(txtf);
        pan5.add(txtg);pan5.add(txth);pan5.add(txti);

        add(pan1);
        pan1.add(pan2);
        pan1.add(pan3);
        pan1.add(pan5);
        pan1.add(pan4);


        setVisible(true);

    }

    public static void main(String[] args) {

        new Patient_info();
    }

}
