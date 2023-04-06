package module;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MainPage2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtProfile;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtUsername;
	private JTextField txtUserId;
	private JTextField textField_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage2 frame = new MainPage2();
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
	public MainPage2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 221, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Profile");
		lblNewLabel_1.setBounds(134, 50, 179, 33);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("Thrive");
		lblNewLabel.setBounds(20, 53, 89, 35);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(lblNewLabel);
		
		btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage2 mp2 =new MainPage2();
				mp2.dispose();
				
			}
		});
		btnNewButton_3.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_3.setBounds(20, 374, 89, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("Friends");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage2 mp2 =new MainPage2();
				mp2.dispose();
				MainPage4 mp4=new MainPage4();
				mp4.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(20, 272, 89, 23);
		btnNewButton_2.setFont(new Font("Calisto MT", Font.BOLD, 14));
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("Post");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage2 mp2 =new MainPage2();
				mp2.dispose();
				MainPage3 mp3=new MainPage3();
				mp3.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(20, 201, 89, 23);
		btnNewButton_1.setFont(new Font("Calisto MT", Font.BOLD, 14));
		contentPane.add(btnNewButton_1);
		
		btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage2 mp2 =new MainPage2();
				mp2.dispose();
				MainPage mp=new MainPage();
				mp.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(20, 135, 89, 23);
		btnNewButton.setFont(new Font("Calisto MT", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 124, 447);
		textField.setBackground(new Color(64, 0, 64));
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtProfile = new JTextField();
		txtProfile.setBounds(121, 0, 515, 97);
		txtProfile.setFont(new Font("Times New Roman", Font.BOLD, 22));
		txtProfile.setBackground(new Color(199, 159, 202));
		contentPane.add(txtProfile);
		txtProfile.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Vedanshi Sahu\\Downloads\\My project (1).jpg"));
		lblNewLabel_2.setBounds(134, 132, 124, 114);
		contentPane.add(lblNewLabel_2);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(287, 135, 224, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtUserId = new JTextField();
		txtUserId.setForeground(new Color(64, 0, 64));
		txtUserId.setBounds(287, 177, 179, 20);
		contentPane.add(txtUserId);
		txtUserId.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(287, 213, 132, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton_4 = new JButton("Friend List");
		btnNewButton_4.setFont(new Font("Calisto MT", Font.BOLD, 15));
		btnNewButton_4.setBounds(287, 289, 126, 33);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Show Post");
		btnNewButton_5.setFont(new Font("Calisto MT", Font.BOLD, 15));
		btnNewButton_5.setBounds(455, 289, 124, 33);
		contentPane.add(btnNewButton_5);
	}
}
