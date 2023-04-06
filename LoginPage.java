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
import javax.swing.DropMode;
import javax.swing.ImageIcon;


public class LoginPage {

	private JFrame frame;
	private JFrame frame2;
	private JTextField nameTF;
	private JPasswordField passwordTF;
	private JTextField textField;
	private JTextField txtLoginPage;

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
		frame.getContentPane().setBackground(new Color(240, 231, 241));
		frame.setBackground(new Color(64, 0, 64));
		frame.setForeground(new Color(128, 0, 64));
		frame.setBounds(100, 100, 652, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Login Page");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_4.setBounds(141, 41, 184, 39);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Vedanshi Sahu\\Downloads\\Screenshot 2023-04-06 125238 (1).jpg"));
		lblNewLabel_3.setBounds(-11, 78, 132, 400);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Enter username: ");
		lblNewLabel.setBounds(167, 163, 159, 59);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setFont(new Font("Calisto MT", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 =   new JLabel("Password:");
		lblNewLabel_1.setBounds(167, 216, 121, 39);
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Calisto MT", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.BLACK);
		frame.getContentPane().add(lblNewLabel_1);
		
		nameTF = new JTextField();
		nameTF.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		nameTF.setBounds(326, 180, 176, 20);
		nameTF.setForeground(new Color(219, 112, 147));
		frame.getContentPane().add(nameTF);
		nameTF.setColumns(20);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Login In"); /*Login backend code*/
		tglbtnNewToggleButton.setBounds(170, 301, 113, 40);
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
		tglbtnNewToggleButton.setBackground(new Color(255, 255, 255));
		tglbtnNewToggleButton.setFont(new Font("Calisto MT", Font.BOLD, 18));
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JLabel lblNewLabel_2 = new JLabel(" Thrive");
		lblNewLabel_2.setBounds(10, 33, 111, 53);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
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
		
		btnNewButton.setFont(new Font("Calisto MT", Font.BOLD, 18));
		btnNewButton.setBounds(443, 301, 113, 40);
		frame.getContentPane().add(btnNewButton);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(326, 224, 176, 20);
		frame.getContentPane().add(passwordTF);
		
		textField = new JTextField();
		textField.setBackground(new Color(64, 0, 64));
		textField.setBounds(0, 2, 121, 449);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtLoginPage = new JTextField();
		txtLoginPage.setFont(new Font("Times New Roman", Font.BOLD, 22));
		txtLoginPage.setBackground(new Color(176, 135, 184));
		txtLoginPage.setBounds(117, 2, 521, 91);
		frame.getContentPane().add(txtLoginPage);
		txtLoginPage.setColumns(10);
	}
}
