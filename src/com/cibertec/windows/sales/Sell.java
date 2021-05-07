package com.cibertec.windows.sales;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import com.cibertec.operations.Data;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sell extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblModel;
	private JLabel lblPrice;
	private JLabel lblQuantity;
	private JComboBox<String> cboModel;
	private JTextField txtPrice;
	private JTextField txtQuantity;
	private JButton btnSell;
	private JButton btnClose;
	private JScrollPane scpTxtArea;
	private JTextArea txtAreaResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			Sell dialog = new Sell();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sell() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblModel = new JLabel("Modelo");
		lblModel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModel);
		
		lblPrice = new JLabel("Precio");
		lblPrice.setBounds(10, 36, 46, 14);
		getContentPane().add(lblPrice);
		
		lblQuantity = new JLabel("Cantidad");
		lblQuantity.setBounds(10, 61, 46, 14);
		getContentPane().add(lblQuantity);
		
		cboModel = new JComboBox<String>();
		cboModel.setModel(new DefaultComboBoxModel<String>(new String[] {Data.modelo0, Data.modelo1, Data.modelo2, Data.modelo3, Data.modelo4}));
		cboModel.setBounds(89, 7, 164, 22);
		getContentPane().add(cboModel);
		
		txtPrice = new JTextField();
		txtPrice.setEditable(false);
		txtPrice.setBounds(89, 33, 109, 20);
		getContentPane().add(txtPrice);
		txtPrice.setColumns(10);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(89, 58, 109, 20);
		getContentPane().add(txtQuantity);
		txtQuantity.setColumns(10);
		
		btnSell = new JButton("Vender");
		btnSell.setBounds(335, 7, 89, 23);
		getContentPane().add(btnSell);
		
		btnClose = new JButton("Cerrar");
		btnClose.addActionListener(this);
		btnClose.setBounds(335, 32, 89, 23);
		getContentPane().add(btnClose);
		
		scpTxtArea = new JScrollPane();
		scpTxtArea.setBounds(10, 86, 414, 164);
		getContentPane().add(scpTxtArea);
		
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