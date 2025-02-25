package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener{
    
    JButton back;
    
    Paytm() {
        setTitle("Paytm Rent Payment");
        setBounds(500, 200, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try {
            pane.setPage("https://paytm.com/rent-payment");
        } catch (IOException e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error: " + e.getMessage() + "</html>");
        }
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp, BorderLayout.CENTER);

        back = new JButton("BACK");
        back.setBackground(new Color(0, 46, 110));
        back.setForeground(new Color(0, 185, 241));
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        pane.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Paytm());
    }
}

