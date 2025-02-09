import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ForgetPassword extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == searchButton) {
            try {
                String queryForgotPassword = "select * from account where username = '"+usernameField.getText()+"'";

                Conn con = new Conn();
                ResultSet rs = con.st.executeQuery(queryForgotPassword);
                while (rs.next()) {
                    nameField.setText(rs.getString("name"));
                    securityQuestionField.setText(rs.getString("security_qn"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == retriveButton) {

            try {

                String queryCheckAnswer = "select * from account where answer = '"+answerField.getText()+"'";
                Conn con = new Conn();
                ResultSet rs = con.st.executeQuery(queryCheckAnswer);

                if (rs.next()) {
                    passwordField.setText(rs.getString("password"));

                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        } else if (ae.getSource() == backButton) {
            setVisible(false);
            new Login();

        }
    }

    JButton searchButton, retriveButton, backButton;
    JTextField nameField, usernameField, securityQuestionField, answerField, passwordField;
    ForgetPassword() {
        setTitle("Forget Password");
        setSize(1000, 400);
        setLocation(350, 200);
        setLayout(null);

        JPanel p1  = new JPanel();
        p1.setBackground(new Color(201, 201, 201));
        p1.setBounds(25, 25, 600, 300);
        p1.setLayout(null);
        add(p1);

        JLabel username  = new JLabel("Username :");
        username.setFont(new Font("San Serif", Font.BOLD, 15));
        username.setBounds(40, 25, 150, 25);
        p1.add(username);

        usernameField = new JTextField();
        usernameField.setBorder(BorderFactory.createEmptyBorder());
        usernameField.setFont(new Font("San Serif", Font.BOLD, 15));
        usernameField.setBounds(240, 25, 150, 25);
        p1.add(usernameField);

        JLabel name  = new JLabel("Name :");
        name.setFont(new Font("San Serif", Font.BOLD, 15));
        name.setBounds(40, 75, 150, 25);
        p1.add(name);

        nameField = new JTextField();
        nameField.setBorder(BorderFactory.createEmptyBorder());
        nameField.setFont(new Font("San Serif", Font.BOLD, 15));
        nameField.setBounds(240, 75, 150, 25);
        p1.add(nameField);

        searchButton = new JButton("Search");
        searchButton.setFont(new Font("San Serif", Font.BOLD, 15));
        searchButton.setBounds(440, 25, 100, 25);
        searchButton.setBackground(new Color( 128, 128, 128));
        searchButton.setForeground(Color.WHITE);
        searchButton.setBorderPainted(false);
        searchButton.addActionListener(this);
        p1.add(searchButton);

        JLabel securityQuestion  = new JLabel("Security Question :");
        securityQuestion.setFont(new Font("San Serif", Font.BOLD, 15));
        securityQuestion.setBounds(40, 125, 150, 25);
        p1.add(securityQuestion);

        securityQuestionField = new JTextField();
        securityQuestionField.setBorder(BorderFactory.createEmptyBorder());
        securityQuestionField.setFont(new Font("San Serif", Font.BOLD, 15));
        securityQuestionField.setBounds(240, 125, 150, 25);
        p1.add(securityQuestionField);

        JLabel answer  = new JLabel("Answer:");
        answer.setFont(new Font("San Serif", Font.BOLD, 15));
        answer.setBounds(40, 175, 150, 25);
        p1.add(answer);

        answerField = new JTextField();
        answerField.setBorder(BorderFactory.createEmptyBorder());
        answerField.setFont(new Font("San Serif", Font.BOLD, 15));
        answerField.setBounds(240, 175, 150, 25);
        p1.add(answerField);

        JLabel password = new JLabel("Password:");
        password.setFont(new Font("San Serif", Font.BOLD, 15));
        password.setBounds(40, 225, 150, 25);
        p1.add(password);

        passwordField = new JTextField();
        passwordField.setBorder(BorderFactory.createEmptyBorder());
        passwordField.setFont(new Font("San Serif", Font.BOLD, 15));
        passwordField.setBounds(240, 225, 150, 25);
        p1.add(passwordField);

        retriveButton = new JButton("Retrieve");
        retriveButton.setFont(new Font("San Serif", Font.BOLD, 15));
        retriveButton.setBounds(440, 175, 100, 25);
        retriveButton.setBackground(new Color( 128, 128, 128));
        retriveButton.setForeground(Color.WHITE);
        retriveButton.setBorderPainted(false);
        retriveButton.addActionListener(this);
        p1.add(retriveButton);

        backButton = new JButton("Back");
        backButton.setFont(new Font("San Serif", Font.BOLD, 15));
        backButton.setBounds(150, 265, 100, 25);
        backButton.setBackground(new Color( 128, 128, 128));
        backButton.setForeground(Color.WHITE);
        backButton.setBorderPainted(false);
        backButton.addActionListener(this);
        p1.add(backButton);

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(255, 255, 255 ));
        p2.setBounds(600, 0, 400, 400);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/i4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(100, 90, 200, 200);
        p2.add(image);



        setVisible(true);


    }
    public static void main(String[] args) {
        new ForgetPassword();
    }


}
