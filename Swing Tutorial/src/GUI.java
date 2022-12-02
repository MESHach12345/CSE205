import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener {
	
	private static JLabel usernameLabel;
	private static JTextField usernameText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel successLabel;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(10, 20, 80, 25);
		panel.add(usernameLabel);
		
		usernameText = new JTextField(20);
		usernameText.setBounds(100, 20, 165, 25);
		panel.add(usernameText);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 60, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 60, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 110, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		successLabel = new JLabel();
		successLabel.setBounds(10, 160, 300, 25);
		panel.add(successLabel);
		successLabel.setText(null);
		
		frame.add(panel);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String userName = usernameText.getText();
		String password = passwordText.getText();

		if (userName.equals("MESHach123") && password.equals("INDOrama123")) {
			successLabel.setText("Login Successful!!");
		}
	}
	
}
