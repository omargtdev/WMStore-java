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

public class GenerateReports extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnClose;
	private JComboBox<String> txtTypeReport;
	private JScrollPane scpTxtArea;
	private JTextArea txtAreaResult;
	private JLabel lblTypeReport;
	
	//TypeReports
	private String typeReport1 = "Ventas por modelo"; 
	private String typeReport2 = "Ventas en relaci\u00F3n a la venta \u00F3ptima"; 
	private String typeReport3 = "Precios en relaci\u00F3n al precio promedio"; 
	private String typeReport4 = "Promedios, menores y mayores"; 
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
		
		lblTypeReport = new JLabel("Tipo de reporte");
		lblTypeReport.setBounds(10, 11, 75, 14);
		contentPane.add(lblTypeReport);
		
		txtTypeReport = new JComboBox<String>();
		txtTypeReport.setModel(new DefaultComboBoxModel<String>(new String[] {typeReport1, typeReport2, typeReport3, typeReport4}));
		txtTypeReport.setBounds(95, 7, 230, 22);
		contentPane.add(txtTypeReport);
		
		btnClose = new JButton("Cerrar");
		btnClose.addActionListener(this);
		
		btnClose.setBounds(335, 7, 89, 23);
		contentPane.add(btnClose);
		
		scpTxtArea = new JScrollPane();
		scpTxtArea.setBounds(10, 36, 414, 214);
		contentPane.add(scpTxtArea);
		
		txtAreaResult = new JTextArea();
		scpTxtArea.setViewportView(txtAreaResult);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClose) {
			actionPerformedBtnClose(e);
		}
	}
	protected void actionPerformedBtnClose(ActionEvent e) {
	}
}