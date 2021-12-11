package Projects;

import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


    public class About extends JFrame implements ActionListener {

    JButton b1;
    About(){
        this.setBounds(600,200,700,600);
        this.setLayout((LayoutManager)null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Projects/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(400,90, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(150,40,400,80);
        add(l1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Projects/icons/notepad.jpg"));
        Image i5 = i4.getImage().getScaledInstance(50,90, 1);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(50,180,120,180);
        add(l2);

        JLabel l3 = new JLabel("<html>Notepad<br>Notepad word processing program.<br> </html>");
        l3.setBounds(150,130,500,300);
        l3.setFont(new Font ("SAN_SERIF", 0,10));
        add(l3);

        b1 = new JButton("ok");
        b1.setBounds(580,500,80,25);
        b1.addActionListener(this);
        add(b1);



    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }

}
