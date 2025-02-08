import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login() {
    setSize(900, 400);
    setLocation(350, 200);

    JPanel p1 = new JPanel();
    p1.setBackground(Color.WHITE);
    add(p1);
    setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
