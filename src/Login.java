import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login() {
        setTitle("Login");
    setSize(900, 400);
    setLocation(350, 200);
    setLayout(null);


    // change whole background color
        getContentPane().setBackground(Color.WHITE);

    // organize ui elements
    JPanel p1 = new JPanel();
    p1.setBackground(new Color(131, 193, 233 ));
    p1.setBounds(0, 0, 400, 400);
    p1.setLayout(null);
    add(p1);

    // To bring image and resize it
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/i2.png"));
    Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);

    // used to display components
    JLabel image = new JLabel(i3);
    image.setBounds(100, 120, 200, 200);
    p1.add(image);

    JPanel p2 = new JPanel();
    p2.setLayout(null);
    p2.setBounds(400, 30, 450, 300);
    add(p2);

    JLabel username = new JLabel("Username:");
    username.setBounds(60, 20, 110, 25);
    username.setFont(new Font("San Serief", Font.BOLD, 20));
    p2.add(username);

    JTextField usernameField = new JTextField();
    usernameField.setBounds(60, 60, 300, 30);
    usernameField.setBorder(BorderFactory.createEmptyBorder());
    p2.add(usernameField);

    JLabel password = new JLabel("Password:");
    password.setBounds(60, 100, 100, 25);
    password.setFont(new Font("San Serief", Font.BOLD, 20));
    p2.add(password);

    JTextField passwordField = new JTextField();
    passwordField.setBounds(60, 140, 300, 30);
    passwordField.setBorder(BorderFactory.createEmptyBorder());
    p2.add(passwordField);

    JButton login = new JButton("Login");
    login.setBounds(60, 190, 140, 40);
    login.setFont(new Font("San Serief", Font.BOLD, 20));
    login.setBackground(new Color( 131, 193, 233));
    login.setForeground(Color.WHITE);
    login.setBorderPainted(false);
    p2.add(login);

    JButton signIn = new JButton("Sign In");
    signIn.setBounds(220, 190, 140, 40);
    signIn.setFont(new Font("San Serief", Font.BOLD, 20));
    signIn.setBackground(new Color( 131, 193, 233));
    signIn.setForeground(Color.WHITE);
    signIn.setBorderPainted(false);
    p2.add(signIn);

    setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new Login();
    }
}
