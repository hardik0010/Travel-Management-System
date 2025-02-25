package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener{
    
    JLabel labelusername, labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphone, tfid, tfgender;
    JRadioButton rmale, rfemale;
    JButton add, back;
   
    UpdateCustomer(String username){
        
        setBounds(500,200,850,550);
        setTitle("Global Travel Guru: Innovating Your Adventures");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(430,10,300,25);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/mbg.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,850,550);
        add(image);
        
        JLabel lblusername = new JLabel("Username :");
        lblusername.setBounds(430,50,150,25);
        lblusername.setForeground(Color.BLACK);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(630,50,150,25);
        labelusername.setFont(new Font("Tahoma", Font.BOLD, 17));
        labelusername.setForeground(Color.BLACK);
        image.add(labelusername);
        
        JLabel lblid = new JLabel("ID :");
        lblid.setBounds(430,90,150,25);
        lblid.setForeground(Color.BLACK);
        lblid.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(lblid);
        
        tfid = new JTextField();
        tfid.setBounds(630,90,150,25);
        tfid.setBackground(new Color(176,202,210));
        tfid.setFont(new Font("Raleway",Font.BOLD,14));
        image.add(tfid);
        
        JLabel lblnumber = new JLabel("Number :");
        lblnumber.setBounds(430,130,150,25);
        lblnumber.setForeground(Color.BLACK);
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(lblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(630,130,150,25);
        tfnumber.setBackground(new Color(176,202,210));
        tfnumber.setFont(new Font("Raleway",Font.BOLD,14));
        image.add(tfnumber);
        
        JLabel lblname = new JLabel("Name :");
        lblname.setBounds(430,170,150,25);
        lblname.setForeground(Color.BLACK);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(630,170,150,25);
        labelname.setForeground(Color.BLACK);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(labelname);
        
        JLabel lblgender = new JLabel("Gender :");
        lblgender.setBounds(430,210,150,25);
        lblgender.setForeground(Color.BLACK);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(lblgender);
        
        tfgender = new JTextField();
        tfgender.setBounds(630,210,150,25);
        tfgender.setBackground(new Color(176,202,210));
        image.add(tfgender);
        
        JLabel lblcountry = new JLabel("Country:");
        lblcountry.setBounds(430,250,150,25);
        lblcountry.setForeground(Color.BLACK);
        lblcountry.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(630,250,150,25);
        tfcountry.setBackground(new Color(176,202,210));
        image.add(tfcountry);
        
        JLabel lbladdress = new JLabel("Address :");
        lbladdress.setBounds(430,290,150,25);
        lbladdress.setForeground(Color.BLACK);
        lbladdress.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(630,290,150,25);
        tfaddress.setBackground(new Color(176,202,210));
        image.add(tfaddress);
        
        JLabel lblphone = new JLabel("Phone :");
        lblphone.setBounds(430,330,150,25);
        lblphone.setForeground(Color.BLACK);
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(630,330,150,25);
        tfphone.setBackground(new Color(176,202,210));
        image.add(tfphone);
        
        JLabel lblemail = new JLabel("Email :");
        lblemail.setBounds(430,370,150,25);
        lblemail.setForeground(Color.BLACK);
        lblemail.setFont(new Font("Tahoma", Font.BOLD, 17));
        image.add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(630,370,150,25);
        tfemail.setBackground(new Color(176,202,210));
        image.add(tfemail);
        
        add = new JButton("UPDATE");
        add.setBackground(new Color(176,202,210));
        add.setForeground(Color.BLACK);
        add.setBounds(630,435,100,25);
        add.addActionListener(this);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                add.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        image.add(add);
        
        back = new JButton("BACK");
        back.setBackground(new Color(176,202,210));
        back.setForeground(Color.BLACK);
        back.setBounds(430,435,100,25);
        back.addActionListener(this);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        image.add(back);
        
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String username = labelusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            
            try{
                Conn c = new Conn();
                String query = "update customer set username = '"+username+"', id = '"+id+"',number = '"+number+"', name = '"+name+"',gender = '"+gender+"', country = '"+country+"',address = '"+address+"',phone = '"+phone+"',email = '"+email+"'";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Details Updated SuccessFully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new UpdateCustomer("");
    }
}

