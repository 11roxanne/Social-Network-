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

public class SignupPage extends JFrame {

	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField gmailTF;
	private JTextField usernameTF;
	private JPasswordField passwordField;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 234, 234));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your name:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(69, 27, 138, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Gmail Id:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(69, 74, 118, 14);
		contentPane.add(lblNewLabel_1);
		
		nameTF = new JTextField();
		nameTF.setBounds(217, 25, 118, 20);
		contentPane.add(nameTF);
		nameTF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(60, 145, 49, -10);
		contentPane.add(lblNewLabel_2);
		
		gmailTF = new JTextField();
		gmailTF.setBounds(217, 72, 118, 20);
		contentPane.add(gmailTF);
		gmailTF.setColumns(10);
		
		usernameTF = new JTextField();
		usernameTF.setBounds(217, 118, 118, 20);
		contentPane.add(usernameTF);
		usernameTF.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter username:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(69, 120, 137, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter password :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setBounds(67, 169, 150, 14);
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
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(149, 216, 118, 36);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(217, 167, 118, 20);
		contentPane.add(passwordField);
	}
}
