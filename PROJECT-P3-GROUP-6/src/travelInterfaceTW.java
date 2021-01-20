import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class travelInterfaceTW extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					travelInterfaceTW frame = new travelInterfaceTW();
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
	public travelInterfaceTW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Detail Of All Continent");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				travelWriter firstPage = new travelWriter();
				firstPage.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 177, 157, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Traveller Registration Form");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrationSystemTW secondPage = new registrationSystemTW();
				secondPage.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(190, 177, 157, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Inquiries");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputOutputTW thirdPage = new inputOutputTW();
				thirdPage.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(371, 177, 153, 47);
		contentPane.add(btnNewButton_2);
	}
}