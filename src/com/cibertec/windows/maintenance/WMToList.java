package com.cibertec.windows.maintenance;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class WMToList extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scpTextArea;
	private JTextArea txtAreaResult;
	private JButton btnClose;
	private JButton btnToList;

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
			WMToList dialog = new WMToList();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WMToList() {
		setTitle("Listado de lavadoras");
		setBounds(100, 100, 450, 335);
		getContentPane().setLayout(null);
		
		scpTextArea = new JScrollPane();
		scpTextArea.setBounds(10, 11, 414, 238);
		getContentPane().add(scpTextArea);
		
		txtAreaResult = new JTextArea();
		scpTextArea.setViewportView(txtAreaResult);
		
		btnClose = new JButton("Cerrar");
		btnClose.addActionListener(this);
		btnClose.setBounds(118, 260, 89, 23);
		getContentPane().add(btnClose);
		
		btnToList = new JButton("Listar");
		btnToList.setBounds(227, 260, 89, 23);
		getContentPane().add(btnToList);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClose) {
			actionPerformedBtnClose(e);
		}
	}
	protected void actionPerformedBtnClose(ActionEvent e) {
	}
}
