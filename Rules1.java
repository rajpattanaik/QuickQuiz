package quiz1.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules1 extends JFrame implements ActionListener {

    JButton start, back;
    String name;

    Rules1(String name) {
        this.name = name;
        setLayout(null);

        // Get full screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        // Welcome heading
        JLabel heading = new JLabel("Welcome " + name + " to QUIZ TEST");
        heading.setBounds(200, 100, 800, 50);
        heading.setFont(new Font("Arial", Font.BOLD, 40));
        heading.setForeground(new Color(22, 99, 54));
        add(heading);

        // Rules label with dynamic sizing
        JLabel rules = new JLabel();
        rules.setBounds(100, 150, screenWidth - 200, 400);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 24));
        rules.setForeground(new Color(22, 99, 54));
        rules.setText(
                "<html>" +
                        "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                        "2. There are a total 10 questions." + "<br><br>" +
                        "3. You only have 15 seconds to answer each question." + "<br><br>" +
                        "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                        "5. No talking." + "<br><br>" +
                        "6. No one else can be in the room with you." + "<br><br>" +
                        "</html>"
        );
        add(rules);

        // Back button
        back = new JButton("Back");
        back.setBounds(screenWidth / 2 - 200, screenHeight - 100, 150, 50);
        back.setBackground(new Color(22, 99, 54));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back.addActionListener(this);
        add(back);

        // Start button
        start = new JButton("Start");
        start.setBounds(screenWidth / 2 + 50, screenHeight - 100, 150, 50);
        start.setBackground(new Color(22, 99, 54));
        start.setForeground(Color.WHITE);
        start.setFont(new Font("Times New Roman", Font.BOLD, 20));
        start.addActionListener(this);
        add(start);

        // Background image scaled to full screen
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/back3.png"));
        Image i = i1.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, screenWidth, screenHeight);
        add(image);

        // Set full screen properties
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Loginapp();
        }
    }

    public static void main(String[] args) {
        new Rules1("User");
    }
}
