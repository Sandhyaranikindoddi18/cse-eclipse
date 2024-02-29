import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movie {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
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
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" movie app");
		lblNewLabel.setBackground(new Color(50, 205, 50));
		lblNewLabel.setBounds(169, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("user");
		lblNewLabel_1.setBounds(88, 46, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setForeground(new Color(0, 128, 0));
		tb1.setBackground(new Color(173, 216, 230));
		tb1.setBounds(169, 43, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("movie");
		lblNewLabel_2.setBackground(new Color(169, 169, 169));
		lblNewLabel_2.setBounds(88, 87, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"rrr", "kgf", "salaar", "adipurush", "billa"}));
		cb1.setBounds(169, 83, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("no oftickets");
		lblNewLabel_3.setBounds(88, 131, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cb2.setBounds(169, 127, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton b1 = new JButton("submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String user= tb1.getText();
			 String movie= (String) cb1.getSelectedItem();
			 String nooftickets = (String) cb2.getSelectedItem();
			 int nt = Integer.parseInt(nooftickets);
			 int bill=0;
			 if(movie.equals("rrr"))
			 {
				 bill= nt*150;
				 
			 }
			 if(movie.equals("salaar"))
			 {
				 bill= nt*350;
				 
			 } if(movie.equals("adipurush"))
			 {
				 bill= nt*280;
				 
			 } if(movie.equals("billa"))
			 {
				 bill= nt*300;
				 
			 } if(movie.equals("kgf"))
			 {
				 bill= nt*250;
				 
			 }
			 
			 int res=0;
			 res = JOptionPane.showConfirmDialog(b1, "name" + user +"\n\n movie" + movie + "\n\n no oftickets"+ nooftickets+"\nbill"+bill);			 
			 if(res==JOptionPane.YES_OPTION)
			 {
				 JOptionPane.showMessageDialog(b1, "Booking confirmed");
				 		tb1.setText("");;
				 		cb1.setSelectedItem("");
				 	
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(b1, "Booking cancelled");
				 
			 }
			 
			}
			
			
			
			
		});
		b1.setBounds(102, 214, 89, 23);
		frame.getContentPane().add(b1);
	}

}
