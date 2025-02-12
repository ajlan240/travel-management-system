import javax.swing.*;
import java.awt.*;


public class Loading extends JFrame implements Runnable {
    Thread t;
    JProgressBar progressBar;


    String uname;
    @Override
    public void run() {

        try {
            for (int i = 1; i <= 101; i++) {
                int max = progressBar.getMaximum();
                int current = progressBar.getValue();
                if(current < max) {
                    progressBar.setValue(current + 1);
                } else {
                    setVisible(false);
                    new Dashboard(uname);
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    Loading(String username) {
        this.uname = username;
        t = new Thread(this);
        setTitle("Loading");
        setBounds(500, 200, 650, 400);
        setLayout(null);

        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);

        progressBar = new JProgressBar();
        progressBar.setBounds(150,100,300,35);
        progressBar.setStringPainted(true);
        add(progressBar);

        JLabel welcomeText = new JLabel("Welcome "+uname);
        welcomeText.setBounds(25, 310, 400, 20);
        welcomeText.setForeground(Color.RED);
        welcomeText.setFont(new Font("Raleway", Font.BOLD, 15));
        add(welcomeText);

        JLabel loadingText = new JLabel("Loading Please wait....");
        loadingText.setBounds(190, 135, 400, 20);
        loadingText.setForeground(Color.RED);
        loadingText.setFont(new Font("Raleway", Font.BOLD, 15));
        add(loadingText);

        t.start();
        setVisible(true);
    }

    public static void main(String[] args) {

        new Loading("");
    }
}
