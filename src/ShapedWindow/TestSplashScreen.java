package ShapedWindow;

import javax.swing.*;
import java.awt.*;

public class TestSplashScreen extends JWindow {
    JProgressBar bar;
    JLabel lbl;

    public TestSplashScreen(){
        createGUI();
        createProgressBar();
        initialiseProgress();

    }
    public void createGUI(){

        setSize(460,460);
        setLocationRelativeTo(null);
        setContentPane(new JLabel((new ImageIcon("Image/icon.png"))));
        setLayout(null);
        setVisible(true);
    }
    public void createProgressBar(){
        bar = new JProgressBar();
        lbl = new JLabel("Preparing a WorkSpace Load in a few minutes...");
        bar.setBorderPainted(true);
        bar.setStringPainted(true);
        bar.setValue(0);
        bar.setBackground(new Color(255,0,0));
        bar.setForeground( Color.MAGENTA);
        bar.setBounds(20,410,400,30);
        lbl.setBounds(20,380,400,40);
        lbl.setForeground(Color.BLUE);
        lbl.setFont(new Font("Times New Roman",Font.PLAIN,24));
        add(lbl);
        add(bar);
    }
    private void initialiseProgress() {
        int i = 100;
        while (i<=100){
            i+=1;
            bar.setValue(i);
            try {
                Thread.sleep(100);
                if (i ==100){
                    dispose();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new TestSplashScreen();
    }
}
