package travel.management.system;
                                
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
                        
public class trial extends JFrame implements ActionListener {
                                                            
    JButton yes, no;

    trial() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
                                                        
        JLabel l1 = new JLabel("Are you coming to FAREWELL.!?");
        l1.setBounds(330, 80, 1000, 200);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.BOLD, 60));
        add(l1);

        yes = new JButton("YES");
        yes.setBackground(Color.BLACK);
        yes.setForeground(Color.WHITE);
        yes.setBounds(330, 420, 180, 90);
        yes.setFont(new Font("Tahoma", Font.BOLD, 60));
        yes.addActionListener(this);
        yes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yes.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });
        add(yes);

        no = new JButton("NO");
        no.setBackground(Color.BLACK);
        no.setForeground(Color.WHITE);
        no.setBounds(950, 420, 180, 90);
        no.setFont(new Font("Tahoma", Font.BOLD, 60));
        no.addActionListener(this);
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                no.setCursor(new Cursor(Cursor.HAND_CURSOR));
                moveButtonRandomly(no);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                
            }
        });
        add(no);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == yes) {
            JOptionPane.showMessageDialog(null, "ONE OF THE BEST DECISION OF YOUR LIFE...!");
            setVisible(false);
        }
    }

    private void moveButtonRandomly(JButton button) {
        Random random = new Random();
        int x = random.nextInt(getWidth() - button.getWidth());
        int y = random.nextInt(getHeight() - button.getHeight());
        button.setBounds(x, y, button.getWidth(), button.getHeight());
    }

    public static void main(String args[]) {
        new trial();
    }
}
