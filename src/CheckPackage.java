import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame  {

    CheckPackage() {

        setBounds(450, 200, 900, 600);
        setTitle("Check Packages");
        String[] package1 = new String[]{"GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only", "icons/i8.jpg"};
        String[] package2 = new String[]{"SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only", "icons/i9.jpg"};
        String[] package3 = new String[]{"BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only", "icons/i10.jpg"};
        JTabbedPane tab = new JTabbedPane();

        tab.addTab("package 1", null, createPackage(package1));
        tab.addTab("package 2", null, createPackage(package2));
        tab.addTab("package 3", null, createPackage(package3));

        add(tab);

        setVisible(true);

    }

    static  JPanel createPackage(String arr[]){

        JPanel p1 = new JPanel();
        p1.setBounds(0,0,900,600);
        p1.setBackground(new Color(255,255,255));
        p1.setLayout(null);




        JLabel h1 = new JLabel(arr[0]);
        h1.setBounds(50, 0, 300, 80);
        h1.setFont(new Font("San Serief", Font.BOLD, 40));
        h1.setForeground(new Color(232, 150, 9));
        p1.add(h1);


        JLabel h2 = new JLabel(arr[1]);
        h2.setBounds(50, 80, 300, 80);
        h2.setFont(new Font("San Serief", Font.BOLD, 20));
        h2.setForeground(new Color(143, 10, 90));
        p1.add(h2);

        JLabel h3 = new JLabel(arr[2]);
        h3.setBounds(50, 120, 300, 80);
        h3.setFont(new Font("San Serief", Font.BOLD, 20));
        h3.setForeground(new Color(76, 10, 143));
        p1.add(h3);

        JLabel h4 = new JLabel(arr[3]);
        h4.setBounds(50, 160, 300, 80);
        h4.setFont(new Font("San Serief", Font.BOLD, 20));
        h4.setForeground(new Color(143, 10, 90));
        p1.add(h4);

        JLabel h5 = new JLabel(arr[4]);
        h5.setBounds(50, 200, 300, 80);
        h5.setFont(new Font("San Serief", Font.BOLD, 20));
        h5.setForeground(new Color(76, 10, 143));
        p1.add(h5);

        JLabel h6 = new JLabel(arr[5]);
        h6.setBounds(50, 250, 300, 80);
        h6.setFont(new Font("San Serief", Font.BOLD, 20));
        h6.setForeground(new Color(143, 10, 90));
        p1.add(h6);

        JLabel h7 = new JLabel(arr[6]);
        h7.setBounds(50, 300, 300, 80);
        h7.setFont(new Font("San Serief", Font.BOLD, 20));
        h7.setForeground(new Color(76, 10, 143));
        p1.add(h7);

        JLabel h8 = new JLabel(arr[7]);
        h8.setBounds(50, 350, 300, 80);
        h8.setFont(new Font("San Serief", Font.BOLD, 20));
        h8.setForeground(new Color(143, 10, 90));
        p1.add(h8);

        JLabel h9 = new JLabel(arr[8]);
        h9.setBounds(100, 400, 300, 80);
        h9.setFont(new Font("San Serief", Font.BOLD, 20));
        h9.setForeground(new Color(143, 10, 90));
        p1.add(h9);

        JLabel h10 = new JLabel(arr[9]);
        h10.setBounds(150, 450, 300, 80);
        h10.setFont(new Font("San Serief", Font.BOLD, 20));
        h10.setForeground(new Color(204, 8, 8));
        p1.add(h10);

        JLabel h11 = new JLabel(arr[10]);
        h11.setBounds(400, 450, 300, 80);
        h11.setFont(new Font("San Serief", Font.BOLD, 20));
        h11.setForeground(new Color(12, 189, 6));
        p1.add(h11);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(arr[11]));
        Image i2 = i1.getImage().getScaledInstance(495 ,325, Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(300, 50, 570, 374);
        p1.add(image);

        return p1;

    }
    public static void main(String[] args) {
        new CheckPackage();
    }
}
