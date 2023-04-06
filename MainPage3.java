package module;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MainPage3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage3 frame = new MainPage3();
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
	public MainPage3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 221, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton_1 = new JButton("Submit ");
		btnNewButton_1.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_1.setBounds(526, 295, 89, 31);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Friends");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage3 mp3=new MainPage3();
				mp3.dispose();
				MainPage4 mp4=new MainPage4();
				mp4.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_2.setBounds(24, 263, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_4 = new JButton("Home");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage3 mp3=new MainPage3();
				mp3.dispose();
				MainPage mp=new MainPage();
				mp.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_4.setBounds(24, 134, 89, 23);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Profile");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage3 mp3=new MainPage3();
				mp3.dispose();
				MainPage2 mp2=new MainPage2();
				mp2.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_5.setBounds(24, 193, 89, 23);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_3.setBounds(153, 295, 89, 31);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(24, 263, 89, 23);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Log Out");
		btnNewButton_7.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_7.setBounds(24, 383, 89, 23);
		contentPane.add(btnNewButton_7);
		
		lblNewLabel_1 = new JLabel("  Post");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_1.setBounds(145, 37, 148, 41);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel(" Thrive");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(11, 36, 111, 41);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(64, 0, 64));
		textField.setBounds(0, 0, 135, 456);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(198, 162, 194));
		textField_1.setBounds(132, 0, 504, 94);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 159, 469, 113);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Whats on your mind?");
		lblNewLabel_2.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(145, 121, 198, 27);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Vedanshi Sahu\\Desktop\\preview-page0.jpg"));
		lblNewLabel_3.setBounds(145, 337, 469, 108);
		contentPane.add(lblNewLabel_3);
	}

}
