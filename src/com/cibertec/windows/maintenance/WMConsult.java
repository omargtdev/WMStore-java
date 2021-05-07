package com.cibertec.windows.maintenance;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class WMConsult extends JDialog {

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
			WMConsult dialog = new WMConsult();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WMConsult() {
		setTitle("Consultar lavadora");
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
		cboModel.setModel(new DefaultComboBoxModel<String>(new String[] {"LG TS1604NW", "MABE LMA72200WDBB1", "SAMSUNG WA17T6260BW", "WHIRLPOOL WWI16BSBLA", "WINIA WLA-195ECG"}));
		cboModel.setBounds(117, 7, 176, 22);
		getContentPane().add(cboModel);
		
		txtPrice = new JTextField();
		txtPrice.setEditable(false);
		txtPrice.setBounds(117, 33, 176, 20);
		getContentPane().add(txtPrice);
		txtPrice.setColumns(10);
		
		txtWidth = new JTextField();
		txtWidth.setEditable(false);
		txtWidth.setBounds(117, 58, 176, 20);
		getContentPane().add(txtWidth);
		txtWidth.setColumns(10);
		
		txtHeight = new JTextField();
		txtHeight.setEditable(false);
		txtHeight.setBounds(117, 83, 176, 20);
		getContentPane().add(txtHeight);
		txtHeight.setColumns(10);
		
		txtDepth = new JTextField();
		txtDepth.setEditable(false);
		txtDepth.setBounds(117, 108, 176, 20);
		getContentPane().add(txtDepth);
		txtDepth.setColumns(10);
		
		txtCapacity = new JTextField();
		txtCapacity.setEditable(false);
		txtCapacity.setBounds(117, 133, 176, 20);
		getContentPane().add(txtCapacity);
		txtCapacity.setColumns(10);
		
		btnClose = new JButton("Cerrar");
		btnClose.setBounds(335, 7, 89, 23); getContentPane().add(btnClose);
	}
}