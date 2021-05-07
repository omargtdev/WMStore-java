package com.cibertec.windows.maintenance;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

import com.cibertec.operations.Data;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WMModify extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblModel;
	private JLabel lblPrice;
	private JLabel lblWidth;
	private JLabel lblHeight;
	private JLabel lblDepth;
	private JLabel lblCapacity;
	private JComboBox<String> cboModel;
	private JTextField txtPrice;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private JTextField txtDepth;
	private JTextField txtCapacity;
	private JButton btnClose;
	private JButton btnSave;

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
			WMModify dialog = new WMModify();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WMModify() {
		setTitle("Modificar lavadora");
		setBounds(100, 100, 450, 204);
		getContentPane().setLayout(null);
		
		lblModel = new JLabel("Modelo");
		lblModel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModel);
		
		lblPrice = new JLabel("Precio (S/.)");
		lblPrice.setBounds(10, 36, 60, 14);
		getContentPane().add(lblPrice);
		
		lblWidth = new JLabel("Ancho (cm)");
		lblWidth.setBounds(10, 61, 60, 14);
		getContentPane().add(lblWidth);
		
		lblHeight = new JLabel("Alto (cm)");
		lblHeight.setBounds(10, 86, 60, 14);
		getContentPane().add(lblHeight);
		
		lblDepth = new JLabel("Fondo (cm)");
		lblDepth.setBounds(10, 111, 60, 14);
		getContentPane().add(lblDepth);
		
		lblCapacity = new JLabel("Capacidad (kg)");
		lblCapacity.setBounds(10, 136, 85, 14);
		getContentPane().add(lblCapacity);
		
		cboModel = new JComboBox<String>();
		cboModel.setModel(new DefaultComboBoxModel<String>(new String[] {Data.modelo0, Data.modelo1, Data.modelo2, Data.modelo3, Data.modelo4}));
		cboModel.setBounds(117, 7, 176, 22);
		getContentPane().add(cboModel);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(117, 33, 176, 20);
		getContentPane().add(txtPrice);
		txtPrice.setColumns(10);
		
		txtWidth = new JTextField();
		txtWidth.setBounds(117, 58, 176, 20);
		getContentPane().add(txtWidth);
		txtWidth.setColumns(10);
		
		txtHeight = new JTextField();
		txtHeight.setBounds(117, 83, 176, 20);
		getContentPane().add(txtHeight);
		txtHeight.setColumns(10);
		
		txtDepth = new JTextField();
		txtDepth.setBounds(117, 108, 176, 20);
		getContentPane().add(txtDepth);
		txtDepth.setColumns(10);
		
		txtCapacity = new JTextField();
		txtCapacity.setBounds(117, 133, 176, 20);
		getContentPane().add(txtCapacity);
		txtCapacity.setColumns(10);
		
		btnClose = new JButton("Cerrar");
		btnClose.addActionListener(this);
		btnClose.setBounds(335, 7, 89, 23); getContentPane().add(btnClose); 

		btnSave = new JButton("Grabar");
		btnSave.setBounds(335, 32, 89, 23);
		getContentPane().add(btnSave);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClose) {
			actionPerformedBtnClose(e);
		}
	}
	protected void actionPerformedBtnClose(ActionEvent e) {
	}
}
