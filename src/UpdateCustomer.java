import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener {
    JButton backButton, updateButton;
    JTextField numberField,genderField, countryField, addressField, phoneField, emailField;

    Choice idChoice;
    String username;
    String name1;

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == backButton){
            setVisible(false);

        }
    }
    UpdateCustomer(String username){
        this.username = username;

        setBounds(400,100, 850, 650);
        setTitle("Update Customer Details");
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255, 255, 255 ));
        p1.setBounds(0, 0, 500, 650);
        p1.setLayout(null);
        add(p1);


        JLabel username1 = new JLabel("Username:");
        username1.setBounds(20, 50, 110, 20);
        username1.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(username1);

        JLabel username2 = new JLabel(username);
        username2.setBounds(200, 50, 110, 20);
        username2.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(username2);

        JLabel id = new JLabel("Id:");
        id.setBounds(20, 100, 110, 25);
        id.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(id);

        idChoice = new Choice();
        idChoice.add("Passport");
        idChoice.add("Visa");
        idChoice.add("Driving Liscence");
        idChoice.add("Election ID Card");
        idChoice.setBounds(200, 100, 200, 50);
        p1.add(idChoice);


        JLabel number = new JLabel("Number:");
        number.setBounds(20, 150, 110, 20);
        number.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(number);

        numberField = new JTextField();
        numberField.setBorder(new LineBorder(Color.BLACK, 1));
        numberField.setFont(new Font("San Serif", Font.PLAIN, 15));
        numberField.setBounds(200, 150, 200, 25);
        p1.add(numberField);


        JLabel name = new JLabel("Name:");
        name.setBounds(20, 200, 110, 20);
        name.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(name);

        JLabel name2 = new JLabel(name1);
        name2.setBounds(200, 200, 150, 20);
        name2.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(name2);

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(20, 250, 110, 20);
        gender.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(gender);

        genderField = new JTextField();
        genderField.setBorder(new LineBorder(Color.BLACK, 1));
        genderField.setFont(new Font("San Serif", Font.PLAIN, 15));
        genderField.setBounds(200, 250, 200, 25);
        p1.add(genderField);



        JLabel country = new JLabel("country:");
        country.setBounds(20, 300, 110, 20);
        country.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(country);

        countryField = new JTextField();
        countryField.setBorder(new LineBorder(Color.BLACK, 1));
        countryField.setFont(new Font("San Serif", Font.PLAIN, 15));
        countryField.setBounds(200, 300, 200, 25);
        p1.add(countryField);

        JLabel address = new JLabel("Address:");
        address.setBounds(20, 350, 110, 20);
        address.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(address);

        addressField = new JTextField();
        addressField.setBorder(new LineBorder(Color.BLACK, 1));
        addressField.setFont(new Font("San Serif", Font.PLAIN, 15));
        addressField.setBounds(200, 350, 200, 25);
        p1.add(addressField);

        JLabel phone = new JLabel("Phone:");
        phone.setBounds(20, 400, 110, 20);
        phone.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(phone);

        phoneField = new JTextField();
        phoneField.setBorder(new LineBorder(Color.BLACK, 1));
        phoneField.setFont(new Font("San Serif", Font.PLAIN, 15));
        phoneField.setBounds(200, 400, 200, 25);
        p1.add(phoneField);

        JLabel email = new JLabel("Email:");
        email.setBounds(20, 450, 110, 20);
        email.setFont(new Font("San Serief", Font.BOLD, 18));
        p1.add(email);

        emailField = new JTextField();
        emailField.setBounds(200, 450, 200, 25);
        emailField.setBorder(new LineBorder(Color.BLACK, 1));
        emailField.setFont(new Font("San Serif", Font.PLAIN, 15));
        p1.add(emailField);

        updateButton = new JButton("Update");
        updateButton.setBounds(50, 500, 120, 40);
        updateButton.setFont(new Font("San Serief", Font.BOLD, 18));
        updateButton.setBackground(new Color( 0,0,0));
        updateButton.setForeground(Color.WHITE);
        updateButton.setBorderPainted(false);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae1) {
                String id1 = idChoice.getSelectedItem().toString();
                String number1 = numberField.getText();
                String country1 = countryField.getText();
                String address1 = addressField.getText();
                String phone1 = phoneField.getText();
                String email1 = emailField.getText();
                String gender1 = genderField.getText();

                try {
                    String query = "UPDATE customer_details SET id = '" + id1 + "', number = '" + number1 + "', name = '" + name1 + "', gender = '" + gender1 + "', country = '" + country1 + "', address = '" + address1 + "', phone = '" + phone1 + "', email = '" + email1 + "' WHERE username = '" + username + "'";
                    Conn con = new Conn();
                    con.st.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Account Updated Successfully");
                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        p1.add(updateButton);

        backButton = new JButton("Back");
        backButton.setBounds(200, 500, 120, 40);
        backButton.setFont(new Font("San Serief", Font.BOLD, 18));
        backButton.setBackground(new Color( 0, 0, 0));
        backButton.setForeground(Color.WHITE);
        backButton.setBorderPainted(false);
        backButton.addActionListener(this);
        p1.add(backButton);

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(255, 255, 255 ));
        p2.setBounds(500, 0, 350, 650);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/i6.png"));
        Image i2 = i1.getImage().getScaledInstance(275, 509, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(50, 90, 275, 509);
        p2.add(image);

        try {

            Conn con = new Conn();
            ResultSet rs = con.st.executeQuery("select * from customer_details where username = '"+username+"'");
            if(rs.next()){
                name1 = rs.getString("name");
                numberField.setText(rs.getString("number"));
                genderField.setText(rs.getString("gender"));
                countryField.setText(rs.getString("country"));
                addressField.setText(rs.getString("address"));
                phoneField.setText(rs.getString("phone"));
                emailField.setText(rs.getString("email"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        setVisible(true);


    }

    public static void main(String[] args) {
        new UpdateCustomer("");
    }
}
