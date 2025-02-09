import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {

    public SignUp() {
        setTitle("Sign Up");
        setSize(1000, 400);
        setLocation(350, 200);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);


        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233 ));
        p1.setBounds(0, 0, 600, 400);
        p1.setLayout(null);
        add(p1);

        JLabel username = new JLabel("Username:");
        username.setBounds(40, 20, 110, 25);
        username.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(username);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(200, 20, 300, 30);
        usernameField.setBorder(BorderFactory.createEmptyBorder());
        p1.add(usernameField);

        JLabel name = new JLabel("Name:");
        name.setBounds(40, 70, 110, 25);
        name.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(name);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 70, 300, 30);
        nameField.setBorder(BorderFactory.createEmptyBorder());
        p1.add(nameField);

        JLabel password = new JLabel("Password:");
        password.setBounds(40, 120, 110, 25);
        password.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(password);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(200, 120, 300, 30);
        passwordField.setBorder(BorderFactory.createEmptyBorder());
        p1.add(passwordField);

        JLabel securityQuestion = new JLabel("Security Qn:");
        securityQuestion.setBounds(40, 170, 150, 25);
        securityQuestion.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(securityQuestion);

        JTextField securityQuestionField = new JTextField();
        securityQuestionField.setBounds(200, 170, 300, 30);
        securityQuestionField.setBorder(BorderFactory.createEmptyBorder());
        p1.add(securityQuestionField);

        JLabel answer = new JLabel("Answer:");
        answer.setBounds(40, 220, 110, 25);
        answer.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(answer);

        JTextField answerField = new JTextField();
        answerField.setBounds(200, 220, 300, 30);
        answerField.setBorder(BorderFactory.createEmptyBorder());
        p1.add(answerField);

        JButton createButton = new JButton("Create");
        createButton.setBounds(200, 290, 120, 30);
        createButton.setFont(new Font("San Serief", Font.BOLD, 18));
        createButton.setBackground(new Color( 255, 255, 255));
        createButton.setForeground(Color.BLACK);
        createButton.setBorderPainted(false);
        p1.add(createButton);

        JButton backButton = new JButton("Back");
        backButton.setBounds(380, 290, 120, 30);
        backButton.setFont(new Font("San Serief", Font.BOLD, 18));
        backButton.setBackground(new Color( 255, 255, 255));
        backButton.setForeground(Color.BLACK);
        backButton.setBorderPainted(false);
        p1.add(backButton);

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(255, 255, 255 ));
        p2.setBounds(600, 0, 400, 400);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/i3.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p2.add(image);

        setVisible(true);

    }

    public static void main (String[] args) {
        new SignUp();
    }
}
