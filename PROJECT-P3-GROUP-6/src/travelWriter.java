import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSplitPane;


public class travelWriter extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					travelWriter frame = new travelWriter();
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
	public travelWriter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Here your favourite continent!!!", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Country that we provide!", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(483, 255, 234, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBounds(0, 0, 234, 138);
		panel.add(list);
		list.setBackground(Color.WHITE);

		
		JButton btnChoose = new JButton("LIST OF CONTINENT !!");
		btnChoose.setBackground(Color.WHITE);
		btnChoose.setFont(new Font("Constantia", Font.BOLD, 12));
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel DLM = new DefaultListModel();
				DLM.addElement("Africa");
				DLM.addElement("Asia");
				DLM.addElement("Australia");
				DLM.addElement("Europe");
				list.setModel(DLM);
			}
		});
		btnChoose.setBounds(244, 221, 350, 23);
		contentPane.add(btnChoose);
		
		JButton btnBooking = new JButton("Go for Booking");
		btnBooking.setBackground(Color.WHITE);
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
			    "Booking is currently unavailable due to Covid-19 pandemic. We apoligize for the inconvenience.");
			}
		});
		btnBooking.setBounds(514, 397, 175, 23);
		contentPane.add(btnBooking);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(38, 255, 410, 235);
		contentPane.add(textPane);

		
		JButton AfricaButton = new JButton("AFRICA");
		AfricaButton.setBackground(Color.WHITE);
		AfricaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Town: Seychelles \r\n"
						+ "\nIsland: Praslin Island \r\n"
						+ "\nHotel room available: \n 1) Single \r\n"
						+ "\n 2) Queen \r\n"
						+ "\n 3) King \r\n"
						+ "\nTraditional food: Bunny Chow, South Africa \r\n"
						+ "\nTransport use: Toyota Hilux \r\n");
			}
		});
		AfricaButton.setForeground(Color.BLACK);
		AfricaButton.setBounds(178, 65, 101, 70);
		contentPane.add(AfricaButton);
		
		JButton AsiaButton = new JButton("ASIA");
		AsiaButton.setBackground(Color.WHITE);
		AsiaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Town: Perak \r\n"
						+ "\nIsland: Pangkor Island \r\n"
						+ "\nHotel room available: \n 1) Single \r\n"
						+ "\n 2) Queen \r\n"
						+ "\n 3) King \r\n"
						+ "\nTraditional food: Satay\r\n"
						+ "\nTransport use : Proton X70\r\n");
			}
		});
		AsiaButton.setForeground(Color.BLACK);
		AsiaButton.setBounds(556, 65, 101, 70);
		contentPane.add(AsiaButton);
		
		JButton Australia = new JButton("AUSTRALIA");
		Australia.setBackground(Color.WHITE);
		Australia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Town: Queensland \r\n"
						+ "\nIsland: Fraser Island \r\n"
						+ "\nHotel room available: \n 1) Single \r\n"
						+ "\n 2) Queen \r\n"
						+ "\n 3) King \r\n"
						+ "\nTraditional food: Pavlova  \r\n"
						+ "\nTransport use : Ford Ranger \r\n");
			}
		});
		Australia.setForeground(Color.BLACK);
		Australia.setBounds(178, 146, 101, 64);
		contentPane.add(Australia);
		
		JButton Europe = new JButton("EUROPE");
		Europe.setBackground(Color.WHITE);
		Europe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Town: Norway \r\n"
						+ "\nIsland: Lyngor Island \r\n"
						+ "\nHotel room available: \n 1) Single \r\n"
						+ "\n 2) Queen \r\n"
						+ "\n 3) King \r\n"
						+ "\nTraditional food : Waffles\r\n"
						+ "\nTransport use: Volkswagen Passat \r\n");
			}
		});
		Europe.setForeground(Color.BLACK);
		Europe.setBounds(556, 146, 101, 64);
		contentPane.add(Europe);
		
		JLabel lblNewLabel = new JLabel("Click here for the details!");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 31, 319, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/africa5.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(289, 65, 89, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/australia5.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(289, 145, 101, 66);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/asia5.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		lblNewLabel_3.setBounds(483, 65, 63, 64);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/europe5.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		lblNewLabel_4.setBounds(483, 146, 63, 59);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(556, 473, 89, 23);
		contentPane.add(btnNewButton);
			
		
	}
}