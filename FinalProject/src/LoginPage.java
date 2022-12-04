import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginPage extends JFrame {
    private static JFrame mainFrame;
    private static JTextField usernameField;
    private static JPasswordField passwordField;
    private static JButton logInButton;

    public static void main(String[] args) {
    	mainFrame = new JFrame("Login Page");
    	JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    	
    	GridLayout grid = new GridLayout(1,1);
    	
    	grid.setHgap(10);
    	
    	// Username Panel

        JPanel usernamePanel = new JPanel(grid);

        JLabel usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField(15);

        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);

        // Password Panel

        JPanel passwordPanel = new JPanel(grid);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(15);

        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        // Login Button Panel

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        logInButton = new JButton("Log In");
        buttonPanel.add(logInButton);
        
        mainPanel.add(usernamePanel);
        mainPanel.add(passwordPanel);
        mainPanel.add(buttonPanel);
        
        mainFrame.add(mainPanel);
        mainFrame.setSize(350,130);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        
        logInButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String userName = usernameField.getText();
        		String password = passwordField.getText();
        		
        		try {
        			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FinalProject", "root", "INDOrama123");
        			Statement stm = connection.createStatement();
        			String query = "select * from login where username='" + userName + "' and password='" + password + "''";
        			
        			ResultSet rs = stm.executeQuery(query);
        			
        			if(rs.next()) {
        				JOptionPane.showMessageDialog(logInButton, "Welcome Back");
        			} else {
        				JOptionPane.showMessageDialog(logInButton, "Username/Password is Wrong");
        			}

                    connection.close();
        			
        		} catch (Exception exception) {
        			exception.printStackTrace();
        		}
        	}
        });
    }
}