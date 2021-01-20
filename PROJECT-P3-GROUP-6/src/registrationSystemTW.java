import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registrationSystemTW extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private JTextField jtxtRefNo;
	private JTextField jtxtFirstname;
	private JTextField jtxtSurname;
	private JTextField jtxtAddress;
	private JTextField jtxtPostCode;
	private JTextField jtxtTelephone;
	private JTextField jtxtDateReg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationSystemTW frame = new registrationSystemTW();
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
	public registrationSystemTW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 10, 1338, 637);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(26, 26, 1280, 95);
		panel.add(panel_1);
		
		JLabel lblMembershipRegistrationSystem = new JLabel("Traveller Registration System");
		lblMembershipRegistrationSystem.setFont(new Font("Algerian", Font.BOLD, 50));
		lblMembershipRegistrationSystem.setBounds(210, 11, 847, 61);
		panel_1.add(lblMembershipRegistrationSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(26, 132, 518, 381);
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Reference No");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(28, 26, 150, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFirstname.setBounds(28, 58, 150, 25);
		panel_2.add(lblFirstname);
		
		jtxtRefNo = new JTextField();
		jtxtRefNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtRefNo.setColumns(10);
		jtxtRefNo.setBounds(245, 25, 218, 27);
		panel_2.add(jtxtRefNo);
		
		jtxtFirstname = new JTextField();
		jtxtFirstname.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtFirstname.setColumns(10);
		jtxtFirstname.setBounds(245, 57, 218, 26);
		panel_2.add(jtxtFirstname);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtSurname.setColumns(10);
		jtxtSurname.setBounds(245, 92, 218, 26);
		panel_2.add(jtxtSurname);
		
		jtxtAddress = new JTextField();
		jtxtAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtAddress.setColumns(10);
		jtxtAddress.setBounds(245, 123, 218, 26);
		panel_2.add(jtxtAddress);
		
		jtxtPostCode = new JTextField();
		jtxtPostCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtPostCode.setColumns(10);
		jtxtPostCode.setBounds(245, 152, 218, 26);
		panel_2.add(jtxtPostCode);
		
		jtxtTelephone = new JTextField();
		jtxtTelephone.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtTelephone.setColumns(10);
		jtxtTelephone.setBounds(245, 182, 218, 26);
		panel_2.add(jtxtTelephone);
		
		jtxtDateReg = new JTextField();
		jtxtDateReg.setFont(new Font("Tahoma", Font.BOLD, 20));
		jtxtDateReg.setColumns(10);
		jtxtDateReg.setBounds(245, 212, 218, 26);
		panel_2.add(jtxtDateReg);
		
		JComboBox cmbProveofID = new JComboBox();
		cmbProveofID.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Africa", "Asia", "Australia", "Europe"}));
		cmbProveofID.setFont(new Font("Tahoma", Font.BOLD, 20));
		cmbProveofID.setBounds(245, 245, 218, 33);
		panel_2.add(cmbProveofID);
		
		JLabel lblIcpassportNo = new JLabel("IC/Passport ");
		lblIcpassportNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIcpassportNo.setBounds(28, 94, 154, 25);
		panel_2.add(lblIcpassportNo);
		
		JLabel label_1 = new JLabel("Address");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(28, 125, 154, 25);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Post Code");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(28, 153, 154, 25);
		panel_2.add(label_2);
		
		JLabel lblTelephoneNo = new JLabel("Telephone No\r\n");
		lblTelephoneNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTelephoneNo.setBounds(28, 184, 154, 25);
		panel_2.add(lblTelephoneNo);
		
		JLabel label_4 = new JLabel("Date Registed");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(28, 220, 154, 25);
		panel_2.add(label_4);
		
		JLabel lblChosenContinent = new JLabel("Chosen Continent");
		lblChosenContinent.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblChosenContinent.setBounds(28, 250, 187, 25);
		panel_2.add(lblChosenContinent);
		
		JLabel lblTotalTraveller = new JLabel("Total Traveller");
		lblTotalTraveller.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalTraveller.setBounds(28, 286, 187, 25);
		panel_2.add(lblTotalTraveller);
		
		JLabel lblBudgetAmount = new JLabel("Budjet (RM)");
		lblBudgetAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBudgetAmount.setBounds(28, 333, 154, 25);
		panel_2.add(lblBudgetAmount);
		
		JComboBox cmbAmountPaid = new JComboBox();
		cmbAmountPaid.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "1000", "3000", "5000", "10000"}));
		cmbAmountPaid.setFont(new Font("Tahoma", Font.BOLD, 20));
		cmbAmountPaid.setBounds(245, 329, 218, 33);
		panel_2.add(cmbAmountPaid);
		
		JComboBox cmbMembership = new JComboBox();
		cmbMembership.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "1", "2", "3", "More than 3"}));
		cmbMembership.setFont(new Font("Tahoma", Font.BOLD, 20));
		cmbMembership.setBounds(245, 286, 218, 33);
		panel_2.add(cmbMembership);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(26, 524, 1280, 85);
		panel.add(panel_3);
		
		JButton button = new JButton("Add Record");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.addRow(new Object[]{			            
				            jtxtRefNo.getText(),
							jtxtFirstname.getText(),
							jtxtSurname.getText(),
							jtxtAddress.getText(),
							jtxtPostCode.getText(),
							jtxtTelephone.getText(),
							jtxtDateReg.getText(),
							cmbProveofID.getSelectedItem(),
							cmbMembership.getSelectedItem(),
							cmbAmountPaid.getSelectedItem(),
		    	   });
			     
			        
			       if (table.getSelectedRow() == -1){
			           if (table.getRowCount() == 0){
			           JOptionPane.showMessageDialog(null, "Membership Update confirmed","Membership  Management System",
			                   JOptionPane.OK_OPTION);
			           }
			       }   
			     
			        }
			        
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(43, 23, 179, 33);
		panel_3.add(button);
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtRefNo.setText("");
				jtxtFirstname.setText("");
				jtxtSurname.setText("");
				jtxtAddress.setText("");
				jtxtPostCode.setText("");
				jtxtTelephone.setText("");
				jtxtDateReg.setText("");		       
				cmbProveofID.setSelectedItem("Make a Selection");
				cmbMembership.setSelectedItem("Make a Selection");
				cmbAmountPaid.setSelectedItem("Make a Selection");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(260, 23, 179, 33);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("Delete");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
		        if(table.getSelectedRow()==-1){
		            if(table.getRowCount()==0){

		                JOptionPane.showMessageDialog(null, "No data to delete ", 
		                        "Membership Management System",JOptionPane.OK_OPTION);
		            }else{

		                JOptionPane.showMessageDialog(null, "Select a row to delete ", 
		                        "Membership Management System",JOptionPane.OK_OPTION);
		            }
		        }else{
		            model.removeRow(table.getSelectedRow());
		        }     
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(740, 23, 179, 33);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("Exit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame =new JFrame();
		        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Membership Registration Systems",
		              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
		            System.exit(0);
		        }
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(1000, 23, 179, 33);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("Print");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try
				{
					table.print();
				}
				catch(java.awt.print.PrinterException e){
					System.err.format("No Printer found", e.getMessage());
				}	
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(501, 23, 179, 33);
		panel_3.add(button_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(562, 132, 744, 381);
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 37, 681, 333);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Reference No", "Firstname", "IC/Passport", "Address", "Post Code", "Telephone No", "Date Reg", "Choosen Continent", "Total Traveller", "Amount Paid"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		scrollPane.setViewportView(table);
	}
}