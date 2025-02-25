package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    
    JButton pay, back;
    
    Payment(){
        setBounds(500,200,800,600);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0,0,800,600);
        add(Image);
        
        pay = new JButton("PAY");
        pay.setBackground(new Color(0, 46, 110));
        pay.setForeground(new Color(0, 185, 241));
        pay.setBounds(420,0,80,40);
        pay.addActionListener(this);
        pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pay.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                pay.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        Image.add(pay);
        
        back = new JButton("BACK");
        back.setBackground(new Color(0, 46, 110));
        back.setForeground(new Color(0, 185, 241));
        back.setBounds(520,0,80,40);
        back.addActionListener(this);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        Image.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == pay){
            setVisible(false);
            new Paytm();
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new Payment();
    }
}
