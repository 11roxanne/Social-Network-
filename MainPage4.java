package module;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage4 frame = new MainPage4();
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
	public MainPage4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 215, 232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_6 = new JButton(" Search ");
		btnNewButton_6.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_6.setBounds(391, 360, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("Remove");
		btnNewButton_5.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_5.setBounds(391, 270, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton(" Add");
		btnNewButton_4.setFont(new Font("Calisto MT", Font.BOLD, 15));
		btnNewButton_4.setBounds(391, 195, 89, 23);
		contentPane.add(btnNewButton_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(361, 329, 153, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(361, 239, 153, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(361, 161, 153, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel(" Search Friends ");
		lblNewLabel_4.setFont(new Font("Calisto MT", Font.BOLD, 18));
		lblNewLabel_4.setBounds(177, 323, 164, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Remove Friends ");
		lblNewLabel_3.setFont(new Font("Calisto MT", Font.BOLD, 18));
		lblNewLabel_3.setBounds(177, 233, 141, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Add Friends ");
		lblNewLabel_2.setFont(new Font("Calisto MT", Font.BOLD, 18));
		lblNewLabel_2.setBounds(177, 161, 125, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(" Friends ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_1.setBounds(120, 38, 141, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("  Thrive");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(0, 37, 100, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Post");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage4  mp4 =new MainPage4();
				mp4.dispose();
				MainPage3 mp3=new MainPage3();
				mp3.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_2.setBounds(10, 257, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage4  mp4 =new MainPage4();
				mp4.dispose();
				MainPage2 mp2=new MainPage2();
				mp2.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_1.setBounds(10, 196, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage4  mp4 =new MainPage4();
				mp4.dispose();
				MainPage mp=new MainPage();
				mp.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton.setBounds(10, 129, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage4  mp4 =new MainPage4();
				mp4.dispose();
				
			}
		});
		btnNewButton_3.setFont(new Font("Calisto MT", Font.BOLD, 14));
		btnNewButton_3.setBounds(10, 380, 89, 23);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBackground(new Color(64, 0, 64));
		textField.setBounds(0, 0, 110, 452);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(185, 149, 182));
		textField_1.setBounds(110, 0, 567, 86);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(202, 174, 200));
		textField_2.setBounds(139, 130, 469, 274);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
