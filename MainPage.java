package module;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtMainPage;
	private JTextField textField;
	private JTextField txtHiWelcomeTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 231, 241));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		
		
		JButton btnNewButton_4 = new JButton("Profile ");
		btnNewButton_4.setBounds(21, 130, 89, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainPage mp=new MainPage();
				mp.dispose();
				MainPage2 mp2=new MainPage2();
				mp2.setVisible(true);
				
;
				
			}
		});
		
		JButton btnNewButton = new JButton("Friends");
		btnNewButton.setBounds(21, 253, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mp=new MainPage();
				mp.dispose();
				MainPage4 mp4=new MainPage4();
				mp4.setVisible(true);
				
			}
		});
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Welcome !");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_7.setBounds(150, 38, 169, 35);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome !");
		lblNewLabel_1.setBounds(435, 279, 191, 160);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Vedanshi Sahu\\Downloads\\238738 (1) (2).png"));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("unique creative ideas with your friends. ");
		lblNewLabel_6.setBounds(159, 211, 394, 30);
		lblNewLabel_6.setFont(new Font("Calisto MT", Font.BOLD, 15));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("A place to share you knowledge , thoughts, experiences and ");
		lblNewLabel_5.setBounds(159, 185, 447, 35);
		lblNewLabel_5.setFont(new Font("Calisto MT", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Thrive");
		lblNewLabel_4.setBounds(21, 37, 89, 35);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("adding friends to posting your thoughts. ");
		lblNewLabel_3.setBounds(159, 155, 394, 23);
		lblNewLabel_3.setFont(new Font("Calisto MT", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Hi , Welcome to Thrive. Thrive has features of creating account and   ");
		lblNewLabel_2.setBounds(161, 93, 465, 101);
		lblNewLabel_2.setFont(new Font("Calisto MT", Font.BOLD, 15));
		contentPane.add(lblNewLabel_2);
		btnNewButton.setFont(new Font("Calisto MT", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Post");
		btnNewButton_5.setBounds(21, 189, 89, 23);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mp=new MainPage();
				mp.dispose();
				MainPage2 mp2=new MainPage2();
				mp2.setVisible(true);
				

				
			}
		});
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(btnNewButton_5);
		
		txtMainPage = new JTextField();
		txtMainPage.setBounds(123, 0, 557, 88);
		txtMainPage.setFont(new Font("Times New Roman", Font.BOLD, 22));
		txtMainPage.setBackground(new Color(181, 137, 186));
		contentPane.add(txtMainPage);
		txtMainPage.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Log Out");
		btnNewButton_2.setBounds(21, 382, 101, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mp =new MainPage();
				mp.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Calisto MT", Font.BOLD, 15));
		btnNewButton_2.setToolTipText("");
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 124, 450);
		textField.setBackground(new Color(64, 0, 64));
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtHiWelcomeTo = new JTextField();
		txtHiWelcomeTo.setBounds(150, 120, 476, 139);
		txtHiWelcomeTo.setFont(new Font("Calisto MT", Font.BOLD, 16));
		contentPane.add(txtHiWelcomeTo);
		txtHiWelcomeTo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(150, 279, 275, 160);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Vedanshi Sahu\\Downloads\\website-background-design-guide-768x492 (1).png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Vedanshi Sahu\\Downloads\\Screenshot 2023-04-06 125550.jpg"));
		lblNewLabel_8.setBounds(0, 96, 122, 401);
		contentPane.add(lblNewLabel_8);
	}
}
