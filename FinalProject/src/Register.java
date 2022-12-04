import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Register {
    private static JFrame mainFrame;
    private static JTextField usernameField;
    private static JPasswordField passwordField;
    private static JTextField firstNameField;
    private static JTextField lastNameField;
    private static JTextField emailField;
    private static JButton registerButton;

    public static void main(String[] args) {
        mainFrame = new JFrame("Register Page: ");
        JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        GridLayout grid = new GridLayout(1, 1);
        grid.setHgap(10);

        // Given Name Panel
        JPanel firstNamePanel = new JPanel(grid);
        JLabel firstNameLabel = new JLabel("First Name: ");
        firstNameField = new JTextField(15);
        
        JPanel lastNamePanel = new JPanel(grid);
        JLabel lastNameLabel = new JLabel("Last Name: ");
        lastNameField = new JTextField(15);

        firstNamePanel.add(firstNameLabel);
        firstNamePanel.add(firstNameField);
        lastNamePanel.add(lastNameLabel);
        lastNamePanel.add(lastNameField);

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

        // Email Panel
        JPanel emailPanel = new JPanel(grid);

        JLabel emailLabel = new JLabel("Email: ");
        emailField = new JTextField(15);

        emailPanel.add(emailLabel);
        emailPanel.add(emailField);

        // Register Button Panel

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        registerButton = new JButton("Register");
        buttonPanel.add(registerButton);

        // Adding all subpanels to main Panel

        mainPanel.add(firstNamePanel);
        mainPanel.add(lastNamePanel);
        mainPanel.add(usernamePanel);
        mainPanel.add(emailPanel);
        mainPanel.add(passwordPanel);
        mainPanel.add(buttonPanel);

        // Setting PRoperties of mainFrame
        mainFrame.add(mainPanel);
        mainFrame.setSize(350,210);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        
        registerButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String firstName = firstNameField.getText();
        		String lastName = lastNameField.getText();
        		String userName = usernameField.getText();
        		String emailID = emailField.getText();
        		String password = passwordField.getText();
        		
        		try {
        			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FinalProject", "root", "INDOrama123");
        			String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName + "','" +
                            password + "','" + emailID + "')";
        			
        			Statement sta = connection.createStatement();
        			int x = sta.executeUpdate(query);
        			if (x == 0) {
                        JOptionPane.showMessageDialog(registerButton, "This account already exists");
                    } else {
                        JOptionPane.showMessageDialog(registerButton,
                            "Welcome, " + firstName + " Your account is sucessfully created");
                    }
                    connection.close();
        			
        		} catch (Exception exception) {
        			exception.printStackTrace();
        		}
        	}
        });       
    }   
}