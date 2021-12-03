package essay1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Essay1 {
	/**
	 * Nama: M. Acla Alamsyah Putra
	 * NIM: 1922423380
	 */
	private JFrame frame;
	private JTextField textFieldHasil;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Essay1 window = new Essay1();
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
	public Essay1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int uts = 90;
		int uas = 85;
		int tm = 70;
		
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 309, 241);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel diketahui = new JLabel("Diketahui:");
		diketahui.setBounds(28, 23, 63, 24);
		panel.add(diketahui);
		
		JLabel lblNilaiUts = new JLabel("Nilai UTS  = 90");
		lblNilaiUts.setBounds(28, 55, 83, 20);
		panel.add(lblNilaiUts);
		
		JLabel lblNilaiUas = new JLabel("Nilai UAS = 85");
		lblNilaiUas.setBounds(28, 75, 83, 20);
		panel.add(lblNilaiUas);
		
		JLabel lblNilaiTm = new JLabel("Nilai TM = 70");
		lblNilaiTm.setBounds(28, 94, 83, 20);
		panel.add(lblNilaiTm);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldHasil.setText(Integer.toString((uts * 30)/100 + (tm * 30)/100 + (uas * 40)/100));
			}
		});
		btnProses.setBounds(148, 74, 89, 23);
		panel.add(btnProses);
		
		textFieldHasil = new JTextField();
		textFieldHasil.setEditable(false);
		textFieldHasil.setBounds(148, 134, 89, 20);
		panel.add(textFieldHasil);
		textFieldHasil.setColumns(10);
		
		JLabel lblHasilNilaiAkhir = new JLabel("Hasil Nilai Akhir Adalah");
		lblHasilNilaiAkhir.setBounds(28, 137, 129, 14);
		panel.add(lblHasilNilaiAkhir);
	}
}
