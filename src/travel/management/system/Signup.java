package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    
    JButton create, back;
    JTextField tfname, tfusername, tfpassword, tfanswer;
    JComboBox security;   
    
    Signup(){
        
        setBounds(350,200,900,430);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);       
        
        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("Icons/signupbg.png"));
        Image b2 = b1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel img = new JLabel(b3);
        img.setBounds(0, 0, 900,400);
        add(img);
        
        JLabel lblusername = new JLabel("Username :");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblusername.setBounds(50,50,125,25);
        lblusername.setForeground(new Color(147,183,190));
        img.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(190,50,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        tfusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        tfusername.setBackground(new Color(147,183,190));
        tfusername.setForeground(Color.BLACK);
        img.add(tfusername);
        
        JLabel lblname = new JLabel("Name :");
        lblname.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblname.setBounds(50,90,125,25);
        lblname.setForeground(new Color(147,183,190));
        img.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(190,90,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        tfname.setFont(new Font("Tahoma", Font.BOLD, 14));
        tfname.setBackground(new Color(147,183,190));
        tfname.setForeground(Color.BLACK);
        img.add(tfname);

        
        JLabel lblpassword = new JLabel("Password :");
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblpassword.setBounds(50,140,125,25);
        lblpassword.setForeground(new Color(147,183,190));
        img.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(190,140,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        tfpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        tfpassword.setBackground(new Color(147,183,190));
        tfpassword.setForeground(Color.BLACK);
        img.add(tfpassword);
        
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblsecurity.setBounds(50,180,125,27);
        lblsecurity.setForeground(new Color(147,183,190));
        img.add(lblsecurity);
        
        security = new JComboBox(new String[] { "Your Lucky number", "Your Best Friend name"});
        security.setFont(new Font("Raleway",Font.BOLD,14));
        security.setBounds(190,180,180,25);
        security.setBackground(new Color(147,183,190));
        security.setForeground(Color.BLACK);
        img.add(security);
        
//        security = new Choice();
//        security.add("Fav Character from the Boys");
//        security.add("Fav Character from the Boys");
//        security.add("Your Lucky number");
//        security.add("Your childhood superhero");
//        
//        
//        
////        security.addActionListener(this);
        security.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                security.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                security.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        img.add(security);
        
        JLabel lblanswer = new JLabel("Answer :");
        lblanswer.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblanswer.setBounds(50,220,125,25);
        lblanswer.setForeground(new Color(147,183,190));
        img.add(lblanswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(190,220,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        tfanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        tfanswer.setBackground(new Color(147,183,190));
        img.add(tfanswer);
        
        create = new JButton("Create");
        create.setBackground(new Color(147,183,190));
        create.setForeground(Color.BLACK);
        create.setFont(new Font("Tahoma", Font.BOLD, 17));
        create.setBounds(80,290,100,30);
        create.addActionListener(this);
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                create.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        img.add(create);
        
        
        back = new JButton("Back");
        back.setBackground(new Color(147,183,190));
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.BOLD, 17));
        back.setBounds(250,290,100,30);
        back.addActionListener(this);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        img.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == create){
            String username = tfusername.getText();
            String name= tfname.getText();
            String password = tfpassword.getText();
            String question = (String)security.getSelectedItem();
            String answer = tfanswer.getText();
            
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Account created Successfully");
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Signup();
    }
}
