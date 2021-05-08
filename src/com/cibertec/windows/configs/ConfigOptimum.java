package com.cibertec.windows.configs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.cibertec.operations.Validations;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigOptimum extends JDialog implements ActionListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtOptimalQuantity;
	private JButton btnCancel;
	private JButton btnAccept;
	private JLabel lblOptimalQuantity;
	private Validations val;

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
			ConfigOptimum dialog = new ConfigOptimum();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigOptimum() {
		
		val = new Validations();
		
		setTitle("Configurar cantidad óptima");
		setBounds(100, 100, 450, 105);
		getContentPane().setLayout(null);
		
		lblOptimalQuantity = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lblOptimalQuantity.setBounds(10, 11, 193, 14);
		getContentPane().add(lblOptimalQuantity);

		txtOptimalQuantity = new JTextField();
		txtOptimalQuantity.setBounds(213, 8, 54, 20);
		getContentPane().add(txtOptimalQuantity);

		txtOptimalQuantity.setColumns(10);
		btnAccept = new JButton("Aceptar");
		btnAccept.addActionListener(this);
		btnAccept.setBounds(335, 7, 89, 23);
		getContentPane().add(btnAccept);

		btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(this);
		btnCancel.setBounds(335, 33, 89, 23);
		getContentPane().add(btnCancel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAccept) {
			actionPerformedBtnAccept(e);
		}
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
	}

	protected void actionPerformedBtnCancel(ActionEvent e) {
	}

	protected void actionPerformedBtnAccept(ActionEvent e) {
		if(val.isNotEmpty(txtOptimalQuantity.getText(), lblOptimalQuantity.getText()) && val.isInt(txtOptimalQuantity.getText(), lblOptimalQuantity.getText())) {

		}
	}
}
