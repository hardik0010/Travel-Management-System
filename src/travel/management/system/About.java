package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    
    JButton back;
    
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);
        
        String s = "Welcome to the Travel Management System\n\n"
        + "Our Travel Management System is designed to make your travel planning and booking process as smooth and efficient as possible. Whether you are planning a vacation, a business trip, or any other journey, we've got you covered.\n\n"
        + "Key Features:\n"
        + "1. User-Friendly Interface: Our intuitive interface makes it easy for you to search for, compare, and book flights, hotels, and transportation options.\n"
        + "2. Extensive Travel Options: We offer a wide range of options for destinations, airlines, hotels, and transportation, ensuring you find the best choices that suit your needs and preferences.\n"
        + "3. Secure Payment: Rest assured that your payment details are safe and secure when making bookings through our platform.\n"
        + "4. Customer Support: Our dedicated customer support team is available to assist you with any queries or issues throughout your journey.\n"
        + "5. Personalized Experience: Create an account to save your travel preferences and receive personalized recommendations for your trips.\n"
        + "6. Stay Updated: Get real-time updates on your travel itinerary, including flight status, hotel reservations, and more.\n\n"
        + "Thank you for choosing our Travel Management System. We look forward to helping you plan and enjoy your travels to the fullest. Bon voyage!";
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        back = new JButton("BACK");
        back.setBackground(new Color(0, 46, 110));
        back.setForeground(new Color(0, 185, 241));
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                back.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new About();
    }
}
