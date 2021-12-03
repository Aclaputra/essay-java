package essay2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Essay2 {
	/**
	 * Nama: M. Acla Alamsyah Putra
	 * NIM: 1922423380
	 */
	private JFrame frame;
	private JTextField textFieldReamur;
	private JTextField textFieldFahrenheit;
	private JTextField textFieldKelvin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Essay2 window = new Essay2();
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
	public Essay2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		float suhuAndi = 37;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 505, 219);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel diketahui = new JLabel("Diketahui:");
		diketahui.setBounds(28, 27, 71, 14);
		panel.add(diketahui);
		
		JLabel lblSuhuBadanAndi = new JLabel("Suhu badan Andi 37 derajat celcius");
		lblSuhuBadanAndi.setBounds(28, 52, 195, 14);
		panel.add(lblSuhuBadanAndi);
		
		JLabel lblPerintah = new JLabel("ubahlah ke dalam Reamur [R=(4/5)*C], Fahrenheit [F=(9/5)*C+32], dan kelvin [K=C+273]");
		lblPerintah.setBounds(28, 77, 440, 14);
		panel.add(lblPerintah);
		
		JLabel lblHasilReamur = new JLabel("Hasil Reamur :");
		lblHasilReamur.setBounds(28, 102, 83, 14);
		panel.add(lblHasilReamur);
		
		JLabel lblHasilFahrenheit = new JLabel("Hasil Fahrenheit :");
		lblHasilFahrenheit.setBounds(28, 127, 99, 14);
		panel.add(lblHasilFahrenheit);
		
		JLabel lblHasilKelvin = new JLabel("Hasil Kelvin :");
		lblHasilKelvin.setBounds(28, 152, 99, 14);
		panel.add(lblHasilKelvin);
		
		textFieldReamur = new JTextField();
		textFieldReamur.setEditable(false);
		textFieldReamur.setColumns(10);
		textFieldReamur.setBounds(148, 102, 86, 20);
		panel.add(textFieldReamur);
		
		textFieldFahrenheit = new JTextField();
		textFieldFahrenheit.setEditable(false);
		textFieldFahrenheit.setColumns(10);
		textFieldFahrenheit.setBounds(148, 124, 86, 20);
		panel.add(textFieldFahrenheit);
		
		textFieldKelvin = new JTextField();
		textFieldKelvin.setEditable(false);
		textFieldKelvin.setColumns(10);
		textFieldKelvin.setBounds(148, 149, 86, 20);
		panel.add(textFieldKelvin);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldFahrenheit.setText(Float.toString(suhuAndi*9.0f/5.0f+32));
				textFieldKelvin.setText(Float.toString(suhuAndi+273.15f));
				textFieldReamur.setText(Float.toString(suhuAndi*4.0f/5.0f));
			}
		});
		btnProses.setBounds(273, 123, 89, 23);
		panel.add(btnProses);
	}

}
