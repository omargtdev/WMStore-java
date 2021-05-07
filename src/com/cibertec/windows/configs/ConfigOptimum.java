package com.cibertec.windows.configs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ConfigOptimum extends JDialog {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtOptimalQuantity;

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
		setTitle("Configurar cantidad óptima");
		setBounds(100, 100, 450, 105);
		getContentPane().setLayout(null);
		{
			JLabel lblOptimalQuantity = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
			lblOptimalQuantity.setBounds(10, 11, 193, 14);
			getContentPane().add(lblOptimalQuantity);
		}
		{
			txtOptimalQuantity = new JTextField();
			txtOptimalQuantity.setBounds(213, 8, 54, 20);
			getContentPane().add(txtOptimalQuantity);
			txtOptimalQuantity.setColumns(10);
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
