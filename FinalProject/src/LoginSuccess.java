import java.awt.*;
import javax.swing.*;

/*
 * Class Name: LoginSuccess.java
 * Author: Meshach Samuel
 * This class should display a message when the user successfully logs into their account.
 *
 * */

public class LoginSuccess extends JFrame {

  public LoginSuccess() {
    // Creating Main Panel
    JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

    // Creating Login Successful Label
    JLabel loginLabel = new JLabel("Login Successful");
    loginLabel.setFont(new Font("Arial", Font.BOLD, 30));
    mainPanel.add(loginLabel);

    // Adding Main Panel to Frame
    add(mainPanel);

    // Setting Frame Properties
    setTitle("Login Successful");
    setSize(300,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
