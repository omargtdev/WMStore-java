package com.cibertec.windows.configs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.cibertec.operations.Validations;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigDiscount extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbl1to5;
	private JLabel lbl6to10;
	private JLabel lbl11to15;
	private JLabel lbl15orMore;
	private JTextField txt15orMore;
	private JTextField txt11to15;
	private JTextField txt6to10;
	private JTextField txt1to5;
	private JLabel lblPorcent1;
	private JLabel lblPorcent2;
	private JLabel lblPorcent3;
	private JLabel lblPorcent4;
	private JButton btnAccept;
	private JButton btnCancel;
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
			ConfigDiscount dialog = new ConfigDiscount();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigDiscount() {
		
		val = new Validations();

		setTitle("Configurar pocentajes de descuento");
		setBounds(100, 100, 450, 157);
		getContentPane().setLayout(null);
		
		lbl1to5 = new JLabel("1 a 5 unidades");
		lbl1to5.setBounds(10, 11, 75, 14);
		getContentPane().add(lbl1to5);
		
		lbl6to10 = new JLabel("6 a 10 unidades");
		lbl6to10.setBounds(10, 36, 87, 14);
		getContentPane().add(lbl6to10);
		
		lbl11to15 = new JLabel("11 a 15 unidades");
		lbl11to15.setBounds(10, 61, 87, 14);
		getContentPane().add(lbl11to15);
		
		lbl15orMore = new JLabel("M\u00E1s de 15 unidades");
		lbl15orMore.setBounds(10, 86, 101, 14);
		getContentPane().add(lbl15orMore);
		
		txt15orMore = new JTextField();
		txt15orMore.setBounds(121, 83, 86, 20);
		getContentPane().add(txt15orMore);
		txt15orMore.setColumns(10);
		
		txt11to15 = new JTextField();
		txt11to15.setBounds(121, 58, 86, 20);
		getContentPane().add(txt11to15);
		txt11to15.setColumns(10);
		
		txt6to10 = new JTextField();
		txt6to10.setBounds(121, 33, 86, 20);
		getContentPane().add(txt6to10);
		txt6to10.setColumns(10);
		
		txt1to5 = new JTextField();
		txt1to5.setBounds(121, 8, 86, 20);
		getContentPane().add(txt1to5);
		txt1to5.setColumns(10);
		
		lblPorcent1 = new JLabel("%");
		lblPorcent1.setBounds(218, 11, 20, 14);
		getContentPane().add(lblPorcent1);
		
		lblPorcent2 = new JLabel("%");
		lblPorcent2.setBounds(217, 36, 20, 14);
		getContentPane().add(lblPorcent2);
		
		lblPorcent3 = new JLabel("%");
		lblPorcent3.setBounds(217, 61, 20, 14);
		getContentPane().add(lblPorcent3);
		
		lblPorcent4 = new JLabel("%");
		lblPorcent4.setBounds(217, 86, 21, 14);
		getContentPane().add(lblPorcent4);
		
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
			System.out.println("hola");
		}
	}
	
	private boolean validateInputs() {
		if(val.isNotEmpty(txt1to5.getText(), lbl1to5.getText()) && 
		   val.isNotEmpty(txt6to10.getText(), lbl6to10.getText()) && 
		   val.isNotEmpty(txt11to15.getText(), lbl11to15.getText()) && 
		   val.isNotEmpty(txt15orMore.getText(), lbl15orMore.getText()) && 
		   val.isNumber(txt1to5.getText(), lbl1to5.getText()) && 
		   val.isNumber(txt6to10.getText(), lbl6to10.getText()) && 
		   val.isNumber(txt11to15.getText(), lbl11to15.getText()) &&
		   val.isNumber(txt15orMore.getText(), lbl15orMore.getText())) { 
			return true;
		}else {
			return false;
		}
	}

}
