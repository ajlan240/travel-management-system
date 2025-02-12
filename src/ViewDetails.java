import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewDetails extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == backButton) {
                setVisible(false);


            }
    }
    JButton backButton;
    String username, id3, number3, name3, gender3, country3, address3, phone3, email3;

    ViewDetails(String username) {
        this.username = username;
        String nameQuery = "select * from customer_details where username = '"+username+"'";
        try {
            Conn con = new Conn();
            ResultSet rs = con.st.executeQuery(nameQuery);
            while (rs.next()) {

                id3 = rs.getString("id");
                number3 = rs.getString("number");
                name3 = rs.getString("name");
                gender3 = rs.getString("gender");
                country3 = rs.getString("country");
                address3 = rs.getString("address");
                phone3 = rs.getString("phone");
                email3 = rs.getString("email");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setBounds(400,100, 900, 700);
        setTitle("View Your Details");
        setLayout(null);
        setVisible(true);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255, 255, 255 ));
        p1.setBounds(0, 0, 900, 400);
        p1.setLayout(null);
        add(p1);

        JLabel username1 = new JLabel("Username:");
        username1.setBounds(20, 50, 110, 20);
        username1.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(username1);

        JLabel username2 = new JLabel(username);
        username2.setBounds(200, 50, 110, 20);
        username2.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(username2);

        JLabel id = new JLabel("Id:");
        id.setBounds(20, 100, 110, 25);
        id.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(id);

        JLabel id2 = new JLabel(id3);
        id2.setBounds(200, 100, 110, 20);
        id2.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(id2);

        JLabel number1 = new JLabel("Number:");
        number1.setBounds(20, 150, 110, 25);
        number1.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(number1);

        JLabel number2 = new JLabel(number3);
        number2.setBounds(200, 150, 110, 20);
        number2.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(number2);

        JLabel name1 = new JLabel("Name:");
        name1.setBounds(20, 200, 110, 25);
        name1.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(name1);

        JLabel name2 = new JLabel(name3);
        name2.setBounds(200, 200, 110, 20);
        name2.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(name2);

        JLabel gender1 = new JLabel("Gender:");
        gender1.setBounds(20, 250, 110, 25);
        gender1.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(gender1);

        JLabel gender2 = new JLabel(gender3);
        gender2.setBounds(200, 250, 110, 20);
        gender2.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(gender2);


        JLabel country1 = new JLabel("Country:");
        country1.setBounds(470, 50, 110, 20);
        country1.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(country1);

        JLabel country2 = new JLabel(country3);
        country2.setBounds(650, 50, 110, 20);
        country2.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(country2);

        JLabel address1 = new JLabel("Address:");
        address1.setBounds(470, 100, 110, 25);
        address1.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(address1);

        JLabel address2 = new JLabel(address3);
        address2.setBounds(650, 100, 110, 20);
        address2.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(address2);

        JLabel phone1 = new JLabel("Phone:");
        phone1.setBounds(470, 150, 110, 25);
        phone1.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(phone1);

        JLabel phone2 = new JLabel(phone3);
        phone2.setBounds(650, 150, 110, 20);
        phone2.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(phone2);

        JLabel email1 = new JLabel("Email:");
        email1.setBounds(470, 200, 110, 25);
        email1.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(email1);

        JLabel email2 = new JLabel(email3);
        email2.setBounds(650, 200, 110, 20);
        email2.setFont(new Font("San Serief", Font.BOLD, 14));
        p1.add(email2);


        backButton = new JButton("Back");
        backButton.setBounds(300, 300, 120, 40);
        backButton.setFont(new Font("San Serief", Font.BOLD, 18));
        backButton.setBackground(new Color( 0, 0, 0));
        backButton.setForeground(Color.WHITE);
        backButton.setBorderPainted(false);
        backButton.addActionListener(this);
        p1.add(backButton);

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(255, 255, 255 ));
        p2.setBounds(0, 400, 900, 300);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/i7.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(734, 309,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(60,0,734,309);
        p2.add(image);

        setVisible(true);



    }

    public static void main(String[] args) {
        new ViewDetails("");
    }
}
