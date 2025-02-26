package quiz1.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loginapp extends JFrame implements ActionListener {

    JTextField text;
    JButton Next, back;

    Loginapp() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Get screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        // Load and scale the image to fit full screen
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/qq.jpg"));
        Image i = i1.getImage().getScaledInstance(screenWidth / 2, screenHeight, Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(screenWidth / 2, 0, screenWidth / 2, screenHeight);
        add(image);

        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(200, 200, 500, 60);
        heading.setFont(new Font("Impact", Font.BOLD, 50));
        heading.setForeground(new Color(22, 99, 54));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(210, 250, 300, 60);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
        name.setForeground(new Color(22, 99, 54));
        add(name);

        text = new JTextField();
        text.setBounds(100, 300, 400, 35);
        text.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(text);
        back = new JButton("Back");
        back.setBounds(350, 400, 150, 40);
        back.setBackground(new Color(22, 99, 54));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Times New Roman", Font.BOLD, 18));
        back.addActionListener(this);
        add(back);

        Next = new JButton("Next");
        Next.setBounds(100, 400, 150, 40);
        Next.setBackground(new Color(22, 99, 54));
        Next.setForeground(Color.WHITE);
        Next.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Next.addActionListener(this);
        add(Next);

       

        // Set full screen mode
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Next) {
            String name = text.getText();
            setVisible(false);
            new Rules1(name);
        } else if (e.getSource() == back) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Loginapp();
    }
}
