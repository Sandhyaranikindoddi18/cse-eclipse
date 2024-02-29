package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 224, 208));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setForeground(new Color(139, 0, 139));
		lblNewLabel.setBackground(new Color(135, 206, 250));
		lblNewLabel.setBounds(109, 11, 76, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(76, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setForeground(new Color(255, 20, 147));
		tb1.setBounds(157, 44, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setBounds(76, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tb1.getText();
				String password= pwd.getText();
				//JOptionPane.showMessageDialog(btnNewButton, "hello " + user + "\n password is" + password);
				if(user.equals("sandhya") && password.equals("1234"))
						{
					JOptionPane.showMessageDialog(btnNewButton, "Valid user");
						}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "invalid user");
				}
						
			}
		});
		btnNewButton.setBackground(new Color(173, 255, 47));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(109, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		pwd = new JPasswordField();
		pwd.setBounds(157, 87, 86, 20);
		frame.getContentPane().add(pwd);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblNewLabel_1, tb1, lblNewLabel_2, btnNewButton, pwd}));
	}
}
