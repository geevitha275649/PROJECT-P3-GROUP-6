import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class CruiseGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CruiseGui frame = new CruiseGui();
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
	public CruiseGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Passenger Detail Registration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				CruisePassengerR thirdPage = new CruisePassengerR();
				thirdPage.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(127, 252, 206, 72);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Travel Schedule");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CruiseTravelSchedule fourthPage = new CruiseTravelSchedule();
				fourthPage.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(423, 252, 134, 72);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cruise Package");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CruisePackage fifthPage = new CruisePackage();
				fifthPage.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(632, 252, 134, 72);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Cruise Facilities");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CruiseFacilities sixthPage = new CruiseFacilities();
				sixthPage.setVisible(true);
				
			}
		});
		btnNewButton_2_1.setBounds(858, 252, 134, 72);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Inquiries");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CruiseInputOutput seventhPage = new CruiseInputOutput();
				seventhPage.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(1090, 252, 146, 72);
		contentPane.add(btnNewButton_3);
		
		JLabel lblCruiseFront = new JLabel("");
		Image img0 = new ImageIcon(this.getClass().getResource("/cruisefront1.jpg")).getImage();
		lblCruiseFront.setIcon(new ImageIcon(img0));
		lblCruiseFront.setBounds(0, 345, 1370, 404);
		contentPane.add(lblCruiseFront);
		
		JLabel lblPassengerIcon = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/passengerIcon.png")).getImage();
		lblPassengerIcon.setIcon(new ImageIcon(img1));
		lblPassengerIcon.setBounds(164, 129, 134, 95);
		contentPane.add(lblPassengerIcon);
		
		JLabel lblTravelScheduleIcon = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/scheduleIcon.png")).getImage();
		lblTravelScheduleIcon.setIcon(new ImageIcon(img2));
		lblTravelScheduleIcon.setBounds(423, 129, 134, 95);
		contentPane.add(lblTravelScheduleIcon);
		
		JLabel lblCruisePackageIcon = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/packageIcon.png")).getImage();
		lblCruisePackageIcon.setIcon(new ImageIcon(img3));
		lblCruisePackageIcon.setBounds(632, 129, 134, 95);
		contentPane.add(lblCruisePackageIcon);
		
		JLabel lblCruiseFacilitiesIcon = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/facilitiesIcon.png")).getImage();
		lblCruiseFacilitiesIcon.setIcon(new ImageIcon(img4));
		lblCruiseFacilitiesIcon.setBounds(858, 129, 134, 95);
		contentPane.add(lblCruiseFacilitiesIcon);
		
		JLabel lblInquiryIcon = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/inquiryIcon.png")).getImage();
		lblInquiryIcon.setIcon(new ImageIcon(img5));
		lblInquiryIcon.setBounds(1102, 129, 134, 95);
		contentPane.add(lblInquiryIcon);
	}
}
