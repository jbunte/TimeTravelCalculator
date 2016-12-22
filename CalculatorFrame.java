import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalculatorFrame extends JFrame {

	private JPanel contentPane;
	private JTextField milesTFld;
	private JTextField mphTFld;
	private JTextField hoursTFld;
	private JTextField minsTFld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
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
	public CalculatorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Time Travel Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel milesLbl = new JLabel("Miles:");
		
		JLabel mphLbl = new JLabel("Miles per hour:");
		
		JLabel hoursLbl = new JLabel("Hours:");
		
		JLabel minsLbl = new JLabel("Minutes:");
		
		milesTFld = new JTextField();
		milesTFld.setColumns(10);
		
		mphTFld = new JTextField();
		mphTFld.setColumns(10);
		
		JButton btnClickToEstimate = new JButton("Click to estimate travel time");
		btnClickToEstimate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int miles = Integer.parseInt((milesTFld.getText()));
				int mph = Integer.parseInt(mphTFld.getText());
				String hours = Integer.toString(miles / mph);
				hoursTFld.setText(hours);
				String mins = Integer.toString(((miles % mph)*60)/mph);
				minsTFld.setText(mins);
			}
		});
		btnClickToEstimate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		hoursTFld = new JTextField();
		hoursTFld.setColumns(10);
		
		minsTFld = new JTextField();
		minsTFld.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(mphLbl)
								.addComponent(milesLbl)
								.addComponent(hoursLbl)
								.addComponent(minsLbl))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(minsTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(hoursTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(milesTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mphTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(51)
							.addComponent(btnClickToEstimate, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(milesLbl)
						.addComponent(milesTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(mphLbl)
						.addComponent(mphTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnClickToEstimate, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(hoursLbl)
						.addComponent(hoursTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(minsTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(minsLbl))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
