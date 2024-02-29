import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class register {

	private JFrame frame;
	private JTextField tb1;
	private JTextField p1;
	private final JLabel newlabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
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
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("registration");
		lblNewLabel.setBounds(158, 23, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setBounds(98, 56, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(158, 53, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(98, 95, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		p1 = new JTextField();
		p1.setBounds(158, 92, 86, 20);
		frame.getContentPane().add(p1);
		p1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("branch");
		lblNewLabel_3.setBounds(98, 140, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"cse", "ece", "it", "mech", "civil", "aiml"}));
		cb1.setBounds(158, 136, 96, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("city");
		lblNewLabel_4.setBounds(98, 173, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"hyderabad", "nizamabad", "warangal", "mahabubabad", "karimnagar"}));
		cb2.setBounds(158, 169, 106, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_5 = new JLabel("gender");
		lblNewLabel_5.setBounds(98, 200, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r1 = new JRadioButton("female");
		r1.setBounds(158, 196, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("male");
		r2.setBounds(286, 196, 109, 23);
		frame.getContentPane().add(r2);
		
		JButton b1 = new JButton("submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tb1.getText();
				//String password = p1.getText();
				String branch = (String) cb1.getSelectedItem();
				String city = (String) cb2.getSelectedItem();
				ButtonGroup rgb = new ButtonGroup();
				rgb.add(r1);
				rgb.add(r2);
				String gender = " ";
				if(r1.isSelected())
				{
				 gender = 	"male";
				}
				if(r2.isSelected())
				{

					
					gender = "female";
				}
				JOptionPane.showMessageDialog(b1, "\nName: "+ user +"\n\n Branch : " + branch + "\n\n Gender : " + gender + "\n\n city: " + city);
				}
			
		});
		b1.setBounds(144, 238, 89, 23);
		frame.getContentPane().add(b1);
		newlabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\Saved Pictures\\flower.jpg"));
		newlabel.setBounds(0, -31, 424, 292);
		frame.getContentPane().add(newlabel);
	}
}
