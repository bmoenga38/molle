package ShapedWindow;

import javax.swing.*;

public class TransparentWindow extends JFrame {

    TransparentWindow(){
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        add(new JButton("iam a button"));
        // o- transparent
        // 1- Opaque

        setOpacity(0.522f);
        add(new JLabel(new ImageIcon("css.png")));
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TransparentWindow().setVisible(true);
            }
        });

    }
}
