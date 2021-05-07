package com.cibertec.windows.configs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ConfigGifts extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txt6toMore;
	private JTextField txt2to5Units;
	private JTextField txt1Unit;

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
			ConfigGifts dialog = new ConfigGifts();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigGifts() {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 130);
		getContentPane().setLayout(null);
		{
			JLabel lbl1Unit = new JLabel("1 unidad");
			lbl1Unit.setBounds(10, 11, 46, 14);
			getContentPane().add(lbl1Unit);
		}
		{
			JLabel lbl2to5Units = new JLabel("2 a 5 unidades");
			lbl2to5Units.setBounds(10, 36, 75, 14);
			getContentPane().add(lbl2to5Units);
		}
		{
			JLabel lbl6toMore = new JLabel("6 a m\u00E1s unidades");
			lbl6toMore.setBounds(10, 61, 90, 14);
			getContentPane().add(lbl6toMore);
		}
		{
			txt6toMore = new JTextField();
			txt6toMore.setBounds(176, 58, 86, 20);
			getContentPane().add(txt6toMore);
			txt6toMore.setColumns(10);
		}
		{
			txt2to5Units = new JTextField();
			txt2to5Units.setBounds(176, 33, 86, 20);
			getContentPane().add(txt2to5Units);
			txt2to5Units.setColumns(10);
		}
		{
			txt1Unit = new JTextField();
			txt1Unit.setBounds(176, 8, 86, 20);
			getContentPane().add(txt1Unit);
			txt1Unit.setColumns(10);
		}
		{
			JButton btnAccept = new JButton("Aceptar");
			btnAccept.setBounds(335, 7, 89, 23);
			getContentPane().add(btnAccept);
		}
		{
			JButton btnCancel = new JButton("Cancelar");
			btnCancel.setBounds(335, 32, 89, 23);
			getContentPane().add(btnCancel);
		}
	}

}
