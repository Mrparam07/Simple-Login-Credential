package userLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGIN {

	private JFrame frame;
	private JTable table;
	private JTextField txtUserLogin;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 28));
		frame.setBounds(100, 100, 635, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(60, 170, 264, -53);
		frame.getContentPane().add(table);
		
		txtUserLogin = new JTextField();
		txtUserLogin.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		txtUserLogin.setText("USER LOGIN");
		txtUserLogin.setBounds(168, 10, 292, 42);
		frame.getContentPane().add(txtUserLogin);
		txtUserLogin.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(40, 134, 159, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(40, 218, 182, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(211, 210, 249, 34);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username=textField.getText();
				String password=passwordField.getText();
				if(username.contains("Paramveer") && password.contains("Singh"))
				{
					
					JOptionPane.showMessageDialog(frame," PARAMVEER ","WELCOME",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showMessageDialog(frame, "You Pressed Button FOUR",
                           // "INFORMATION",
                            //JOptionPane.INFORMATION_MESSAGE);

				}
				else
				{
					JOptionPane.showMessageDialog(null," INVALID LOGIN","ERROR",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					textField.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(55, 311, 120, 21);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(211, 126, 249, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnForget = new JButton("RESET");
		btnForget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnForget.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnForget.setBounds(211, 311, 139, 21);
		frame.getContentPane().add(btnForget);
		
		JButton btnReset = new JButton("EXIT");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnReset.setBounds(401, 311, 120, 21);
		frame.getContentPane().add(btnReset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(650, 69, -670, 34);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(211, 93, 159, -7);
		frame.getContentPane().add(separator_1);
	}
}
