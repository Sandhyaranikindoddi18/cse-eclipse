import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecommerce {

	private JFrame frame;
	int items=0;
	int bill=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommerce window = new ecommerce();
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
	public ecommerce() {
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
		
		JLabel lblNewLabel = new JLabel("ecommerce website");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(115, 11, 261, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rs:280");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(51, 215, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs:300");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(182, 215, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rs:600");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(305, 200, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel l1 = new JLabel("cart");
		l1.setFont(new Font("Verdana", Font.BOLD, 13));
		l1.setBounds(305, 30, 141, 14);
		frame.getContentPane().add(l1);
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				bill=bill+280;
				
				l1.setText("CART :"+items);
				
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\Saved Pictures\\img2.jpg"));
		b1.setBounds(10, 54, 111, 136);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				bill=bill+300;
			
				l1.setText("CART :"+items);
				
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\Saved Pictures\\img3.jpg"));
		b2.setBounds(153, 54, 104, 136);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("New button");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				bill=bill+600;
			
				
				l1.setText("CART :"+items);
				
			}
		});
		b3.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\Saved Pictures\\img4.jpg"));
		b3.setBounds(295, 55, 104, 134);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("buy");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b4, "noofitems" + items + "\n\n total bill" + bill);
				
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 15));
		b4.setBounds(340, 227, 89, 23);
		frame.getContentPane().add(b4);
	}
}
