package module;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SignupPage extends JFrame {

	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField usernameTF;
	private JPasswordField passwordField;
	private JTextField txtSignupPage;
	private JTextField textField;
	private JTextField textField_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_7;
	private JTextField textField_1;
	private JLabel lblNewLabel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupPage frame = new SignupPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignupPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 227, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Vedanshi Sahu\\Downloads\\Screenshot 2023-04-06 130706.jpg"));
		lblNewLabel_1.setBounds(-22, 93, 138, 370);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_7 = new JLabel("Signup Page");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_7.setBounds(141, 41, 195, 36);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("Enter your name:");
		lblNewLabel.setFont(new Font("Calisto MT", Font.BOLD, 18));
		lblNewLabel.setBounds(162, 145, 149, 27);
		contentPane.add(lblNewLabel);
		
		nameTF = new JTextField();
		nameTF.setBounds(366, 147, 162, 20);
		contentPane.add(nameTF);
		nameTF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(60, 145, 49, -10);
		contentPane.add(lblNewLabel_2);
		
		usernameTF = new JTextField();
		usernameTF.setBounds(366, 254, 162, 20);
		contentPane.add(usernameTF);
		usernameTF.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter username:");
		lblNewLabel_3.setFont(new Font("Calisto MT", Font.BOLD, 18));
		lblNewLabel_3.setBounds(162, 247, 149, 36);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter password :");
		lblNewLabel_4.setFont(new Font("Calisto MT", Font.BOLD, 18));
		lblNewLabel_4.setBounds(162, 305, 150, 29);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Account Created Succesfully","",JOptionPane.PLAIN_MESSAGE);
				SignupPage sp=new SignupPage();
				sp.dispose();
				MainPage mp=new  MainPage();
				mp.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Calisto MT", Font.BOLD, 18));
		btnNewButton.setBounds(312, 370, 118, 36);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(366, 308, 162, 20);
		contentPane.add(passwordField);
		
		txtSignupPage = new JTextField();
		txtSignupPage.setFont(new Font("Times New Roman", Font.BOLD, 22));
		txtSignupPage.setBackground(new Color(176, 135, 184));
		txtSignupPage.setBounds(115, 0, 522, 94);
		contentPane.add(txtSignupPage);
		txtSignupPage.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("  Thrive");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_5.setBounds(3, 46, 106, 36);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBackground(new Color(64, 0, 64));
		textField.setBounds(0, 0, 118, 413);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(0, 0, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Signup Page");
		lblNewLabel_6.setBounds(105, 50, 49, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(367, 207, 161, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Enter your Gmail Id:");
		lblNewLabel_8.setFont(new Font("Calisto MT", Font.BOLD, 18));
		lblNewLabel_8.setBounds(162, 203, 174, 30);
		contentPane.add(lblNewLabel_8);
	}
}
