import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login, signUp, forgotPasswordButton;
    JTextField usernameField, passwordField;

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == login) {
            try {
                String username1 = usernameField.getText();
                String password1 = passwordField.getText();

                String query1 = "select * from account where username='"+username1+"' and password='"+password1+"'";

                Conn conn = new Conn();
                ResultSet rs = conn.st.executeQuery(query1);

                if(rs.next()) {
                    setVisible(false);
                    new Loading(username1);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (ae.getSource() == signUp) {
            new SignUp();
        } else if (ae.getSource() == forgotPasswordButton) {
            new ForgetPassword();
        }
    }

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

    usernameField = new JTextField();
    usernameField.setBounds(60, 60, 300, 30);
    usernameField.setBorder(BorderFactory.createEmptyBorder());
    p2.add(usernameField);

    JLabel password = new JLabel("Password:");
    password.setBounds(60, 100, 100, 25);
    password.setFont(new Font("San Serief", Font.BOLD, 20));
    p2.add(password);

    passwordField = new JTextField();
    passwordField.setBounds(60, 140, 300, 30);
    passwordField.setBorder(BorderFactory.createEmptyBorder());
    p2.add(passwordField);

    login = new JButton("Login");
    login.setBounds(60, 190, 140, 40);
    login.setFont(new Font("San Serief", Font.BOLD, 20));
    login.setBackground(new Color( 131, 193, 233));
    login.setForeground(Color.WHITE);
    login.setBorderPainted(false);
    login.addActionListener(this);
    p2.add(login);

    signUp = new JButton("Sign Up");
    signUp.setBounds(220, 190, 140, 40);
    signUp.setFont(new Font("San Serief", Font.BOLD, 20));
    signUp.setBackground(new Color( 131, 193, 233));
    signUp.setForeground(Color.WHITE);
    signUp.setBorderPainted(false);
    signUp.addActionListener(this);
    p2.add(signUp);

    forgotPasswordButton = new JButton("Forget Password");
    forgotPasswordButton.setBounds(115, 240, 200, 40);
    forgotPasswordButton.setFont(new Font("San Serief", Font.BOLD, 20));
    forgotPasswordButton.setBackground(new Color( 131, 193, 233));
    forgotPasswordButton.setForeground(Color.WHITE);
    forgotPasswordButton.setBorderPainted(false);
    forgotPasswordButton.addActionListener(this);
    p2.add(forgotPasswordButton);

    setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new Login();
    }
}
