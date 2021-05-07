package com.cibertec.windows.configs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfigDailyQuota extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtDailyQuota;

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
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 450, 102);
		getContentPane().setLayout(null);
		{
			JLabel lblDailyQuota = new JLabel("Cuota diaria esperada (S/.)");
			lblDailyQuota.setBounds(10, 11, 141, 14);
			getContentPane().add(lblDailyQuota);
		}
		{
			txtDailyQuota = new JTextField();
			txtDailyQuota.setBounds(169, 8, 100, 20);
			getContentPane().add(txtDailyQuota);
			txtDailyQuota.setColumns(10);
		}
		{
			JButton btnAccept = new JButton("Aceptar");
			btnAccept.setBounds(335, 7, 89, 23);
			getContentPane().add(btnAccept);
		}
		{
			JButton btnCancel = new JButton("Cancelar");
			btnCancel.setBounds(335, 33, 89, 23);
			getContentPane().add(btnCancel);
		}
	}

}
