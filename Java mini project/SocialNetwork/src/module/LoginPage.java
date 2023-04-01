package module;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class LoginPage {

	private JFrame frame;
	private JFrame frame2;
	private JTextField nameTF;
	private JPasswordField passwordTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =  new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBackground(new Color(128, 0, 64));
		frame.setForeground(new Color(128, 0, 64));
		frame.setBounds(100, 100, 495, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter username: ");
		lblNewLabel.setBounds(55, 66, 159, 59);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 =   new JLabel("Password:");
		lblNewLabel_1.setBounds(55, 125, 121, 20);
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.BLACK);
		frame.getContentPane().add(lblNewLabel_1);
		
		nameTF = new JTextField();
		nameTF.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		nameTF.setBounds(222, 87, 176, 20);
		nameTF.setForeground(new Color(219, 112, 147));
		frame.getContentPane().add(nameTF);
		nameTF.setColumns(20);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Login In"); /*Login backend code*/
		tglbtnNewToggleButton.setBounds(55, 178, 113, 40);
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String username, password;
				username=nameTF.getText();
				password=passwordTF.getText();
				
				if(username.contains("Vedanshi") && password.contains("1234"))
				{
					nameTF.setText(null);
					passwordTF.setText(null);
					
					frame.dispose();
					MainPage mp=new MainPage();
					mp.setVisible(true);
					
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Inavlid login deatils","Login serror",JOptionPane.ERROR_MESSAGE);
					nameTF.setText(null);
					passwordTF.setText(null);
					
				}
				
			}
		});
		tglbtnNewToggleButton.setBackground(SystemColor.menu);
		tglbtnNewToggleButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JLabel lblNewLabel_2 = new JLabel("Social Buzz ");
		lblNewLabel_2.setBounds(168, 11, 270, 53);
		lblNewLabel_2.setForeground(new Color(128, 0, 64));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Sign UP");
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				SignupPage sp=new SignupPage();
				sp.setVisible(true);
			
			}
		});
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(285, 178, 113, 40);
		frame.getContentPane().add(btnNewButton);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(222, 127, 176, 20);
		frame.getContentPane().add(passwordTF);
	}
}
