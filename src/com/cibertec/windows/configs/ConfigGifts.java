package com.cibertec.windows.configs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.cibertec.operations.Validations;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigGifts extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txt6toMore;
	private JTextField txt2to5Units;
	private JTextField txt1Unit;
	private JButton btnCancel;
	private JLabel lbl1Unit;
	private JLabel lbl2to5Units;
	private JLabel lbl6toMore;
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

		val = new Validations();

		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 130);
		getContentPane().setLayout(null);

		lbl1Unit = new JLabel("1 unidad");
		lbl1Unit.setBounds(10, 11, 46, 14);
		getContentPane().add(lbl1Unit);

		lbl2to5Units = new JLabel("2 a 5 unidades");
		lbl2to5Units.setBounds(10, 36, 75, 14);
		getContentPane().add(lbl2to5Units);

		lbl6toMore = new JLabel("6 a m\u00E1s unidades");
		lbl6toMore.setBounds(10, 61, 90, 14);
		getContentPane().add(lbl6toMore);

		txt6toMore = new JTextField();
		txt6toMore.setBounds(176, 58, 86, 20);
		getContentPane().add(txt6toMore);
		txt6toMore.setColumns(10);

		txt2to5Units = new JTextField();
		txt2to5Units.setBounds(176, 33, 86, 20);
		getContentPane().add(txt2to5Units);
		txt2to5Units.setColumns(10);

		txt1Unit = new JTextField();
		txt1Unit.setBounds(176, 8, 86, 20);
		getContentPane().add(txt1Unit);
		txt1Unit.setColumns(10);

		btnAccept = new JButton("Aceptar");
		btnAccept.addActionListener(this);
		btnAccept.setBounds(335, 7, 89, 23);
		getContentPane().add(btnAccept);

		btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(this);
		btnCancel.setBounds(335, 32, 89, 23);
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
		if(validateInputs()) {
			//Operation
		}
	}
	
	private boolean validateInputs() {
		if(val.isNotEmpty(txt1Unit.getText(), lbl1Unit.getText()) && 
		   val.isNotEmpty(txt2to5Units.getText(), lbl2to5Units.getText()) && 
		   val.isNotEmpty(txt6toMore.getText(), lbl6toMore.getText()) && 
		   val.isString(txt1Unit.getText(), lbl1Unit.getText()) && 
		   val.isString(txt2to5Units.getText(), lbl2to5Units.getText()) && 
		   val.isString(txt6toMore.getText(), lbl6toMore.getText())) {
			return true;
		}else {
			return false;
		}
	}
}
