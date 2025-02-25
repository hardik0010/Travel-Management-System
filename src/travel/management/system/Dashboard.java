package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JButton deletePersonalDetails, about, calculator, addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackages, bookpackage, viewpackage, viewhotels, destinations, bookhotel, viewbookedhotel, payments, exit;
    
    String username;
    Dashboard(String username){
        
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Global Travel Guru: Innovating Your Adventures");
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(27,27,30));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(55,63,81));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addPersonalDetails = new  JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(55,63,81));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.setBorder(new LineBorder((Color.WHITE), 2));
        addPersonalDetails.addActionListener(this);
        addPersonalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPersonalDetails.setCursor(new Cursor(Cursor.HAND_CURSOR));
                addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 25));
                addPersonalDetails.setBackground(new Color(27,27,30));
                addPersonalDetails.setForeground(Color.WHITE);
                addPersonalDetails.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPersonalDetails.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
                addPersonalDetails.setBackground(new Color(55,63,81));
                addPersonalDetails.setForeground(Color.WHITE);
                addPersonalDetails.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new  JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(55,63,81));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.setBorder(new LineBorder((Color.WHITE), 2));
        updatePersonalDetails.addActionListener(this);
        updatePersonalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatePersonalDetails.setCursor(new Cursor(Cursor.HAND_CURSOR));
                updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 25));
                updatePersonalDetails.setBackground(new Color(27,27,30));
                updatePersonalDetails.setForeground(Color.WHITE);
                updatePersonalDetails.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatePersonalDetails.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
                updatePersonalDetails.setBackground(new Color(55,63,81));
                updatePersonalDetails.setForeground(Color.WHITE);
                updatePersonalDetails.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new  JButton("View Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(55,63,81));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.setBorder(new LineBorder((Color.WHITE), 2));
        viewPersonalDetails.addActionListener(this);
        viewPersonalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewPersonalDetails.setCursor(new Cursor(Cursor.HAND_CURSOR));
                viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 25));
                viewPersonalDetails.setBackground(new Color(27,27,30));
                viewPersonalDetails.setForeground(Color.WHITE);
                viewPersonalDetails.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewPersonalDetails.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
                viewPersonalDetails.setBackground(new Color(55,63,81));
                viewPersonalDetails.setForeground(Color.WHITE);
                viewPersonalDetails.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new  JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(55,63,81));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.setBorder(new LineBorder((Color.WHITE), 2));
        deletePersonalDetails.addActionListener(this);
        deletePersonalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletePersonalDetails.setCursor(new Cursor(Cursor.HAND_CURSOR));
                deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 25));
                deletePersonalDetails.setBackground(new Color(27,27,30));
                deletePersonalDetails.setForeground(Color.WHITE);
                deletePersonalDetails.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletePersonalDetails.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
                deletePersonalDetails.setBackground(new Color(55,63,81));
                deletePersonalDetails.setForeground(Color.WHITE);
                deletePersonalDetails.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(deletePersonalDetails);
        
        checkpackages = new  JButton("Check Packages");
        checkpackages.setBounds(0,200,300,50);
        checkpackages.setBackground(new Color(55,63,81));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0,0,0,100));
        checkpackages.setBorder(new LineBorder((Color.WHITE), 2));
        checkpackages.addActionListener(this);
        checkpackages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkpackages.setCursor(new Cursor(Cursor.HAND_CURSOR));
                checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 25));
                checkpackages.setBackground(new Color(27,27,30));
                checkpackages.setForeground(Color.WHITE);
                checkpackages.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkpackages.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
                checkpackages.setBackground(new Color(55,63,81));
                checkpackages.setForeground(Color.WHITE);
                checkpackages.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(checkpackages);
        
        bookpackage = new  JButton("Book Package");
        bookpackage.setBounds(0,250,300,50);
        bookpackage.setBackground(new Color(55,63,81));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.setBorder(new LineBorder((Color.WHITE), 2));
        bookpackage.addActionListener(this);
        bookpackage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookpackage.setCursor(new Cursor(Cursor.HAND_CURSOR));
                bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 25));
                bookpackage.setBackground(new Color(27,27,30));
                bookpackage.setForeground(Color.WHITE);
                bookpackage.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookpackage.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
                bookpackage.setBackground(new Color(55,63,81));
                bookpackage.setForeground(Color.WHITE);
                bookpackage.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(bookpackage);
        
        viewpackage = new  JButton("View Package");
        viewpackage.setBounds(0,300,300,50);
        viewpackage.setBackground(new Color(55,63,81));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.setBorder(new LineBorder((Color.WHITE), 2));
        viewpackage.addActionListener(this);
        viewpackage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewpackage.setCursor(new Cursor(Cursor.HAND_CURSOR));
                viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 25));
                viewpackage.setBackground(new Color(27,27,30));
                viewpackage.setForeground(Color.WHITE);
                viewpackage.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewpackage.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
                viewpackage.setBackground(new Color(55,63,81));
                viewpackage.setForeground(Color.WHITE);
                viewpackage.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(viewpackage);
        
        viewhotels = new  JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(55,63,81));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0,0,0,135));
        viewhotels.setBorder(new LineBorder((Color.WHITE), 2));
        viewhotels.addActionListener(this);
        viewhotels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewhotels.setCursor(new Cursor(Cursor.HAND_CURSOR));
                viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 25));
                viewhotels.setBackground(new Color(27,27,30));
                viewhotels.setForeground(Color.WHITE);
                viewhotels.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewhotels.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
                viewhotels.setBackground(new Color(55,63,81));
                viewhotels.setForeground(Color.WHITE);
                viewhotels.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(viewhotels);
        
        bookhotel = new  JButton("Book Hotel");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(55,63,81));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.setBorder(new LineBorder((Color.WHITE), 2));
        bookhotel.addActionListener(this);
        bookhotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookhotel.setCursor(new Cursor(Cursor.HAND_CURSOR));
                bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 25));
                bookhotel.setBackground(new Color(27,27,30));
                bookhotel.setForeground(Color.WHITE);
                bookhotel.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookhotel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
                bookhotel.setBackground(new Color(55,63,81));
                bookhotel.setForeground(Color.WHITE);
                bookhotel.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(bookhotel);
        
        
        viewbookedhotel = new  JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,450,300,50);
        viewbookedhotel.setBackground(new Color(55,63,81));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        viewbookedhotel.setBorder(new LineBorder((Color.WHITE), 2));
        viewbookedhotel.addActionListener(this);
        viewbookedhotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewbookedhotel.setCursor(new Cursor(Cursor.HAND_CURSOR));
                viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 25));
                viewbookedhotel.setBackground(new Color(27,27,30));
                viewbookedhotel.setForeground(Color.WHITE);
                viewbookedhotel.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewbookedhotel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
                viewbookedhotel.setBackground(new Color(55,63,81));
                viewbookedhotel.setForeground(Color.WHITE);
                viewbookedhotel.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(viewbookedhotel);
        
        destinations = new  JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(55,63,81));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.setBorder(new LineBorder((Color.WHITE), 2));
        destinations.addActionListener(this);
        destinations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                destinations.setCursor(new Cursor(Cursor.HAND_CURSOR));
                destinations.setFont(new Font("Tahoma", Font.PLAIN, 25));
                destinations.setBackground(new Color(27,27,30));
                destinations.setForeground(Color.WHITE);
                destinations.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                destinations.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
                destinations.setBackground(new Color(55,63,81));
                destinations.setForeground(Color.WHITE);
                destinations.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(destinations);
        
        payments = new  JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(55,63,81));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.setBorder(new LineBorder((Color.WHITE), 2));
        payments.addActionListener(this);
        payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                payments.setCursor(new Cursor(Cursor.HAND_CURSOR));
                payments.setFont(new Font("Tahoma", Font.PLAIN, 25));
                payments.setBackground(new Color(27,27,30));
                payments.setForeground(Color.WHITE);
                payments.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                payments.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
                payments.setBackground(new Color(55,63,81));
                payments.setForeground(Color.WHITE);
                payments.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(payments);
        
        calculator = new  JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(55,63,81));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0,0,0,155));
        calculator.setBorder(new LineBorder((Color.WHITE), 2));
        calculator.addActionListener(this);
        calculator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculator.setCursor(new Cursor(Cursor.HAND_CURSOR));
                calculator.setFont(new Font("Tahoma", Font.PLAIN, 25));
                calculator.setBackground(new Color(27,27,30));
                calculator.setForeground(Color.WHITE);
                calculator.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculator.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
                calculator.setBackground(new Color(55,63,81));
                calculator.setForeground(Color.WHITE);
                calculator.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(calculator);
        
        about = new  JButton("About");
        about.setBounds(0,650,300,50);
        about.setBackground(new Color(55,63,81));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0,0,0,180));
        about.setBorder(new LineBorder((Color.WHITE), 2));
        about.addActionListener(this);
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                about.setCursor(new Cursor(Cursor.HAND_CURSOR));
                about.setFont(new Font("Tahoma", Font.PLAIN, 25));
                about.setBackground(new Color(27,27,30));
                about.setForeground(Color.WHITE);
                about.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                about.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                about.setFont(new Font("Tahoma", Font.PLAIN, 20));
                about.setBackground(new Color(55,63,81));
                about.setForeground(Color.WHITE);
                about.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(about);
        
        exit = new  JButton("EXIT");
        exit.setBounds(0,700,300,50);
        exit.setBackground(new Color(55,63,81));
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        exit.setMargin(new Insets(0,0,0,180));
        exit.setBorder(new LineBorder((Color.WHITE), 2));
        exit.addActionListener(this);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
                exit.setFont(new Font("Tahoma", Font.PLAIN, 25));
                exit.setBackground(new Color(27,27,30));
                exit.setForeground(Color.WHITE);
                exit.setBorder(new LineBorder(new Color(55,63,81), 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                exit.setFont(new Font("Tahoma", Font.PLAIN, 20));
                exit.setBackground(new Color(55,63,81));
                exit.setForeground(Color.WHITE);
                exit.setBorder(new LineBorder((Color.WHITE), 2));
            }
        });
        p2.add(exit);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icons/home.png"));
        Image i5 = i4.getImage().getScaledInstance(1250, 787, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(300,65,1250,787);
        add(image);
               
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource() == checkpackages){
            new CheckPackage();
        }else if(ae.getSource() == bookpackage){
            new BookPackage(username);
        }else if(ae.getSource() == viewpackage){
            new ViewPackage(username);
        }else if(ae.getSource() == viewhotels){
            new CheckHotels();
        }else if(ae.getSource() == destinations){
            new Destinations();
        }else if(ae.getSource() == bookhotel){
            new BookHotel(username);
        }else if(ae.getSource() == viewbookedhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource() == payments){
            new Payment();
        }else if(ae.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("Calc.exe");
            }catch(Exception e ){
                e.printStackTrace();
            }
        }else if(ae.getSource() == about){
            new About();
        }else if(ae.getSource() == deletePersonalDetails){
            new DeleteDetails(username);
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Dashboard("");
    }
}

