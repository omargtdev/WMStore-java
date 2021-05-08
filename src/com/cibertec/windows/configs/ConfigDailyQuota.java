package com.cibertec.windows.configs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.UIManager;

import com.cibertec.operations.Validations;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigDailyQuota extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtDailyQuota;
	private JButton btnCancel;
	private JLabel lblDailyQuota;
	private JButton btnAccept;
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
			ConfigDailyQuota dialog = new ConfigDailyQuota();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigDailyQuota() {
		
		val = new Validations();
		
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 450, 102);
		getContentPane().setLayout(null);

		lblDailyQuota = new JLabel("Cuota diaria esperada (S/.)");
		lblDailyQuota.setBounds(10, 11, 141, 14);
		getContentPane().add(lblDailyQuota);

		txtDailyQuota = new JTextField();
		txtDailyQuota.setBounds(169, 8, 100, 20);
		getContentPane().add(txtDailyQuota);
		txtDailyQuota.setColumns(10);

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
		if(val.isNotEmpty(txtDailyQuota.getText(), lblDailyQuota.getText()) && val.isNumber(txtDailyQuota.getText(), lblDailyQuota.getText())) {
			
		}
	}
}
