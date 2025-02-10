import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JButton addPersonalDetailbutton, updatePersonalButton, viewDetailsButton, deletePersonDetailButton, checkPackageButton;
    JButton bookPackage, viewPackage, viewHotel, bookHotel, viewBookedHotel, destinationButton, paymentButton, calculatorButton, notepadButton, aboutButton;

    Dashboard() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Dashboard");
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0,0,1600,90);
        p1.setBackground(new Color(128, 31, 69));
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/i5.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel logoImage = new JLabel(i3);
        logoImage.setBounds(0, 8, 100, 80);
        p1.add(logoImage);

        JLabel dashboardText = new JLabel("Dashboard");
        dashboardText.setBounds(110, 6, 300, 80);
        dashboardText.setFont(new Font("San Serief", Font.BOLD, 40));
        dashboardText.setForeground(new Color(237, 238, 240));
        p1.add(dashboardText);

        JPanel p2 = new JPanel();
        p2.setBounds(0,90,300,900);
        p2.setBackground(new Color(128, 31, 69));
        p2.setLayout(null);
        add(p2);

        addPersonalDetailbutton = new JButton("Add Personal Details");
        addPersonalDetailbutton.setBounds(0, 0, 300, 50);
        addPersonalDetailbutton.setFont(new Font("San Serief", Font.PLAIN, 20));
        addPersonalDetailbutton.setBackground(new Color( 128, 31, 69));
        addPersonalDetailbutton.setForeground(Color.WHITE);
        addPersonalDetailbutton.addActionListener(this);
        p2.add(addPersonalDetailbutton);

        updatePersonalButton = new JButton("Update Personal Details");
        updatePersonalButton.setBounds(0, 50, 300, 50);
        updatePersonalButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        updatePersonalButton.setBackground(new Color( 128, 31, 69));
        updatePersonalButton.setForeground(Color.WHITE);
        updatePersonalButton.addActionListener(this);
        p2.add(updatePersonalButton);

        viewDetailsButton = new JButton("View Details");
        viewDetailsButton.setBounds(0, 100, 300, 50);
        viewDetailsButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        viewDetailsButton.setBackground(new Color( 128, 31, 69));
        viewDetailsButton.setForeground(Color.WHITE);
        viewDetailsButton.addActionListener(this);
        p2.add(viewDetailsButton);

        deletePersonDetailButton = new JButton("Delete Personal Details");
        deletePersonDetailButton.setBounds(0, 150, 300, 50);
        deletePersonDetailButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        deletePersonDetailButton.setBackground(new Color( 128, 31, 69));
        deletePersonDetailButton.setForeground(Color.WHITE);
        deletePersonDetailButton.addActionListener(this);
        p2.add(deletePersonDetailButton);

        deletePersonDetailButton = new JButton("Delete Personal Details");
        deletePersonDetailButton.setBounds(0, 200, 300, 50);
        deletePersonDetailButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        deletePersonDetailButton.setBackground(new Color( 128, 31, 69));
        deletePersonDetailButton.setForeground(Color.WHITE);
        deletePersonDetailButton.addActionListener(this);
        p2.add(deletePersonDetailButton);

        checkPackageButton = new JButton("Check Package ");
        checkPackageButton.setBounds(0, 250, 300, 50);
        checkPackageButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        checkPackageButton.setBackground(new Color( 128, 31, 69));
        checkPackageButton.setForeground(Color.WHITE);
        checkPackageButton.addActionListener(this);
        p2.add(checkPackageButton);

        bookPackage = new JButton("Book Package ");
        bookPackage.setBounds(0, 300, 300, 50);
        bookPackage.setFont(new Font("San Serief", Font.PLAIN, 20));
        bookPackage.setBackground(new Color( 128, 31, 69));
        bookPackage.setForeground(Color.WHITE);
        bookPackage.addActionListener(this);
        p2.add(bookPackage);

        viewPackage = new JButton("View Package ");
        viewPackage.setBounds(0, 350, 300, 50);
        viewPackage.setFont(new Font("San Serief", Font.PLAIN, 20));
        viewPackage.setBackground(new Color( 128, 31, 69));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.addActionListener(this);
        p2.add(viewPackage);

        viewHotel = new JButton("View Hotel ");
        viewHotel.setBounds(0, 400, 300, 50);
        viewHotel.setFont(new Font("San Serief", Font.PLAIN, 20));
        viewHotel.setBackground(new Color( 128, 31, 69));
        viewHotel.setForeground(Color.WHITE);
        viewHotel.addActionListener(this);
        p2.add(viewHotel);

        bookHotel = new JButton("Book Hotel ");
        bookHotel.setBounds(0, 450, 300, 50);
        bookHotel.setFont(new Font("San Serief", Font.PLAIN, 20));
        bookHotel.setBackground(new Color( 128, 31, 69));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.addActionListener(this);
        p2.add(bookHotel);

        viewBookedHotel = new JButton("Viewed  Hotel ");
        viewBookedHotel.setBounds(0, 500, 300, 50);
        viewBookedHotel.setFont(new Font("San Serief", Font.PLAIN, 20));
        viewBookedHotel.setBackground(new Color( 128, 31, 69));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);

        destinationButton = new JButton("Destination");
        destinationButton.setBounds(0, 550, 300, 50);
        destinationButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        destinationButton.setBackground(new Color( 128, 31, 69));
        destinationButton.setForeground(Color.WHITE);
        destinationButton.addActionListener(this);
        p2.add(destinationButton);

        paymentButton = new JButton("Payment");
        paymentButton.setBounds(0, 600, 300, 50);
        paymentButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        paymentButton.setBackground(new Color( 128, 31, 69));
        paymentButton.setForeground(Color.WHITE);
        paymentButton.addActionListener(this);
        p2.add(paymentButton);


        calculatorButton = new JButton("Calculator");
        calculatorButton.setBounds(0, 650, 300, 50);
        calculatorButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        calculatorButton.setBackground(new Color( 128, 31, 69));
        calculatorButton.setForeground(Color.WHITE);
        calculatorButton.addActionListener(this);
        p2.add(calculatorButton);

        notepadButton = new JButton("Notepad");
        notepadButton.setBounds(0, 700, 300, 50);
        notepadButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        notepadButton.setBackground(new Color( 128, 31, 69));
        notepadButton.setForeground(Color.WHITE);
        notepadButton.addActionListener(this);
        p2.add(notepadButton);

        aboutButton = new JButton("About");
        aboutButton.setBounds(0, 750, 300, 50);
        aboutButton.setFont(new Font("San Serief", Font.PLAIN, 20));
        aboutButton.setBackground(new Color( 128, 31, 69));
        aboutButton.setForeground(Color.WHITE);
        aboutButton.addActionListener(this);
        p2.add(aboutButton);



        setVisible(true);

    }

    public static void main(String[] args) {
        new Dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
