package quiz1.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {

    Score(String name, int score) {
        setLayout(null);

        // Get full screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        // Image Icon (Trophy or Result Icon)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/r.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(screenWidth / 2 - 150, 50, 300, 200);
        add(image);

        // Heading Label
        JLabel heading = new JLabel("Thank you " + name + " for Playing QUIZ Test");
        heading.setBounds(screenWidth / 2 - 350, 300, 700, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 36));
        heading.setForeground(new Color(22, 99, 54));
        add(heading);

        // Score Label
        JLabel scoreLabel = new JLabel("Your Score is " + score);
        scoreLabel.setBounds(screenWidth / 2 - 150, 400, 300, 50);
        scoreLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
        scoreLabel.setForeground(new Color(22, 99, 54));
        add(scoreLabel);

        // Exit Button
        JButton exit = new JButton("EXIT");
        exit.setBounds(screenWidth / 2 - 100, 500, 200, 50);
        exit.setBackground(new Color(22, 99, 54));
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Times New Roman", Font.BOLD, 24));
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Loginapp();
            }
        });

        // Background Image (Full Screen)
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icon/tro.jpg"));
        Image bgImage = bgIcon.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        ImageIcon bgScaledIcon = new ImageIcon(bgImage);
        JLabel bgLabel = new JLabel(bgScaledIcon);
        bgLabel.setBounds(0, 0, screenWidth, screenHeight);
        add(bgLabel);

        // Full Screen Settings
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
