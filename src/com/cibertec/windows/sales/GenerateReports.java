package com.cibertec.windows.sales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class GenerateReports extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerateReports frame = new GenerateReports();
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
	public GenerateReports() {
		setTitle("Generar Reportes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTypeReport = new JLabel("Tipo de reporte");
		lblTypeReport.setBounds(10, 11, 75, 14);
		contentPane.add(lblTypeReport);
		
		JComboBox<String> txtTypeReport = new JComboBox<String>();
		txtTypeReport.setModel(new DefaultComboBoxModel<String>(new String[] {"Ventas por modelo", "Ventas en relaci\u00F3n a la venta \u00F3ptima", "Precios en relaci\u00F3n al precio promedio", "Promedios, menores y mayores"}));
		txtTypeReport.setBounds(95, 7, 230, 22);
		contentPane.add(txtTypeReport);
		
		JButton btnClose = new JButton("Cerrar");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClose.setBounds(335, 7, 89, 23);
		contentPane.add(btnClose);
		
		JTextArea txtAreaResult = new JTextArea();
		txtAreaResult.setBounds(10, 36, 414, 214);
		contentPane.add(txtAreaResult);
		
		JScrollPane scoTxtArea = new JScrollPane();
		scoTxtArea.setBounds(10, 36, 414, 214);
		contentPane.add(scoTxtArea);
	}

}