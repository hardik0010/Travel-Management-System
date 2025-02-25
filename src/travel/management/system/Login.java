package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JButton login, signup, password;
    JTextField tfusername, tfpassword;
    
    Login() {

        setSize(900, 400);
        setTitle("Global Travel Guru: Innovating Your Adventures");
        setLocation(350, 200);
        setLayout(null);

        getContentPane().setBackground(new Color(0, 50,73));

        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bg.png"));
        Image b2 = b1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel img = new JLabel(b3);
        img.setBounds(0, 0, 900,400);
        add(img);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(340, 60, 100, 25);
        lblusername.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        lblusername.setForeground(new Color(0, 50, 73));
        img.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(340,100, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        tfusername.setBackground(new Color(210,213,221));
        tfusername.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        tfusername.setForeground(new Color(0, 50, 73));
        img.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(340, 150, 100, 25);
        lblpassword.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        lblpassword.setForeground(new Color(0, 50, 73));
        img.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(340,190, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        tfpassword.setBackground(new Color(210,213,221));
        tfpassword.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        tfpassword.setForeground(new Color(0, 50, 73));
        img.add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(340, 250, 130, 30);
        login.setFont(new Font("Arial", Font.BOLD, 15));
        login.setBackground(new Color(0, 50, 73));
        login.setForeground(new Color(210,213,221));
        login.setBorder(BorderFactory.createEmptyBorder());
        login.addActionListener(this);
        login.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                login.setCursor(new Cursor(Cursor.HAND_CURSOR));
                login.setFont(new Font("Arial", Font.BOLD, 18));
            }

            public void mouseExited(MouseEvent evt) {
                login.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                login.setFont(new Font("Arial", Font.BOLD, 15));
            }
        });
        img.add(login);
        
        signup = new JButton("Signup");
        signup.setBounds(510, 250, 130, 30);
        signup.setFont(new Font("Arial", Font.BOLD, 15));
        signup.setBackground(new Color(0, 50, 73));
        signup.setForeground(new Color(210,213,221));
        signup.setBorder(BorderFactory.createEmptyBorder());
        signup.addActionListener(this);
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signup.setCursor(new Cursor(Cursor.HAND_CURSOR));
                signup.setFont(new Font("Arial", Font.BOLD, 18));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                signup.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                signup.setFont(new Font("Arial", Font.BOLD, 15));
            }
        });
        img.add(signup);
        
        password = new JButton("Forgot Password");
        password.setBounds(410, 300, 170, 35);
        password.setFont(new Font("Arial", Font.BOLD, 15));
        password.setBackground(new Color(0, 50, 73));
        password.setForeground(new Color(210,213,221));
        password.setBorder(BorderFactory.createEmptyBorder());
        password.addActionListener(this);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                password.setCursor(new Cursor(Cursor.HAND_CURSOR));
                password.setFont(new Font("Arial", Font.BOLD, 18));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                password.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                password.setFont(new Font("Arial", Font.BOLD, 15));
            }
        });
        img.add(password);
        
        JLabel text = new JLabel("If getting any Trouble in Log-in..!");
        text. setBounds(400, 335, 190, 20);
        text.setForeground(Color.RED);
        img.add(text);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            try{
                String username = tfusername.getText();
                String pass = tfpassword.getText();
                
                String query = "select * from account where username = '"+username+"' AND password ='"+pass+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loading(username);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect username or Password");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == signup){
            setVisible(false);
            new Signup();
        }else{
            setVisible(false);
            new ForgetPassword();
        }
    }
    
    public static void main(String[] args) {
        Login l = new Login();
    }
}




