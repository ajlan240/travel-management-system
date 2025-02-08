import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Splash() {


        setSize(1024, 540);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/i1.jpg"));
        Image img1 = i1.getImage().getScaledInstance(1024,540, Image.SCALE_SMOOTH);
        JLabel image = new JLabel(new ImageIcon(img1));
        add(image);


        setVisible(true);
    }
    public static void main(String[] args) {
        new Splash();
    }

    @Override
    public void run() {

    }
}
